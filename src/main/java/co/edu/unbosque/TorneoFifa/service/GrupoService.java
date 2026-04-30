package co.edu.unbosque.TorneoFifa.service;

import co.edu.unbosque.TorneoFifa.dto.EquipoDTO;
import co.edu.unbosque.TorneoFifa.dto.GrupoDTO;
import co.edu.unbosque.TorneoFifa.model.Equipo;
import co.edu.unbosque.TorneoFifa.model.Grupo;
import co.edu.unbosque.TorneoFifa.repository.EquipoRepository;
import co.edu.unbosque.TorneoFifa.repository.GrupoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class GrupoService {

	@Autowired
	private GrupoRepository grupoRepository;

	@Autowired
	private EquipoRepository equipoRepository;

	private EquipoDTO mapearEquipoADTO(Equipo equipo) {
		EquipoDTO dto = new EquipoDTO();
		dto.setId(equipo.getId());
		dto.setNombre(equipo.getNombre());
		dto.setConfederacion(equipo.getConfederacion());
		dto.setPuntos(equipo.getPuntos());
		dto.setGolesFavor(equipo.getGolesFavor());
		dto.setGolesContra(equipo.getGolesContra());
		return dto;
	}

	private GrupoDTO mapearGrupoADTO(Grupo grupo) {
		GrupoDTO dto = new GrupoDTO();
		dto.setId(grupo.getId());

		List<EquipoDTO> equiposDTO = new ArrayList<>();
		for (Equipo equipo : grupo.getEquipos()) {
			equiposDTO.add(mapearEquipoADTO(equipo));
		}

		equiposDTO.sort((e1, e2) -> {
			if (e1.getPuntos() != e2.getPuntos()) {
				return Integer.compare(e2.getPuntos(), e1.getPuntos());
			}
			int difGoles1 = e1.getGolesFavor() - e1.getGolesContra();
			int difGoles2 = e2.getGolesFavor() - e2.getGolesContra();
			return Integer.compare(difGoles2, difGoles1);
		});

		dto.setEquipos(equiposDTO);
		return dto;
	}

	public GrupoDTO obtenerTablaPosiciones(String groupId) {
		Grupo grupo = grupoRepository.findById(groupId).orElseThrow(() -> new RuntimeException("Grupo no encontrado"));

		return mapearGrupoADTO(grupo);
	}

	public Grupo inscribirEquipoEnGrupo(String groupId, Long equipoId) {
		Optional<Grupo> grupoOpt = grupoRepository.findById(groupId);
		Optional<Equipo> equipoOpt = equipoRepository.findById(equipoId);

		if (grupoOpt.isEmpty() || equipoOpt.isEmpty()) {
			throw new RuntimeException("El equipo o el grupo no existe.");
		}

		Grupo grupo = grupoOpt.get();
		Equipo nuevoEquipo = equipoOpt.get();

		if (grupo.getEquipos().size() >= 4) {
			throw new RuntimeException("El grupo ya está lleno (máximo 4 equipos).");
		}

		long equiposMismaConfederacion = grupo.getEquipos().stream()
				.filter(e -> e.getConfederacion().equalsIgnoreCase(nuevoEquipo.getConfederacion())).count();

		if (nuevoEquipo.getConfederacion().equalsIgnoreCase("UEFA")) {
			if (equiposMismaConfederacion >= 2) {
				throw new RuntimeException("Límite de confederación excedido para este grupo.");
			}
		} else {
			if (equiposMismaConfederacion >= 1) {
				throw new RuntimeException("Límite de confederación excedido para este grupo.");
			}
		}

		nuevoEquipo.setGrupo(grupo);
		grupo.getEquipos().add(nuevoEquipo);
		return grupoRepository.save(grupo);
	}

	public List<Map<String, Object>> obtenerResumenGeneral() {
		return grupoRepository.findAll().stream().map(g -> {
			Map<String, Object> resumen = new HashMap<>();
			resumen.put("grupo", g.getId());

			List<Equipo> equiposOrdenados = new ArrayList<>(g.getEquipos());
			equiposOrdenados.sort((e1, e2) -> {
				if (e1.getPuntos() != e2.getPuntos()) {
					return Integer.compare(e2.getPuntos(), e1.getPuntos());
				}
				int difGoles1 = e1.getGolesFavor() - e1.getGolesContra();
				int difGoles2 = e2.getGolesFavor() - e2.getGolesContra();
				return Integer.compare(difGoles2, difGoles1);
			});

			List<Map<String, String>> equiposParaFrontend = new ArrayList<>();
			for (Equipo equipo : equiposOrdenados) {
				Map<String, String> equipoMap = new HashMap<>();
				equipoMap.put("nombre", equipo.getNombre());
				equiposParaFrontend.add(equipoMap);
			}
			resumen.put("equipos", equiposParaFrontend);
			
			return resumen;
		}).collect(Collectors.toList());
	}
}