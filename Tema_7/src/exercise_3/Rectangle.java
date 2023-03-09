package exercise_3;

public class Rectangle extends GeometricFigure {
	
	double calculate_area(int x, int y) {
		
		this.x = x;
		this.y = y;
		
		return x*y;
	}

}
