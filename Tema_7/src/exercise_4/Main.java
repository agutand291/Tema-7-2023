package exercise_4;

public class Main {

	public static void main(String[] args) {
		
		new Main().show();
		
	}
	
	public void show() {
		
		int x = 200;
		
		Empleado empleado = new Empleado();
		Encargado encargado = new Encargado();
		
		double emSalary = empleado.calculateSalary(x);
		double enSalary = encargado.calculateSalary(x);
		
		System.out.printf("Salario del empleado: %.2f \nSalario del encargado: %.2f", emSalary, enSalary);
		
	}

}
