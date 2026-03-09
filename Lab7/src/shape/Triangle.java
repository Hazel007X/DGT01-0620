
package shape;

public class Triangle {
	float height = 0, base = 0;
	
	public Triangle(float x) {
		height = x;
		base = x;
	}
	public float area() {
		return (float) 1/2*base*height;
	}
	
	public double perimeter() {
		double A, B, C;
	
	A = base/2.0;
	B = height;
	C = Math.sqrt((Math.pow(A,2)+Math.pow(B,2)));
	
	return C + C + base;
	}
}
