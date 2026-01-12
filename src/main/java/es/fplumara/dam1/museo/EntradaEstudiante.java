package es.fplumara.dam1.museo;

import java.time.LocalDate;

public class EntradaEstudiante extends Entrada implements Descontable{
	
	private String centroEducativo;
	
	public String getCentroEducativo() {
		return centroEducativo;
	}

	public void setCentroEducativo(String centroEducativo) {
		this.centroEducativo = centroEducativo;
	}

	public EntradaEstudiante(String texto, double precioBase, LocalDate fecha, String centroEducativo) {
		super(texto, precioBase, fecha);
		// TODO Auto-generated constructor stub
		this.centroEducativo = centroEducativo;
	}

}