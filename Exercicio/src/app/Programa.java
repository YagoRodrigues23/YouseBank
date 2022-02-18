package app;

import java.util.Locale;
import java.util.Scanner;

import entities.Retangulo;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Retangulo rect = new Retangulo ();
		
		System.out.println("Digite largura e altura do retângulo:");
		
		rect.largura = sc.nextDouble();
		rect.altura = sc.nextDouble();
		
		System.out.printf("AREA = %.2f%n", rect.area());
		System.out.printf("PARANMETRO = %.2f%n", rect.paranmetro());
		System.out.printf("DIAGONAL = %.2f%n", rect.diagonal());
		
		
		sc.close();
		
				
		
		sc.close();
		
						

	}

}
