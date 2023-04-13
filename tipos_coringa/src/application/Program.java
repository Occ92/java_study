package application;

import java.util.Arrays;
import java.util.List;

public class Program {

	public static void main(String[] args) {

		List<Integer> integer = Arrays.asList(5, 2, 10);
		printList(integer);
	}

	public static void printList(List<?> pList) {
		for (Object obj : pList) {
			System.out.println(obj);
		}
	}
}
