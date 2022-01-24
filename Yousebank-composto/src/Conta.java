public class Conta {
	
	//assosciašao/atributiur uma referencia a o atibuto titular
    
	private double saldo = 100;
    int agencia;
    int numero;
    Cliente titular;
    
    
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
    	}
    	return false;    	
    }

  /// metodo que devolve o saldo, metedo que informa o saldo !!!
  /// metodo esconder informašao
    
    public double getSaldo() {
    	return this.saldo;
    	
    }
}   



