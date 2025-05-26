package aula13.exercicios.exercicio02;

public class Pessoa {
	String nome;
	String eMail;
	String telefone;
	String endereco;

	String obterInformacoes(){
		String info = "Nome: "+nome;
		info+="\nE-mail: "+eMail;
		info+="\nTelefone: "+telefone;
		info+="\nEndereço: "+endereco;
		return info;
	}
}
