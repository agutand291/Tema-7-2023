package exercise_4;

public class Encargado extends Empleado {
	
	@Override
	double calculateSalary(int salary) {
		salary = (int) (salary+salary*0.1);
		return salary;
	}

}
