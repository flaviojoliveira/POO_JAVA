class Conta{
	double saldo;
	String NomeTitular;
	String numeroDaConta;
	
	public Conta(String nome, String numero){
	    this.NomeTitular = nome;
	    this.numeroDaConta = numero;
	}
	
	void conferirSaldo(){
	    System.out.println("seu saldo e: R$:"+this.saldo+"\n");
	}
	
	void dados(){
	    System.out.println("Nome: "+this.NomeTitular+"\nNumero da Conta: "+this.numeroDaConta+"\n");
	}
	
	void depositar(double valor){
	    System.out.println("\nDepositando R$:"+valor);
	    this.saldo += valor;
	    System.out.println("\nDEPOSITO REALISADO COM SUCESSO\n");
	}
	
	void sacar(double valor){
	    if(this.saldo < valor){
	        System.out.println("SALDO INSUFICIENTE\n");
	    }
	    else{
	        this.saldo -= valor;
	        System.out.println("saque realizado\n");
	    }
	}

}

class Banco{
	public static void main(String[] args){
		Conta c1 = new Conta("andreson", "123456");
		
		c1.dados();
	    c1.conferirSaldo();
		c1.depositar(1000);
		c1.conferirSaldo();
		c1.sacar(4500);
		c1.conferirSaldo();
	}
}