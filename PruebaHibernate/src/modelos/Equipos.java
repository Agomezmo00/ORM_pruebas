package modelos;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

public class Equipos implements Serializable {
	
	public String nombre;
	public String conferencia;
	public String ciudad;
	public String division;
	public Set<Jugadores> jugadores;
	
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
		
		return "Nombre: "+nombre+" Conferencia: "+conferencia+" Ciudad: "+ciudad+" División:"+division;
	}
	

}
