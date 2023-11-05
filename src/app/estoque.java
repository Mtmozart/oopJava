package app;

import java.util.Locale;
import java.util.Scanner;

import entities.Products;

public class estoque {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Products product = new Products();
		
		System.out.println("Enter para começar.");
		System.out.print("Nome: ");
		product.name = sc.nextLine();
		
		System.out.print("preço: ");
		product.price = sc.nextDouble();
		System.out.print("Estoque: ");
		product.quantity = sc.nextInt();
		
		System.out.println();
		System.out.println("Dados: " + product);
		
		System.out.println("Enter para adicionar ao estoque: ");
		int quantity = sc.nextInt();
		product.addProdcuts(quantity);
		
		System.out.println();
		System.out.println("Dados: " + product);
		System.out.println();
		System.out.println("Enter para remover do estoque: ");
		quantity =  sc.nextInt();
		product.removeProducts(quantity);
		System.out.println("Dados: " + product);
		
		
				sc.close();

	}

}
