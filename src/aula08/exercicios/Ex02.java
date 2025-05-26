package aula08.exercicios;

import java.util.Random;

/**
 * Carregar uma matriz SOMA 4x4, calcular e escrever as seguintes somas:
 * a) da linha de índice 3
 * b) da coluna de índice 2
 * c) de todos os elementos da matriz
 */
public class Ex02 {
	public static void main(String[] args) {
		Random aleatorio = new Random();
		int[][] soma = new int[4][4];
		int somaL = 0;
		int somaC = 0;
		int somaT = 0;
		for (int l = 0; l < soma.length; l++) {
			for (int c = 0; c < soma[l].length; c++) {
				soma[l][c] = aleatorio.nextInt(1,100);
				System.out.printf("%02d ",soma[l][c]);
				//Somando a linha de índice 3
				if(l==3)
					somaL+=soma[l][c];
				//somando a coluna de índice 2
				if(c==2)
					somaC+=soma[l][c];
				//Somando todos os elementos
				somaT+=soma[l][c];

			}
			System.out.println();
		}
		System.out.println("A soma dos números");
		System.out.println("Da linha 3 vale "+somaL);
		System.out.println("Da coluna 2 vale "+somaC);
		System.out.println("De todos os elementos "+somaT);
	}
}
