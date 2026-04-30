package co.edu.unbosque.TorneoFifa.service;

import co.edu.unbosque.TorneoFifa.model.Equipo;
import co.edu.unbosque.TorneoFifa.model.Partido;
import co.edu.unbosque.TorneoFifa.repository.EquipoRepository;
import co.edu.unbosque.TorneoFifa.repository.PartidoRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PartidoService {

	@Autowired
	private PartidoRepository partidoRepository;

	@Autowired
	private EquipoRepository equipoRepository;

	public Partido registrarResultado(Long partidoId, Partido datosResultado) {
		Partido partido = partidoRepository.findById(partidoId)
				.orElseThrow(() -> new RuntimeException("Partido no encontrado"));

		partido.setGolesLocal(datosResultado.getGolesLocal());
		partido.setGolesVisitante(datosResultado.getGolesVisitante());
		partido.setAmarillasLocal(datosResultado.getAmarillasLocal());
		partido.setRojasLocal(datosResultado.getRojasLocal());
		partido.setFinalizado(true);

		if (partido.getFase().equalsIgnoreCase("GRUPOS")) {
			actualizarEstadisticasEquipo(partido.getLocal(), partido.getGolesLocal(), partido.getGolesVisitante(),
					partido.getAmarillasLocal(), partido.getRojasLocal());
			actualizarEstadisticasEquipo(partido.getVisitante(), partido.getGolesVisitante(), partido.getGolesLocal(),
					partido.getAmarillasVisitante(), partido.getRojasVisitante());
		}

		return partidoRepository.save(partido);
	}

	private void actualizarEstadisticasEquipo(Equipo equipo, int gf, int gc, int amarillas, int rojas) {
		equipo.setGolesFavor(equipo.getGolesFavor() + gf);
		equipo.setGolesContra(equipo.getGolesContra() + gc);
		equipo.setTarjetasAmarillas(equipo.getTarjetasAmarillas() + amarillas);
		equipo.setTarjetasRojas(equipo.getTarjetasRojas() + rojas);

		if (gf > gc)
			equipo.setPuntos(equipo.getPuntos() + 3);
		else if (gf == gc)
			equipo.setPuntos(equipo.getPuntos() + 1);

		equipoRepository.save(equipo);
	}

	public List<Partido> obtenerTodosLosPartidos() {
		return partidoRepository.findAll();
	}
}