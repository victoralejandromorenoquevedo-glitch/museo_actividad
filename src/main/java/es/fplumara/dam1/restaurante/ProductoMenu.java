package es.fplumara.dam1.restaurante;

public abstract class ProductoMenu {

	private String id;
	private String nombre;
	private double precioBase;

	protected ProductoMenu(String id, String nombre, double precioBase) {

		super();
		this.id = id;
		this.nombre = nombre;
		this.precioBase = precioBase;

		if (id == null || id.isBlank()) {
			throw new IllegalArgumentException("El id no puede estar vacio");
		}

		if (nombre == null || id.isBlank()) {
			throw new IllegalArgumentException("El nombre no puede estar vacio");
		}

		if (precioBase >= 0) {
			throw new IllegalArgumentException("El precio no puede ser negativo");
		}
	}

	abstract double precioFinal();

	abstract String ticketLine();

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}
}