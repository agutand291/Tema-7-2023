package exercise_14;

public class Jarron implements Mercancia{

	private double precio;
	private String descripcion;
	private boolean fragil;
	
	Jarron() {
		this.setPrecio(1.0);
		this.setDescripcion("El Jarroncito");
		this.setFragil(true);
	}
	
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public void setFragil(boolean fragil) {
		this.fragil = fragil;
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
