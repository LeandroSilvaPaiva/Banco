package entidades;

public class ContaCorrente extends ContaBancaria{
	
	private int talonario;
	private int talao;
	public Object corrente;
	
	public ContaCorrente(int numero, double saldo, int talao) {
		super(numero, saldo);
		this.talao = talao;
	}
	public int getTalonario() {
		return talonario;
	}
	public void setTalonario(int talonario) {
		this.talonario = talonario;
	}
	public int getTalao() {
		return talao;
	}
	public void setTalao(int talao) {
		this.talao = talao;
	}
	public Object getCorrente() {
		return corrente;
	}
	public void setCorrente(Object corrente) {
		this.corrente = corrente;
	}
	public int emiteTalonario() 
	 {
		 //for (i=0; i<5; i++)
		 {
		  if ( talao<=12)
		  {
			  System.out.println("VOCE NÃO PRECISA DE UM NOVO TALALONARIO");
		  }
		  else if (talao > 12)
		  {
			  System.out.println("VOCE PRECISA DE UM NOVO TALALONARIO");
		  }	
    }
		return talao;	  		
}
	
}
