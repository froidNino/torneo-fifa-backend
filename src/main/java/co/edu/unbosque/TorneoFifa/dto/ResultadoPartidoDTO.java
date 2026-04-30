package co.edu.unbosque.TorneoFifa.dto;

public class ResultadoPartidoDTO {
	private Long idEquipoLocal;
	private Long idEquipoVisitante;
	private int golesLocal;
	private int golesVisitante;
	private int amarillasLocal;
	private int rojasLocal;
	private int amarillasVisitante;
	private int rojasVisitante;
	private boolean esEliminacionDirecta; 
	private Integer penalesLocal;         
	private Integer penalesVisitante;     


	// Getters y Setters
	public Long getIdEquipoLocal() {
		return idEquipoLocal;
	}

	  public void setIdEquipoLocal(Long idEquipoLocal) {
		this.idEquipoLocal = idEquipoLocal;
	}

	public Long getIdEquipoVisitante() {
		return idEquipoVisitante;
	}

	public void setIdEquipoVisitante(Long idEquipoVisitante) {
		this.idEquipoVisitante = idEquipoVisitante;
	}

	public int getGolesLocal() {
		return golesLocal;
	}

	public void setGolesLocal(int golesLocal) {
		this.golesLocal = golesLocal;
	}

	public int getGolesVisitante() {
		return golesVisitante;
	}

	public void setGolesVisitante(int golesVisitante) {
		this.golesVisitante = golesVisitante;
	}

	public int getAmarillasLocal() {
		return amarillasLocal;
	}

	public void setAmarillasLocal(int amarillasLocal) {
		this.amarillasLocal = amarillasLocal;
	}

	public int getRojasLocal() {
		return rojasLocal;
	}

	public void setRojasLocal(int rojasLocal) {
		this.rojasLocal = rojasLocal;
	}

	public int getAmarillasVisitante() {
		return amarillasVisitante;
	}

	public void setAmarillasVisitante(int amarillasVisitante) {
		this.amarillasVisitante = amarillasVisitante;
	}

	public int getRojasVisitante() {
		return rojasVisitante;
	}

	public void setRojasVisitante(int rojasVisitante) {
		this.rojasVisitante = rojasVisitante;
	}

	public boolean isEsEliminacionDirecta() {
		return esEliminacionDirecta;
	}

	public void setEsEliminacionDirecta(boolean esEliminacionDirecta) {
		this.esEliminacionDirecta = esEliminacionDirecta;
	}

	public Integer getPenalesLocal() {
		return penalesLocal;
	}

	public void setPenalesLocal(Integer penalesLocal) {
		this.penalesLocal = penalesLocal;
	}

	public Integer getPenalesVisitante() {
		return penalesVisitante;
	}

	public void setPenalesVisitante(Integer penalesVisitante) {
		this.penalesVisitante = penalesVisitante;
	}
	
	
}