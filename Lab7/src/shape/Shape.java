package shape;
import java.util.Scanner;
abstract public class Shape {
	
	abstract public float area();
	abstract public double perimeter();
	
	public static void main(String[] args) {
		float x = 0;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the x value: ");
		x = input.nextFloat();
		
		Square sq = new Square(x);
		Circle cc = new Circle(x);
		Triangle tag = new Triangle(x);

		System.out.printf("Square: area = %.2f, perimeter = %.2f\n", sq.area(), sq.perimeter());
		System.out.printf("Circle: area = %.2f, perimeter = %.2f\n", cc.area(), cc.perimeter());
		System.out.printf("Triangle: area = %.2f, perimeter = %.2f\n", tag.area(), tag.perimeter());
	}
}