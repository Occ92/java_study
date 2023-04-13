package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		// Covariância
		/*List<Integer> integer = new ArrayList<>();
		integer.add(20);
		integer.add(32);

		List<? extends Number> listNumber = integer;
		// listNumber.add(66); erro de compilaçao

		// Contravariância
		List<Object> obj = new ArrayList<>();
		obj.add("Maria");
		obj.add("Abby");

		List<? super Number> supNumber = obj;
		supNumber.add(5.1);
		supNumber.add(24);
*/
		// Number number = supNumber.get(0); get não é permitido, put é permitido
		// Problema 2

		List<Integer> myInt = Arrays.asList(1, 254, 66);
		List<Object> myObj = new ArrayList<Object>();
		List<Double> myDouble = Arrays.asList(3.1, 23.11, 99.1);

		copy(myInt, myObj);
		printList(myObj);
		copy(myDouble, myObj);
		printList(myObj);

	}

	public static void copy(List<? extends Number> source, List<? super Number> destiny) {

		for (Number numbe : source) {
			destiny.add(numbe);
		}
	}

	public static void printList(List<?> obj) {
		for (Object obj2 : obj) {
			System.out.print(obj2 + " ");
		}
		System.out.println();
	}
}
