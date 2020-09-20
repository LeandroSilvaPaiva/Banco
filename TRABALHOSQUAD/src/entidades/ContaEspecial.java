package entidades;

public class ContaEspecial extends ContaCorrente {
	
	public ContaEspecial(int numero, double saldo, double limite) {
		super(numero, saldo, numero);
		this.limite = limite;
	}
	private double limite = 500;
	private double selic = 0.1;

	public double getLimite() {
		return limite;
	}
public double limite() {
		return limite;
	}
	public void setLimite(double limite) {
		this.limite = limite;
	}
	public double getSelic() {
		return selic;
	}
	public void setSelic(double selic) {
		this.selic = selic;
	}
	public double calculaJurosEsp() {
		System.out.println("JUROS: " + saldo * selic);
		return saldo * selic;}
}
