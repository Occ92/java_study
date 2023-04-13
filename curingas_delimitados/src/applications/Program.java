package applications;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.UK);

		List<Shape> shp = new ArrayList<>();
		shp.add(new Rectangle(2.0, 3.0));
		shp.add(new Circle(2.0));

		List<Circle> crl = new ArrayList<>();
		crl.add(new Circle(2.0));
		crl.add(new Circle(3.0));
		
		System.out.println("Total area:"+totalArea(crl));
	}
	
	public static double totalArea(List<? extends Shape> supTipoList) {
		double sum = 0.0;
		for (Shape shp2 : supTipoList) {
			sum += shp2.area();
		}
		return sum;
	}
}
