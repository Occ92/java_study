package entities;

import static java.lang.Math.PI;

public class Circle implements Shape {

	private Double radius;

	public Circle(Double radius) {
		this.radius = radius;
	}

	public Double getRadius() {
		return radius;
	}

	public void setRadius(Double radius) {
		this.radius = radius;
	}

	@Override
	public double area() {
		return PI * radius * radius;
	}

}
