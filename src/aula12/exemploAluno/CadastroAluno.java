package aula12.exemploAluno;

import java.util.Scanner;

public class CadastroAluno {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		//Aluno aluno = new Aluno();
		System.out.print("Qual o nome do aluno: ");
		String nome = ler.next();
		System.out.print("Qual o sobrenome do aluno: ");
		String sobrenome = ler.next();
		//Como temos um construtor, ele passa a ser obrigatório
		Aluno aluno = new Aluno(nome,sobrenome);
		System.out.print("Qual primeira nota: ");
		aluno.n1 = ler.nextFloat();
		System.out.print("Qual segunda nota: ");
		aluno.n2 = ler.nextFloat();
		System.out.print("Qual terceira nota: ");
		aluno.n3 = ler.nextFloat();
		aluno.calculaMedia();
		System.out.println("O aluno "+aluno.nome+" "+aluno.sobrenome);
		System.out.println("Tem média "+aluno.media);
		System.out.println("E está "+aluno.verificaStatus());

		//Se declarar o construtor vazio ele estará disponível
		Aluno a2 = new Aluno();
		Aluno a3 = new Aluno("Jonas", 8, 9, 10);
		a3.sobrenome = "Silva";
		a3.calculaMedia();
		System.out.println(a3.obterInformacoes());
	}
}
