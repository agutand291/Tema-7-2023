package exercise_17;

public class Main {

	public static void main(String[] args) {
		
		new Main().show();

	}
	
	public void show() {
		
		PezAguaDulce pez = new PezAguaDulce("Carpa Comun", "Carpa", "Rios", true);
		
		System.out.printf("Numero de peces: %d", pez.getNumPeces());
		
	}

}
