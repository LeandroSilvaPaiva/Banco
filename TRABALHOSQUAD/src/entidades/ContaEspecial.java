package entidades;

public class ContaEspecial extends ContaCorrente {
	
	public ContaEspecial(int numero, double saldo, int talao, double limite) {
		super(numero, saldo, talao);
		this.limite = limite;
	}

	private double limite;
	//calcula juros METODO
	//public double calcularJuros()

	//Selic ta 2% ao ano, deve dar uns 0,15 ao mês mais ou menos


}
