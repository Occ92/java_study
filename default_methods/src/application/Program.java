package application;

import java.util.Locale;
import java.util.Scanner;

import services.InterestService;
import services.USAInterestService;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.UK);
		Scanner read = new Scanner(System.in);

		System.out.print("Quantia:");
		double amount = read.nextDouble();

		System.out.print("Meses:");
		int months = read.nextInt();

		InterestService is = new USAInterestService(1.0);

		double payment = is.payment(amount, months);

		System.out.println("Payment after " + months + " months");
		System.out.print(String.format("%.2f", payment));

		read.close();
	}

}
