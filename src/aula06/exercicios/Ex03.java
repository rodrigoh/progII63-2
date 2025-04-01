package aula06.exercicios;

import java.util.Random;

/**
 * Ler um vetor de números, de 10 elementos. Declarar outro vetor
 * inverso, copiar todos os elementos de números de trás para frente
 * para o vetor inverso.
 */
public class Ex03 {
	public static void main(String[] args) {
		Random aleatorio = new Random();
		int[] vetor = new int[10];
		int[] inver = new int[10];
		int i=0;
		int j=9;
		System.out.println("Números em vetor...");
		while(i<vetor.length){
			vetor[i] = aleatorio.nextInt(1,100);
			inver[j] = vetor[i];
			System.out.print(vetor[i]+" ");
			i++;
			j--;
		}
		System.out.println("\nNúmeros em inver...");
		i=0;
		while(i<inver.length){
			System.out.print(inver[i]+" ");
			i++;
		}
	}
}
