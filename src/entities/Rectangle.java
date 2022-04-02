package entities;

import java.util.Locale;

import entities.Rectangle;

public class Rectangle {
	public double width;
	public double height;

	public double area() {
		return width * height;
	}

	public double perimeter() {
		return 2 * (width + height);
	}

	public double diagonal() {
		return Math.sqrt(width * width + height * height);
	}

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Rectangle rect = new Rectangle();

		System.out.println("Enter rectangle width and height:");
		rect.width = (3.0);
		rect.height = (4.0);
		System.out.printf("AREA = %.2f%n", rect.area());
		System.out.printf("PERIMETER = %.2f%n", rect.perimeter());

	}
}