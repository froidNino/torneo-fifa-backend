package co.edu.unbosque.TorneoFifa.dto;

import java.util.List;

public class GrupoDTO {

	private String id;
	private List<EquipoDTO> equipos;

	public GrupoDTO() {
	}

	// Getters y Setters
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public List<EquipoDTO> getEquipos() {
		return equipos;
	}

	public void setEquipos(List<EquipoDTO> equipos) {
		this.equipos = equipos;
	}
}