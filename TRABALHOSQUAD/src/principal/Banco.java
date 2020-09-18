package principal;



import entidades.ContaCorrente;
import entidades.ContaEmpresa;
import entidades.ContaEspecial;
import entidades.ContaPoupanca;

public class Banco {

	public static void main(String[] args) {
		//Scanner kb = new Scanner(System.in);
		
		//ContaBancaria conta = new ContaBancaria();
		ContaPoupanca poupanca = new ContaPoupanca(0, 0, null);
		ContaCorrente corrente = new ContaCorrente(0, 0, 6);
		ContaEspecial especial = new ContaEspecial(0, 0, 0, 0);
		ContaEmpresa empresa = new ContaEmpresa(0, 0, null);
		
		System.out.println("**************BANCO DO ED**************");
		System.out.println(" ");
		System.out.println("Qual o tipo da sua conta?: \n1-POUPANÇA | 2-CORRENTE |3-ESPECIAL | 4-EMPRESARIAL");		
		System.out.println(" ");
		System.out.println("****************EXTRATO****************");
		System.out.println(" ");
		System.out.println("**************CONTA CORRENTE***********");
		System.out.println(" ");
		System.out.println("Quantas folhas voce tem?: ");
	
	
		corrente.setTalao(4);	
        corrente.emiteTalonario();
  
   
		
		}

}
