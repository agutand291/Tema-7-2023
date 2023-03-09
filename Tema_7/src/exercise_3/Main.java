package exercise_3;

public class Main {

	public static void main(String[] args) {
		
		new Main().show();

	}
	
	public void show() {
		
		int x = 5;
		int y = 7;
		
		GeometricFigure circle = new Circle();
		GeometricFigure triangle = new Triangle();
		GeometricFigure rectangle = new Rectangle();
		
		double circleRes = circle.calculate_area(x, y);
		double triangleRes = triangle.calculate_area(x, y);
		double rectangleRes = rectangle.calculate_area(x, y);

		System.out.printf("Circle: %.2f \nTriangle: %.2f \nRectangle: %.2f", circleRes, triangleRes, rectangleRes);
		
		
	}

}
