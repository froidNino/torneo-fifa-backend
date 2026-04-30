package co.edu.unbosque.TorneoFifa.model;

import jakarta.persistence.*;

@Entity
@Table(name = "partidos")
public class Partido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "local_id")
    private Equipo local;

    @ManyToOne
    @JoinColumn(name = "visitante_id")
    private Equipo visitante;

    private int golesLocal;
    private int golesVisitante;
    private int amarillasLocal;
    private int rojasLocal;
    private int amarillasVisitante;
    private int rojasVisitante;

    private String fase; 
    private boolean finalizado;

    public Partido() {}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Equipo getLocal() {
		return local;
	}

	public void setLocal(Equipo local) {
		this.local = local;
	}

	public Equipo getVisitante() {
		return visitante;
	}

	public void setVisitante(Equipo visitante) {
		this.visitante = visitante;
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

	public String getFase() {
		return fase;
	}

	public void setFase(String fase) {
		this.fase = fase;
	}

	public boolean isFinalizado() {
		return finalizado;
	}

	public void setFinalizado(boolean finalizado) {
		this.finalizado = finalizado;
	}

    
}