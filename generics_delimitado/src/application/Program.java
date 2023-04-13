package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Product;
import services.CalculateService;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.UK);

		List<Product> prod = new ArrayList<>();
		String path = "//home//dan//Documentos//apenasTestesGit//store.csv";

		try (BufferedReader bfr = new BufferedReader(new FileReader(path))) {

			String prodCsv = bfr.readLine();
			while (prodCsv != null) {
				String[] fields = prodCsv.split(",");
				prod.add(new Product(fields[0], Double.parseDouble(fields[1])));
				prodCsv = bfr.readLine();
			}

			Product calc = CalculateService.max(prod);
			System.out.println("Most expensive:");
			System.out.println(calc);

		} catch (IOException ioe) {
			System.out.println("Error" + ioe.getMessage());
		}

	}

}
