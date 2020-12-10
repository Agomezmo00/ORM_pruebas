package modelos;

import java.io.Serializable;

public class Partidos implements Serializable {
	
	private int codigo;
	private int puntos_local;
	private int puntos_visitante;
	private String temporada;
	private Equipos local;
	private Equipos visitante;
	
	
	public Partidos() {
	}

	public Partidos(int codigo, int puntos_local, int puntos_visitante, String temporada, Equipos local,
			Equipos visitante) {
		super();
		this.codigo = codigo;
		this.puntos_local = puntos_local;
		this.puntos_visitante = puntos_visitante;
		this.temporada = temporada;
		this.local = local;
		this.visitante = visitante;
	}
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public int getPuntos_local() {
		return puntos_local;
	}
	public void setPuntos_local(int puntos_local) {
		this.puntos_local = puntos_local;
	}
	public int getPuntos_visitante() {
		return puntos_visitante;
	}
	public void setPuntos_visitante(int puntos_visitante) {
		this.puntos_visitante = puntos_visitante;
	}
	public String getTemporada() {
		return temporada;
	}
	public void setTemporada(String temporada) {
		this.temporada = temporada;
	}
	public Equipos getLocal() {
		return local;
	}
	public void setLocal(Equipos local) {
		this.local = local;
	}
	public Equipos getVisitante() {
		return visitante;
	}
	public void setVisitante(Equipos visitante) {
		this.visitante = visitante;
	}
	
	@Override
	public String toString() {
		return "Temporada: "+temporada+" "+local.getNombre()+" "+puntos_local+" - "+puntos_visitante+" "+visitante.getNombre();
	}
	
		
	
}
