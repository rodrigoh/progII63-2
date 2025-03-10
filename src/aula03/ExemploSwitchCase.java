package aula03;

import java.util.Scanner;

public class ExemploSwitchCase {
	public static void main(String[] args) {
		System.out.print("Informe o número do dia da semana: ");
		int dia = new Scanner(System.in).nextInt();

		switch (dia){
			case 1:
				System.out.println("É domingo...");
				break;
			case 2:
				System.out.println("É segunda feira");
				break;
			case 3:
				System.out.println("É terça feira");
				System.out.println("e tem aula");
				break;
				//...
			default:
				System.out.println("O número "+dia+" não corresponde a nenhum dia da semana");
		}
		//Versão atualizada do switch case
		switch (dia){
			case 1-> System.out.println("É domingo");
			case 2-> System.out.println("É segunda feira");
			case 3->{
				System.out.println("É terça feira");
				System.out.println("e tem aula");
			}
			case 4-> System.out.println("É quarta");
			case 5-> System.out.println("É quinta");
			case 6-> System.out.println("É sexta");
			case 7-> System.out.println("É sábado");
			default -> System.out.println("O número não equivale a nenhum dia da semana");
		}
	}
}
