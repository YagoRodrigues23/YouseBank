public class Conta {
	
	//assosciaçao/atributiur uma referencia a o atibuto titular
    
	private double saldo = 100;
    private int agencia;
    private int numero;
    private Cliente titular;  
    private static int total;
    
    
    ///Contrutor/Parametros
    public Conta(int agencia, int numero) {
    	Conta.total++;
    	System.out.println("o total de contas é " + Conta.total);
        this.agencia = agencia;
    	this.numero = numero;
    	System.out.println("estou criando uma conta " + this.numero);
    	
    }
           
    public Conta(double d) {
		// TODO Auto-generated constructor stub
	}

	///metodo/Parametros Que recebe e devolve
    
    
    public void deposita(double valor) {
    	this.saldo += valor;
    	
    }
    
    public boolean saca(double valor) {
    	if(this.saldo >= valor ) {
    		this.saldo -= valor;
    		return true;    	
    	}else {
    		return false;
    	}
    }
    
    public boolean transfere(double valor, Conta destino) {
    	if(this.saldo >= valor) {
    		this.saldo -= valor;
    		destino.deposita(valor);
    		System.out.println("Saldo destino " + destino.getSaldo());
    		System.out.println("Saldo origem " + this.getSaldo());
    	}
    	
    	return false;    	
    }
    

  /// metodo que devolve o saldo, metedo que informa o saldo !!!
  /// metodo esconder informaçao
    
    public double getSaldo() {
    	return this.saldo;
    	
    }
   
    public int getNumero() {
    	return this.numero;
    }
    
  ///numero da esquerda Atributo/// numero da direita varieavel
    
    public void setNumero(int numero) {
    	if(numero <-0) {
    		System.out.println("nao pode valor <= 0");
    		return;
    		
    	}
    	this.numero = numero;  
    }
    
    public int getAgencia() {
		return this.agencia;
	}
    
    public void setAgencia(int agencia) {
    	if(agencia <= 0) {
    		System.out.println("nao pode vaor menor igual a 0");
    		return;
    		
    	}
		this.agencia = agencia;
	}
    
    
    public void setTitular(Cliente titular) {
		this.titular = titular;
	}
    
    public Cliente getTitular() {
		return titular;
	}
    
    // esse metodo #static é da classe
    
    public static int getTotal() {
    	return Conta.total;
    }
    
   
}
     

     
	



    





    



