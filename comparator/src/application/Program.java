package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.UK);

		List<Product> prod = new ArrayList<>();
		prod.add(new Product("TV", 990.00));
		prod.add(new Product("Cel phone", 10000.0));

		prod.sort((prod1, prod2) -> prod1.getName().toUpperCase().compareTo(prod2.getName().toUpperCase()));
		
		for (Product prod2 : prod) {
			System.out.println(prod2);

		}
	}

}
