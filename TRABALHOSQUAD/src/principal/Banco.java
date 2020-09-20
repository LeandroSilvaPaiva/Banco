package principal;

import entidades.ContaCorrente;
import entidades.ContaEmpresa;
import entidades.ContaEspecial;
import entidades.ContaPoupanca;

public class Banco {

	public static void main(String[] args) {
		// Scanner kb = new Scanner(System.in);

		// ContaBancaria conta = new ContaBancaria();
		ContaPoupanca poupanca = new ContaPoupanca(12345, 300);//numero conta / saldo.
		ContaCorrente corrente = new ContaCorrente(12345, 300, 13);//numero conta / saldo / folhas talonário.
		ContaEspecial especial = new ContaEspecial(12345, 300, 500);//numero conta / saldo / limite.
		ContaEmpresa empresa = new ContaEmpresa(12345, 300, null, 49);//numero conta / saldo / limite atual / emprestimo.

		System.out.println("**************BANCO DO ED**************");
		System.out.println(" ");
		System.out.println("Qual o tipo da sua conta?: \n1-POUPANÇA | 2-CORRENTE \n3-ESPECIAL | 4-EMPRESARIAL");
		System.out.println(" ");
		System.out.println("****************EXTRATO****************");
		System.out.println(" ");
		System.out.println("**************CONTA CORRENTE***********");
		System.out.println("NÚMERO DACONTA: " + corrente.getNumero());
		System.out.println("SALDO: "+corrente.getSaldo());
		System.out.println("Quantas folhas voce tem?: ");
		//corrente.setTalao(4);
		corrente.emiteTalonario();
		System.out.println(" ");
		System.out.println("**************CONTA ESPECIAL***********");
		System.out.println("NÚMERO DACONTA: " + especial.getNumero());
		System.out.println("SALDO: " + especial.getSaldo());
		especial.calculaJurosEsp();
		System.out.println(" ");
		System.out.println("**************CONTA POUPANÇA***********");
		System.out.println("NÚMERO DACONTA: " + poupanca.getNumero());
		System.out.println("SALDO: " + poupanca.getSaldo());
		poupanca.CalculaJuros();
		poupanca.dados();
		poupanca.aniversarioMes();
		System.out.println(" ");
		System.out.println("**************CONTA EMPRESA************");
		System.out.println("NÚMERO DACONTA: " + empresa.getNumero());
		System.out.println("SALDO: "+empresa.getSaldo());
		System.out.println("SEU LIMITE ATUAL É: " + empresa.getLimiteEmpresa());
		empresa.emprestimo();
	   

	}

}
