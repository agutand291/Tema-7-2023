package exercise_14;

public class Planta implements Mercancia {
	
	private double precio;
	private String descripcion;
	private boolean regada;
	
	Planta() {
		this.setPrecio(1.0);
		this.setDescripcion("El cactus de El Jamón.");
		this.setRegada(false);
	}
	
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public void setRegada(boolean regada) {
		this.regada = regada;
	}

	@Override
	public double damePrecio() {
		return precio;
	}

	@Override
	public String dameDescripcion() {
		return descripcion;
	}

}
