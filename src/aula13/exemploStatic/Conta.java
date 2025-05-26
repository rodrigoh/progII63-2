package aula13.exemploStatic;

import java.util.Random;

public class Conta {
	float saldo;
	String titular;
	String identificador;
	static String nomeBanco;

	Conta(String titular, float deposito){
		this.titular = titular;
		saldo = deposito;
		geraIdentificador();
	}

	void geraIdentificador(){
		Random aleatorio = new Random();
		String identificador = "";
		for(int i=0;i<5;i++){
			identificador+=(char)aleatorio.nextInt(65,90);
		}
		identificador+=aleatorio.nextInt(100000000,999999999);
		this.identificador = identificador;
	}

	void depositar(float valor){
		saldo+=valor;
	}

	boolean sacar(float valor){
		if(valor<=saldo){
			saldo-=valor;
			return true;
		}
		return false;
	}

	String verificaSaldo(){
		return "Seu saldo é de R$"+String.format("%.2f",saldo);
	}
}
