package aula13.exemploEncapsulamento;

import java.util.Random;

public class Conta {
	private float saldo;
	private String titular;
	private String identificador;

	public Conta(String titular, float deposito){
		this.titular = titular;
		saldo = deposito;
		geraIdentificador();
	}

	public String getTitular(){
		return titular;
	}

	public void setTitular(String titular){
		this.titular = titular;
	}

	public String getIdentificador(){
		return identificador;
	}

	private void geraIdentificador(){
		Random aleatorio = new Random();
		String identificador = "";
		for(int i=0;i<5;i++){
			identificador+=(char)aleatorio.nextInt(65,90);
		}
		identificador+=aleatorio.nextInt(100000000,999999999);
		this.identificador = identificador;
	}

	public void depositar(float valor){
		saldo+=valor;
	}

	public boolean sacar(float valor){
		if(valor<=saldo){
			saldo-=valor;
			return true;
		}
		return false;
	}

	public String verificaSaldo(){
		return "Seu saldo é de R$"+String.format("%.2f",saldo);
	}
}
