package aula03;

import java.util.Scanner;

public class ExemploIfComparandoObjetos {
	public static void main(String[] args) {
		//Tipos objeto
		//String
		//Float => float (primitivo)
		//Double => double
		//Integer => int
		//Pessoa (classe definida pelo usuário)
		Scanner ler = new Scanner(System.in);
		System.out.print("Informe a senha de acesso: ");
		//String senha = ler.next();
		String senha = new Scanner(System.in).next();

		if(senha.equals("123456")){
			System.out.println("Acesso autorizado");
			System.out.println("Bem vindo ao sistema...");
		}
		else{
			System.out.println("Senha incorreta...");
			System.out.println("Saindo...");
		}
	}
}
