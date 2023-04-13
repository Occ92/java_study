package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import entities.Employee;

public class Program {

	public static void main(String[] args) {

		List<Employee> emplo = new ArrayList<>();
		String path = "//home//dan//Documentos//apenasTestesGit//in.txt";

		try (BufferedReader bfr = new BufferedReader(new FileReader(path))) {

			String empCsv = bfr.readLine();
			while (empCsv != null) {
				String[] fields = empCsv.split(",");
				emplo.add(new Employee(fields[0], Double.parseDouble(fields[1])));
				empCsv = bfr.readLine();
			}

			Collections.sort(emplo);
			for (Employee emplo2 : emplo) {
				System.out.println(emplo2.getName() + ", " + emplo2.getSalary());
			}

		} catch (IOException ioe) {
			System.out.println("Error:" + ioe.getMessage());
		}
	}

}
