package exercise_11;

import java.util.Random;

public class Dado extends Sorteo {
	
	private Random random = new Random();

	@Override
	public int lanzar() {
		int res = random.nextInt(6) + 1;
		return res;
	}

}
