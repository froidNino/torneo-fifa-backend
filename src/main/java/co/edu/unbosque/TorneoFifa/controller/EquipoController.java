package co.edu.unbosque.TorneoFifa.controller;

import co.edu.unbosque.TorneoFifa.dto.EquipoDTO;
import co.edu.unbosque.TorneoFifa.dto.ResultadoPartidoDTO;
import co.edu.unbosque.TorneoFifa.service.EquipoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Map;

import java.util.List;

@RestController
@RequestMapping("/api/v1/teams")
public class EquipoController {

	@Autowired
	private EquipoService equipoService;

	@GetMapping
	public ResponseEntity<List<EquipoDTO>> getAllEquipos() {
		List<EquipoDTO> lista = equipoService.obtenerTodosLosEquipos();
		return ResponseEntity.ok(lista);
	}

	@PostMapping
	public ResponseEntity<EquipoDTO> createEquipo(@RequestBody EquipoDTO nuevoEquipo) {
		EquipoDTO equipoGuardado = equipoService.guardarEquipo(nuevoEquipo);
		return ResponseEntity.status(HttpStatus.CREATED).body(equipoGuardado);
	}

	@PutMapping("/{teamId}")
	public ResponseEntity<EquipoDTO> updateEquipo(@PathVariable Long teamId, @RequestBody EquipoDTO equipoActualizado) {
		EquipoDTO actualizado = equipoService.actualizarEquipo(teamId, equipoActualizado);
		if (actualizado != null) {
			return ResponseEntity.ok(actualizado);
		}
		return ResponseEntity.notFound().build();
	}

	@DeleteMapping("/{teamId}")
	public ResponseEntity<Void> deleteEquipo(@PathVariable Long teamId) {
		equipoService.eliminarEquipo(teamId);
		return ResponseEntity.noContent().build();
	}

	@PostMapping("/match")
	public ResponseEntity<?> registrarPartido(@RequestBody ResultadoPartidoDTO resultado) {
		try {
			equipoService.registrarResultadoPartido(resultado);
			return ResponseEntity.ok(Map.of("mensaje", "Marcador registrado y puntos actualizados correctamente"));
		} catch (RuntimeException e) {
			return ResponseEntity.badRequest().body(Map.of("mensaje", e.getMessage()));
		}
	}
}