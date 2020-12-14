package modelos;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;

import utiles.HibernateUtil;

public class Equipos implements Serializable {
	
	public String nombre;
	public String conferencia;
	public String ciudad;
	public String division;
	public Set<Jugadores> jugadores;
	public Set<Partidos> partidosLocal;
	public Set<Partidos> partidosVisitante;
	
	public Set<Partidos> getPartidosVisitante() {
		return partidosVisitante;
	}


	public void setPartidosVisitante(Set<Partidos> partidosVisitante) {
		this.partidosVisitante = partidosVisitante;
	}


	public Set<Partidos> getPartidosLocal() {
		return partidosLocal;
	}


	public void setPartidosLocal(Set<Partidos> partidosLocal) {
		this.partidosLocal = partidosLocal;
	}


	public Set<Jugadores> getJugadores() {
		return jugadores;
	}


	public void setJugadores(Set<Jugadores> jugadores) {
		this.jugadores = jugadores;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getCiudad() {
		return ciudad;
	}


	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}


	public String getConferencia() {
		return conferencia;
	}


	public void setConferencia(String conferencia) {
		this.conferencia = conferencia;
	}


	public String getDivision() {
		return division;
	}


	public void setDivision(String division) {
		this.division = division;
	}


	public Equipos() {}
	
	
	public Equipos(String nombre, String ciudad, String conferencia, String division) {
		this.nombre = nombre;
		this.ciudad = ciudad;
		this.conferencia = conferencia;
		this.division = division;
	}
	
	
	@Override
	public String toString() {
		
		return "Nombre: "+nombre+" Conferencia: "+conferencia+" Ciudad: "+ciudad+" Divisi�n:"+division;
	}
	
	public Equipos datosEquipo(String nombre) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.createQuery("FROM equipos WHERE nombre ="+nombre);
		return this;
		
	}

}
