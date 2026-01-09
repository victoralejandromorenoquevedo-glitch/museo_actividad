package es.fplumara.dam1.museo;

import java.time.LocalDate;

abstract class Entrada {
	
	private String texto;
	
	private double precioBase;
	
	private LocalDate fecha;
	
	protected Entrada(String texto, double precioBase, LocalDate fecha) {
		super();
		this.texto = texto;
		this.precioBase = precioBase;
		this.fecha = fecha;
	}
	
	public String getTexto() {
		return texto;
	}
	
	public void setTexto(String texto) {
		this.texto = texto;
	}
	
	public double getPrecioBase() {
		return precioBase;
	}
	
	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}
	
	public LocalDate getFecha() {
		return fecha;
	}
	
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	
}