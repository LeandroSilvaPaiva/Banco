package entidades;

public class ContaEmpresa extends ContaBancaria{
	
	private double limiteEmpresa;
	private double limite = 100;
	private double emprestimo;
	
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
	public double emprestimo() {
		if ((limite/2)>=limiteEmpresa) {
			emprestimo = (limiteEmpresa*2);
			System.out.println("VALOR DISPONÍVEL PARA EMPRÉSTIMO: " + emprestimo);
		}
		else {
			System.out.println("VOCÊ NÃO TEM LIMITE PARA EMPRÉSTIMO.");
		}
		return emprestimo;
		
	}
}
