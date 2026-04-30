package co.edu.unbosque.TorneoFifa.controller;

import co.edu.unbosque.TorneoFifa.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/auth")

public class AuthController {

	@Autowired
	private AuthService authService;

	@PostMapping("/login")
	public ResponseEntity<?> login(@RequestBody Map<String, String> credentials) {
		try {

			String username = credentials.get("username");
			String password = credentials.get("password");
			String respuesta = authService.login(username, password);

			return ResponseEntity.ok(Map.of("mensaje", respuesta));

		} catch (RuntimeException e) {

			return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(Map.of("error", e.getMessage()));
		}
	}
}