
public class TestaValores {
	
	public static void main(String[] args) {
		
		Conta conta = new Conta(1337, 24226);
						
		System.out.println(conta.getAgencia());
		
		conta.setAgencia(1232123);
		
		Conta conta2 = new Conta(1337, 24226);
		Conta conta3 = new Conta(1337, 24226);
		conta2.transfere(10, conta3);
		
		conta.saldo
		
		System.out.println(Conta.getTotal());
							
	}

}