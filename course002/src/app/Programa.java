package app;

import java.util.Locale;
import java.util.Scanner;

import entities.Produtos;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Produtos p = new Produtos();
		
		
		System.out.println("Entrada dados do produto: ");
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("Pre�o: ");
		double preco = sc.nextDouble();
		Produtos produtos = new Produtos(nome, preco);
		
		produtos.setNome("Computador");
		System.out.println("Atualiza��o Nome " + produtos.getNome());
		produtos.setPreco(1200.00);
		System.out.println("Atualiza��o de pre�o: " + produtos.getPreco());
		
				
		System.out.println();
		System.out.println("Dados do produto : " + produtos);
		
		System.out.println();
		System.out.print("Digite o n�mero de produtos a serem adicionados em estoque: ");
		int quantidade = sc.nextInt();
		produtos.entradaEstoque(quantidade);
		
		System.out.println();
		System.out.print("Atualiza��o de dados: " + produtos);
		
		System.out.println();
		System.out.print("Digite o n�mero de produtos a serem removidos do estoque: ");
		quantidade = sc.nextInt();
		produtos.saidaEstoque(quantidade);
		
		System.out.println();
		System.out.println("Atualiz��o dados: " + produtos);
		
		    
		sc.close();

	}

	private static String getPreco() {
		// TODO Auto-generated method stub
		return null;
	}

}
