package exercise_14;

public class Main {

	public static void main(String[] args) {

		new Main().jardineria();

	}
	
	public static void dameDatos(Mercancia producto) {
		
	}
	
	public void jardineria() {
		
		Planta cactus = new Planta();
		Planta palmera = new Planta();
		
		Jarron jarron = new Jarron();
		Jarron cuenco = new Jarron();
		
		palmera.setDescripcion("Palmera de pequeño tamaño.");
		palmera.setPrecio(15.3);
		palmera.setRegada(true);
		
		cuenco.setDescripcion("Cuenco :)");
		cuenco.setPrecio(3.44);
		cuenco.setFragil(false);
		
		
	}

}
