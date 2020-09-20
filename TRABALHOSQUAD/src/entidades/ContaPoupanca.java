package entidades;

import java.util.Calendar;

public class ContaPoupanca extends ContaBancaria {
	
	private double limite;
	private double juros = 1;
	private double CorrMonetaria = 5;
	private int mesAniversario=19;
	private int hoje;
	// CONSTRUTORRES
	public ContaPoupanca(int numero, double limite) {
		super(numero);
		this.limite = limite;
		this.numero = numero;}
	
	public ContaPoupanca(int numero, double limite, double juros) {
		super(numero);
		this.limite = limite;
		this.juros = juros;
	}
	
	public ContaPoupanca(int numero, double limite, double juros, double corrMonetaria) {
		super(numero);
		this.limite = limite;
		this.juros = juros;
		CorrMonetaria = corrMonetaria;
	}

	public ContaPoupanca(int numero, double limite, double juros, double corrMonetaria, int mesAniversario) {
		super(numero);
		this.limite = limite;
		this.juros = juros;
		CorrMonetaria = corrMonetaria;
		this.mesAniversario = mesAniversario;
	}
	public ContaPoupanca(int numero, double limite, double juros, double corrMonetaria, int mesAniversario, int hoje) {
		super(numero);
		this.limite = limite;
		this.juros = juros;
		CorrMonetaria = corrMonetaria;
		this.mesAniversario = mesAniversario;
		this.hoje = hoje;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public double getJuros() {
		return juros;
	}
	public void setJuros(double juros) {
		this.juros = juros;
	}
	public double getCorrMonetaria() {
		return CorrMonetaria;
	}
	public void setCorrMonetaria(double corrMonetaria) {
		CorrMonetaria = corrMonetaria;
	}
	public int getMesAniversario() {
		return mesAniversario;
	}
	public void setMesAniversario(int mesAniversario) {
		this.mesAniversario = mesAniversario;
	}
	public int getHoje() {
		return hoje;
	}
	public void setHoje(int hoje) {
		this.hoje = hoje;
	}
	// MÉTODOS
	public double CalculaJuros() {
		double contador = super.getSaldo() * this.juros + this.CorrMonetaria;
		return contador;
	}
	
	public int aniversarioMes() {
		
		 Calendar hoje = Calendar.getInstance();
		 if (mesAniversario==hoje.get(Calendar.DAY_OF_MONTH)){
			 System.out.println("Hoje é o dia de rendimento ! ");
		 }else {
			 System.out.println("Hoje não é o dia do rendimento! ");
		 }
		 return mesAniversario;	
	}
	public String dados() {
		System.out.println(this.limite + this.juros);
		return null;
	}


	
}

