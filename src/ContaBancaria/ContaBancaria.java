package ContaBancaria;

public class ContaBancaria {
	private int numero;
	private String nome;
	private double saldo;
	
	
	public ContaBancaria(int numero, String nome, double depositoInicial) {
		super();
		this.numero = numero;
		this.nome = nome;
		Deposito(depositoInicial);
	}

	public ContaBancaria(int numero, String nome) {
		this.numero = numero;
		this.nome = nome;
	}
	
	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void Deposito(double quantidade) {
		saldo += quantidade;
		
	}
	
	public void Saque(double quantidade) {
		saldo -= quantidade + 5.0;
		
	}
	
	public String toString() {
		return "Conta " + numero +", Titular: " + nome + ", Saldo: " + String.format("%.2f", saldo); 
	}
	
	

}
