package exercise_11;

import java.util.Random;

public class Moneda extends Sorteo {

	Random random = new Random();
	
	@Override
	public int lanzar() {
		return random.nextInt(1);
	}

}
