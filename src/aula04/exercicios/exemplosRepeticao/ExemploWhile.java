package aula04.exercicios.exemplosRepeticao;

import java.util.Scanner;

public class ExemploWhile {
	public static void main(String[] args) {
		int cont=0;

		while(cont<10){
			System.out.print(cont+" ");
			cont++;
		}

		System.out.println("\nOutro exemplo, perguntando para o usuário:");
		char resp = 's';
		while(resp=='s'){
			//Código...
			System.out.print("Continuar? S - sim, N - Não ");
			resp = new Scanner(System.in).next().toLowerCase().charAt(0);
		}
	}
}
