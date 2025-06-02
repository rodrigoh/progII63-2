package aula14.conta;

import java.util.Random;

public class Conta {
	private String titular;
	private String identificador;
	protected float saldo;
	private String senha;

	public Conta(String titular, String senha){
		this.titular = titular;
		this.senha = senha;
		geraIdentificador();
	}

	private void geraIdentificador(){
		String id = "";
		Random aleatorio = new Random();
		for(int i=0;i<5;i++){
			id+= (char) aleatorio.nextInt(65,90);
		}
		id+=aleatorio.nextInt(1000,9999);
		identificador = id;
	}

	public void depositar(float valor){
		saldo+=valor;
	}

	public String getIdentificador(){
		return identificador;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public boolean validaAcesso(String identificador, String senha){
		return this.identificador.equals(identificador) && this.senha.equals(senha);
	}
}
