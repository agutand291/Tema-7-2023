package exercise_17;

public class Pez {
	protected String nombre;
	protected String especie;
	protected String zona;
	
	private static int numPeces = 0;
	
	Pez(String nombre, String especie, String zona) {
		this.nombre = nombre;
		this.especie = especie;
		this.zona = zona;
		numPeces++;
	}
	
	public static int getNumPeces() {
		return numPeces;
	}
	
}
