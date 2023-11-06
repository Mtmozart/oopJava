package app;

import java.util.Locale;
import java.util.Scanner;

import entities.CurrencyConverter;

public class Dollar {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is the dollar price?");
		CurrencyConverter.valueDollar = sc.nextDouble();
		System.out.println("How many dollars will be bought?");
		CurrencyConverter.totalDollar = sc.nextDouble();
		
		double total = CurrencyConverter.conveter();
		
		System.out.printf("Amount to be paid in reais = %.2f%n", total);
	}

}
