package entidades;

public abstract class ContaBancaria {
	public int numero;
	public double saldo;
	public int transacoes[];
	//construtores
	public ContaBancaria(int numero) {
		super();
		this.numero = numero;
	}
	public ContaBancaria(int numero, double saldo) {
		super();
		this.numero = numero;
		this.saldo = saldo;
	}
	public ContaBancaria(int numero, double saldo, int[] transacoes) {
		super();
		this.numero = numero;
		this.saldo = saldo;
		this.transacoes = transacoes;
	}
	//getters and setters
	public int getNumero() {
		return numero;
	}
	public double getSaldo() {
		return saldo;
	}
	public int[] getTransacoes() {
		return transacoes;
	}
}
