package aula04.exercicios.exemplosRepeticao;

import java.util.Scanner;

public class ExemploDoWhileDois {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int tentativas = 3;
		String usuario;
		String senha;

		do{
			System.out.print("Qual seu usuário: ");
			usuario = ler.next();
			System.out.print("Qual sua senha: ");
			senha = ler.next();
			if(!(usuario.equals("admin") && senha.equals("123456"))){
				System.out.println("Usuário ou senha inválidos");
				tentativas--;
				System.out.println("Restam "+tentativas+" tentativas");
			}
		}
		while(!(usuario.equals("admin") && senha.equals("123456")) && tentativas>0);
		if(usuario.equals("admin") && senha.equals("123456")){
			System.out.println("Bem vindo admin");
		}
		else{
			System.out.println("Acesso não autorizado");
		}
	}
}
