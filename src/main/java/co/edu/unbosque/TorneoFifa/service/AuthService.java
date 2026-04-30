package co.edu.unbosque.TorneoFifa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.unbosque.TorneoFifa.repository.UsuarioRepository;

@Service
public class AuthService {

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	public String login(String username, String password) {
		return usuarioRepository.findByUsername(username).filter(u -> u.getPassword().equals(password))
				.map(u -> "Login exitoso. Rol: " + u.getRol())
				.orElseThrow(() -> new RuntimeException("Credenciales incorrectas"));
	}
} 