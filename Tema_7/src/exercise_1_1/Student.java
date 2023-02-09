package exercise_1_1;

public class Student extends Person {

	private boolean repeater;

	Student() {
		this.setRepetidor(false);
	}

	public boolean isRepetidor() {
		return repeater;
	}

	public void setRepetidor(boolean repetidor) {
		this.repeater = repetidor;
	}

	@Override
	public String toString() {
		return super.toString().concat(" repeater: " + repeater);
	}

}
