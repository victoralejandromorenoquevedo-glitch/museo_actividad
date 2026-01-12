package es.fplumara.dam1.museo;

import java.time.LocalDate;

public class EntradaVIP extends Entrada implements ConAccesoRapido, Descontable{
	
	private String zonaVIP;
	private int nivelPrioridad;
	
	public String getZonaVIP() {
		return zonaVIP;
	}
	
	public void setZonaVIP(String zonaVIP) {
		this.zonaVIP = zonaVIP;
	}
	
	public int getNivelPrioridad() {
		return nivelPrioridad;
	}
	
	public void setNivelPrioridad(int nivelPrioridad) {
		this.nivelPrioridad = nivelPrioridad;
	}
	
	protected EntradaVIP(String texto, double precioBase, LocalDate fecha) {
		super(texto, precioBase, fecha);
		// TODO Auto-generated constructor stub
	}
	
	
}
