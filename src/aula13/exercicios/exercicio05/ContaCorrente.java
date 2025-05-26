package aula13.exercicios.exercicio05;

import java.util.Random;

/**
 * Um sistema para um banco desenvolvido em java possui as duas
 * opções de conta, corrente e poupança. Conta corrente tem um
 * número, titular, saldo, e limite de conta. Ao ser criada ela
 * recebe um número. Contas poupança possuem número, titular, saldo.
 * Para criar um conta poupança deverá haver um depósito inicial.
 * Crie uma classe Banco com dois arrays de conta, e
 * permita aos usuários criar uma conta e opções para listar as
 * contas criadas.
 */
public class ContaCorrente {
	float saldo;
	float limite;
	String titular;
	String identificador;

	ContaCorrente(String titular, float limite){
		this.titular = titular;
		this.limite = limite;
		saldo = 0;
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
		if(valor<=saldo+limite){
			saldo-=valor;
			return true;
		}
		return false;
	}

	String verificaSaldo(){
		String retorno = "Seu saldo é de R$"+String.format("%.2f",saldo);
		if(saldo<0){
			retorno+="Seu limite disponível é de R$"+String.format("%.2f",saldo+limite);
		}
		else{
			retorno+="Seu limite disponível é de R$"+String.format("%.2f",limite);
		}
		return retorno;
	}
}
