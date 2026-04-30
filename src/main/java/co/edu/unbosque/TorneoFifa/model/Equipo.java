package co.edu.unbosque.TorneoFifa.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
@Table(name = "equipos")
public class Equipo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String nombre;
	private String confederacion;
	private int golesFavor;
	private int golesContra;
	private int puntos;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "grupo_id")
	@JsonIgnore
	private Grupo grupo;

	@Column(name = "partidos_jugados")
	private Integer partidosJugados;

	@Column(name = "tarjetas_amarillas")
	private Integer tarjetasAmarillas;

	@Column(name = "tarjetas_rojas")
	private Integer tarjetasRojas;
	
	@Column(name = "eliminado")
	private Boolean eliminado = false;

	public Equipo() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getConfederacion() {
		return confederacion;
	}

	public void setConfederacion(String confederacion) {
		this.confederacion = confederacion;
	}

	public int getGolesFavor() {
		return golesFavor;
	}

	public void setGolesFavor(int golesFavor) {
		this.golesFavor = golesFavor;
	}

	public int getGolesContra() {
		return golesContra;
	}

	public void setGolesContra(int golesContra) {
		this.golesContra = golesContra;
	}

	public int getPuntos() {
		return puntos;
	}

	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}

	public Grupo getGrupo() {
		return grupo;
	}

	public void setGrupo(Grupo grupo) {
		this.grupo = grupo;
	}

	public Integer getPartidosJugados() {
		return partidosJugados;
	}

	public void setPartidosJugados(Integer partidosJugados) {
		this.partidosJugados = partidosJugados;
	}

	public Integer getTarjetasAmarillas() {
		return tarjetasAmarillas;
	}

	public void setTarjetasAmarillas(Integer tarjetasAmarillas) {
		this.tarjetasAmarillas = tarjetasAmarillas;
	}

	public Integer getTarjetasRojas() {
		return tarjetasRojas;
	}

	public void setTarjetasRojas(Integer tarjetasRojas) {
		this.tarjetasRojas = tarjetasRojas;
	}

	public Boolean getEliminado() {
		return eliminado;
	}

	public void setEliminado(Boolean eliminado) {
		this.eliminado = eliminado;
	}


	
}