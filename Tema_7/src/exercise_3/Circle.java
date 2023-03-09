package exercise_3;

public class Circle extends GeometricFigure {
	
	private final double PI = 3.1416;
	
	public double calculate_area(int x, int y) {
		
		this.x = x;
		this.y = y;
		
		return (x-y)*PI;
		
	}

}
