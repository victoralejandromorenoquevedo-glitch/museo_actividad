package es.fplumara.dam1.restaurante;

public class Hamburguesa extends ProductoMenu implements Personalizable {

	private String tipoCarne;

	public Hamburguesa(String id, String nombre, double precioBase, String tipoCarne) {
		super(id, nombre, precioBase);
		this.tipoCarne = tipoCarne;
		if (tipoCarne == null || tipoCarne.isBlank()) {
			throw new IllegalArgumentException("El tipo no puede estar vacio");
		}
	}
	
	@Override
	public void anadirExtra(String nombreExtra, double coste) {
		if (nombreExtra == null || nombreExtra.isBlank()) {
			throw new IllegalArgumentException("El nombre no puede estar vacio");
		}
		if (coste <= 0) {
			throw new IllegalArgumentException("El precio tiene que ser mayor a 0");
		}
		// TODO Auto-generated method stub
	}

	@Override
	double precioFinal() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	String ticketLine() {
		// TODO Auto-generated method stub
		return null;
	}
}
