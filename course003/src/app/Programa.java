package app;

import java.util.Locale;
import java.util.Scanner;
import entities.empregado;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		empregado emp = new empregado();
		System.out.print("Nome: ");
		emp.nome = sc.nextLine();
		System.out.print("Salario Bruto: ");
		emp.salarioBruto = sc.nextDouble();
		System.out.print("imposto: ");
		emp.imposto = sc.nextDouble();
		
		System.out.println();
		System.out.println("Empregado: " + emp);
		System.out.println();
		System.out.print("Qual percentual para aumentar o salário? ");	
		double porcentagem = sc.nextDouble();
		emp.aumentoSalarial(porcentagem);
		
		System.out.println();
		System.out.println("Atualizaçao de Dados: " + emp);		
		sc.close();
		

	}

}
