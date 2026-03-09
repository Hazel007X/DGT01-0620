package shape;

public class Circle {
	float radius = 0;
	final float PI = (float) (22.0/7);
	public Circle(float x) {
	radius = (float) (x/2.0);
	}
	public float area() {
		return PI*radius*radius;
	}
	public double perimeter() {
		return 2*PI*radius;
	}
}
