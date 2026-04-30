package co.edu.unbosque.TorneoFifa.controller;

import co.edu.unbosque.TorneoFifa.model.Partido;
import co.edu.unbosque.TorneoFifa.service.PartidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@RestController
@RequestMapping("/api/v1/matches")
public class PartidoController {

	@Autowired
	private PartidoService partidoService;

	@PostMapping("/{matchId}")
	public ResponseEntity<Partido> registrarResultado(@PathVariable Long matchId, @RequestBody Partido datosResultado) {
		try {
			Partido partidoActualizado = partidoService.registrarResultado(matchId, datosResultado);
			return ResponseEntity.ok(partidoActualizado);
		} catch (RuntimeException e) {
			return ResponseEntity.badRequest().build();
		}
	}

	@GetMapping
	public ResponseEntity<List<Partido>> getAllPartidos() {
		return ResponseEntity.ok(partidoService.obtenerTodosLosPartidos());
	}
}