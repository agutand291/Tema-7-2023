package exercise_11;

public class Main {

	public static void main(String[] args) {

		new Main().show();
		
	}
	
	public void show() {
		Dado dado = new Dado();
		Moneda moneda = new Moneda();
		
		int resOne = dado.lanzar();
		boolean resTwo = moneda.lanzar()%2==0 ? true : false;
		
		
		System.out.printf("Resultado del dado: %d \nResultado de la moneda: %b", resOne, resTwo);
		
		
	}

}
