package app;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
	
		
		Triangle x, y;
		x = new Triangle();
		y = new Triangle();
		
		System.out.println("Digite os lados do triângulo x");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Digit os lados do triângulo x");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
			
			double areaX = x.area();	
			double areaY = y.area(); 
					
			System.out.println("Area X " + areaX);
			System.out.println("Area Y " + areaY);
			
			if(areaX < areaY) {
				System.out.println("X é maior");
			}else {
				System.out.println("Y é maior");
			}
			
		
		sc.close();
		
	}

}
