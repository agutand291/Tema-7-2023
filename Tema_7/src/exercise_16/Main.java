package exercise_16;

public class Main {

	public static void main(String[] args) {
		
		new Main().show();

	}
	
	public void show() {
		
		PezAguaDulce pez = new PezAguaDulce("Carpa Comun", "Carpa", "Rios", true);
		
		System.out.println(pez.toString());
		
	}

}
