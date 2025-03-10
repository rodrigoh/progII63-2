package aula03;

import java.util.Scanner;

public class ExemploSwitchCaseObjetos {
	public static void main(String[] args) {
		System.out.print("Entre com seu perfil de usuário professor, aluno e funcionário: ");
		String perfil = new Scanner(System.in).next();

		switch (perfil){
			case "professor"-> System.out.println("Bem vindo a área do professor");
			case "aluno"-> System.out.println("Bem vindo a área do aluno");
			case "funcionario"-> System.out.println("Bem vindo a area do funcionário");
			//O default é opcional
			default -> System.out.println("Perfil inválido");
		}

		if(perfil.equals("professor"))
			System.out.println("Bem vindo a área do professor");
		else if(perfil.equals("aluno"))
			System.out.println("Bem vindo a área do aluno");
		else if(perfil.equals("funcionario"))
			System.out.println("Bem vindo a area do funcionário");
		else
			System.out.println("Perfil inválido");
	}
}
