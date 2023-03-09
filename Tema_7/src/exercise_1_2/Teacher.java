package exercise_1_2;

public class Teacher extends Person {

	private double salary;

	Teacher() {
		this.setSalary(0);
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return super.toString().concat(" salary: " + salary);
	}

}
