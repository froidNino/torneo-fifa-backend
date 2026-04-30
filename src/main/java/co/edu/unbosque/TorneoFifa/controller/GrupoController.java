package co.edu.unbosque.TorneoFifa.controller;

import co.edu.unbosque.TorneoFifa.dto.GrupoDTO;
import co.edu.unbosque.TorneoFifa.service.GrupoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/groups")
public class GrupoController {

	@Autowired
	private GrupoService grupoService;

	@GetMapping("/{groupId}/table")
	public ResponseEntity<GrupoDTO> obtenerTablaPosiciones(@PathVariable String groupId) {
		GrupoDTO tabla = grupoService.obtenerTablaPosiciones(groupId);
		return ResponseEntity.ok(tabla);
	}

	@PostMapping("/{groupId}/teams/{equipoId}")
	public ResponseEntity<?> inscribirEquipo(@PathVariable String groupId, @PathVariable Long equipoId) {
		try {
			grupoService.inscribirEquipoEnGrupo(groupId, equipoId);
			return ResponseEntity.ok(Map.of("mensaje", "Equipo inscrito exitosamente en el grupo " + groupId));
		} catch (RuntimeException e) {
			return ResponseEntity.badRequest().body(Map.of("error", e.getMessage()));
		}
	}

	@GetMapping("/summary")
	public ResponseEntity<List<Map<String, Object>>> obtenerResumenGeneral() {
		List<Map<String, Object>> resumen = grupoService.obtenerResumenGeneral();
		return ResponseEntity.ok(resumen);
	}
}