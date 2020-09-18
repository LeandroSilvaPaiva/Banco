package entidades;

public class ContaEmpresa extends ContaBancaria{
	public ContaEmpresa(int numero, double saldo, int[] transacoes) {
		super(numero, saldo, transacoes);
		// TODO Auto-generated constructor stub
	}
	private double limiteEmpresa;
	
	public ContaEmpresa(int numero, double saldo, int[] transacoes, double limiteEmpresa) {
		super(numero, saldo, transacoes);
		this.limiteEmpresa = limiteEmpresa;
	}

	public double getLimiteEmpresa() {
		return limiteEmpresa;
	}

	public void setLimiteEmpresa(double limiteEmpresa) {
		this.limiteEmpresa = limiteEmpresa;
	}
	
	
	//public double emprestimoEmpresarial()
	

}
