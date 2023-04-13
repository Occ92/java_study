package set;

import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Set;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.UK);
		Set<String> lString = new LinkedHashSet<>();
		lString.add("Guarda-roupa");
		lString.add("Mesa");
		lString.add("Armário");

		System.out.println(lString.contains("Tapete"));

		for (String string3 : lString) {
			System.out.println(string3);
		}

	}

}
