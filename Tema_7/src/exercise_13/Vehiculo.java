package exercise_13;

public abstract class Vehiculo {
	
	private int peso;
	
	public final void setPeso(int p) {
		peso = p;
	}
	
	public abstract int getVelocidadActual();

}
