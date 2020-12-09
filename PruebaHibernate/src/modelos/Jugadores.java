package modelos;

import java.io.Serializable;

public class Jugadores implements Serializable {
	
	public Jugadores() {}
	
	private int codigo;
	private String nombre;
	private String procedencia;
	private String altura;
	private String posicion;
	private int peso;
	private Equipos equipo;
	
	public Jugadores(int codigo, String nombre, String procedencia, String altura, String posicion, int peso, Equipos equipo) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.procedencia = procedencia;
		this.altura = altura;
		this.posicion = posicion;
		this.peso = peso;
		this.equipo = equipo;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getProcedencia() {
		return procedencia;
	}
	public void setProcedencia(String procedencia) {
		this.procedencia = procedencia;
	}
	public String getAltura() {
		return altura;
	}
	public void setAltura(String altura) {
		this.altura = altura;
	}
	public String getPosicion() {
		return posicion;
	}
	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}

	public Equipos getEquipo() {
		return equipo;
	}
	public void setEquipo(Equipos equipo) {
		this.equipo = equipo;
	}
	
	@Override
	public String toString() {
		
		return nombre+" - ("+ posicion+") - "+ procedencia +" - ("+peso +" lbs) - "+altura+" ft. in.";
		
	}

}
