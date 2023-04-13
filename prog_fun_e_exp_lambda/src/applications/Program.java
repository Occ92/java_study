package applications;

import java.util.ArrayList;
import java.util.List;

import entities.Product;

public class Program {

	public static int compareProduct(Product prod1, Product prod2) {
		return prod1.getPrice().compareTo(prod2.getPrice());
	}

	public static void main(String[] args) {

		List<Product> prod = new ArrayList<>();
		prod.add(new Product("Freezer", 2000.0));
		prod.add(new Product("Lamp", 100.0));
		prod.add(new Product("Mouse", 910.0));
		prod.add(new Product("Keyboard", 600.0));
		prod.add(new Product("Cadernete", 200.0));
		prod.add(new Product("Cel phone", 1000.0));
		prod.add(new Product("Tv", 900.0));

		prod.sort(Program::compareProduct);

		prod.forEach(System.out::println);
	}

}
