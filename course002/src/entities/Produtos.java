package entities;

public class Produtos {
	
	private String nome;
	private double preco;
	private int quantidade;
	
	public Produtos () {
		
	}
	
	public Produtos (String nome, Double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	
	public Produtos (String nome, Double preco ) {
		this.nome = nome;
		this.preco = preco;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String setNome(String nome){
		return nome;
	}
	
    public double getPreco() {
    	return preco;
    }
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public int getQuantidade() {
		return quantidade;		
	}
	
	public double totalValorEmEstoque () {
		return preco * quantidade; 
	}
	
	public void entradaEstoque (int quantidade) {
		this.quantidade += quantidade;
		
	}
	public void saidaEstoque (int quantidade) {
		this.quantidade -= quantidade;

	}
	
	public String toString() {
		return nome
		   + ", $"
		   + String.format("%.2f", preco)
		   + ", "
		   + quantidade
		   + " unidades, Total: $" 
		   + String.format("%.2f", totalValorEmEstoque());
	}

	
		
	}


