package exercise_16;

public class PezAguaDulce extends Pez {
	
	private boolean acuario;
	
	PezAguaDulce(String nombre, String especie, String zona, boolean acuario) {
		super(nombre, especie, zona);
		this.acuario = acuario;
	}

	@Override
	public String toString() {
		return "PezAguaDulce [acuario=" + acuario + ", nombre=" + nombre + ", especie=" + especie + ", zona=" + zona
				+ "]";
	}

}
