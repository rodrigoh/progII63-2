package aula04.exercicios.exemplosRepeticao;

import java.util.Scanner;

public class ExemploDoWhile {
	public static void main(String[] args) {
		int cont=10;
		while(cont<10){
			System.out.print(cont+" ");
			cont++;
		}
		//Mesmo exemplo com do..while;
		do{
			System.out.print(cont+" ");
			cont++;
		}
		while (cont<10);
		System.out.println("\nOutro exemplo...");
		char resposta;
		do{
			System.out.print("Continuar S - sim, n - não: ");
			resposta = new Scanner(System.in).next().toLowerCase().charAt(0);
		}
		while(resposta=='s');
	}
}
