package co.edu.unbosque.TorneoFifa.service;

import co.edu.unbosque.TorneoFifa.dto.EquipoDTO;
import co.edu.unbosque.TorneoFifa.dto.ResultadoPartidoDTO;
import co.edu.unbosque.TorneoFifa.model.Equipo;
import co.edu.unbosque.TorneoFifa.repository.EquipoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EquipoService {

	@Autowired
	private EquipoRepository equipoRepository;

	// MAPPER
	private EquipoDTO mapearEquipoADTO(Equipo equipo) {
		EquipoDTO dto = new EquipoDTO();
		dto.setId(equipo.getId());
		dto.setNombre(equipo.getNombre());
		dto.setConfederacion(equipo.getConfederacion());
		dto.setPuntos(equipo.getPuntos());
		dto.setGolesFavor(equipo.getGolesFavor());
		dto.setGolesContra(equipo.getGolesContra());
		dto.setPartidosJugados(equipo.getPartidosJugados() != null ? equipo.getPartidosJugados() : 0);
		dto.setTarjetasAmarillas(equipo.getTarjetasAmarillas() != null ? equipo.getTarjetasAmarillas() : 0);
		dto.setTarjetasRojas(equipo.getTarjetasRojas() != null ? equipo.getTarjetasRojas() : 0);
		dto.setEliminado(equipo.getEliminado() != null ? equipo.getEliminado() : false);
		return dto;
	}

	// LÓGICA DE NEGOCIO CRUD
	public List<EquipoDTO> obtenerTodosLosEquipos() {
		return equipoRepository.findAll().stream().map(this::mapearEquipoADTO).collect(Collectors.toList());
	}

	public EquipoDTO guardarEquipo(EquipoDTO nuevoEquipoDTO) {
		Equipo equipo = new Equipo();
		equipo.setNombre(nuevoEquipoDTO.getNombre());
		equipo.setConfederacion(nuevoEquipoDTO.getConfederacion());
		equipo.setPuntos(0);
		equipo.setGolesFavor(0);
		equipo.setGolesContra(0);
		equipo.setPartidosJugados(0);
		equipo.setTarjetasAmarillas(0);
		equipo.setTarjetasRojas(0);
		equipo.setEliminado(false); // Inicia vivo
		Equipo equipoGuardado = equipoRepository.save(equipo);
		return mapearEquipoADTO(equipoGuardado);
	}

	public EquipoDTO actualizarEquipo(Long id, EquipoDTO equipoActualizado) {
		return equipoRepository.findById(id).map(equipoExistente -> {
			equipoExistente.setNombre(equipoActualizado.getNombre());
			equipoExistente.setConfederacion(equipoActualizado.getConfederacion());
			Equipo equipoGuardado = equipoRepository.save(equipoExistente);
			return mapearEquipoADTO(equipoGuardado);
		}).orElse(null);
	}

	public void eliminarEquipo(Long id) {
		equipoRepository.deleteById(id);
	}

	// LÓGICA DE PARTIDOS
	public void registrarResultadoPartido(ResultadoPartidoDTO resultado) {
		Equipo local = equipoRepository.findById(resultado.getIdEquipoLocal())
				.orElseThrow(() -> new RuntimeException("Equipo local no encontrado"));
		Equipo visitante = equipoRepository.findById(resultado.getIdEquipoVisitante())
				.orElseThrow(() -> new RuntimeException("Equipo visitante no encontrado"));

		// 1. VALIDACIÓN BASE: No jugar contra sí mismo
		if (local.getId().equals(visitante.getId())) {
			throw new RuntimeException(local.getNombre() + " no puede jugar contra sí mismo.");
		}

		// 2. LÓGICA SEGÚN FASE DEL TORNEO
		if (!resultado.isEsEliminacionDirecta()) {
			// --- FASE DE GRUPOS ---
			if (local.getGrupo() == null || visitante.getGrupo() == null
					|| !local.getGrupo().getId().equals(visitante.getGrupo().getId())) {
				throw new RuntimeException("En fase de grupos, los equipos deben pertenecer al mismo grupo.");
			}

			if (resultado.getGolesLocal() > resultado.getGolesVisitante()) {
				local.setPuntos(local.getPuntos() + 3);
			} else if (resultado.getGolesLocal() < resultado.getGolesVisitante()) {
				visitante.setPuntos(visitante.getPuntos() + 3);
			} else {
				local.setPuntos(local.getPuntos() + 1);
				visitante.setPuntos(visitante.getPuntos() + 1);
			}
		} else {
			// --- FASE DE ELIMINACIÓN DIRECTA ---
			boolean hayGanadorGoles = resultado.getGolesLocal() != resultado.getGolesVisitante();
			boolean hayGanadorPenales = resultado.getPenalesLocal() != null && resultado.getPenalesVisitante() != null
					&& !resultado.getPenalesLocal().equals(resultado.getPenalesVisitante());

			if (!hayGanadorGoles && !hayGanadorPenales) {
				throw new RuntimeException("En eliminación directa debe haber un ganador (goles o penales).");
			}

			// 💀 LA BANDERA DE LA MUERTE: Eliminamos al perdedor
			if (hayGanadorGoles) {
				if (resultado.getGolesLocal() > resultado.getGolesVisitante()) {
					visitante.setEliminado(true);
				} else {
					local.setEliminado(true);
				}
			} else {
				if (resultado.getPenalesLocal() > resultado.getPenalesVisitante()) {
					visitante.setEliminado(true);
				} else {
					local.setEliminado(true);
				}
			}
		}

		// 3. ACTUALIZACIÓN DE ESTADÍSTICAS GENERALES
		local.setPartidosJugados((local.getPartidosJugados() != null ? local.getPartidosJugados() : 0) + 1);
		visitante.setPartidosJugados((visitante.getPartidosJugados() != null ? visitante.getPartidosJugados() : 0) + 1);

		local.setGolesFavor(local.getGolesFavor() + resultado.getGolesLocal());
		local.setGolesContra(local.getGolesContra() + resultado.getGolesVisitante());
		visitante.setGolesFavor(visitante.getGolesFavor() + resultado.getGolesVisitante());
		visitante.setGolesContra(visitante.getGolesContra() + resultado.getGolesLocal());

		local.setTarjetasAmarillas((local.getTarjetasAmarillas() != null ? local.getTarjetasAmarillas() : 0)
				+ resultado.getAmarillasLocal());
		local.setTarjetasRojas(
				(local.getTarjetasRojas() != null ? local.getTarjetasRojas() : 0) + resultado.getRojasLocal());
		visitante.setTarjetasAmarillas((visitante.getTarjetasAmarillas() != null ? visitante.getTarjetasAmarillas() : 0)
				+ resultado.getAmarillasVisitante());
		visitante.setTarjetasRojas((visitante.getTarjetasRojas() != null ? visitante.getTarjetasRojas() : 0)
				+ resultado.getRojasVisitante());

		// 4. GUARDAR CAMBIOS
		equipoRepository.save(local);
		equipoRepository.save(visitante);
	}
}