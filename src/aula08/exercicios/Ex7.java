package aula08.exercicios;

import java.util.Random;

/**
 * 7 - Leia uma matriz de 5x5 elementos. Calcule a soma dos elementos
 * que estão acima da diagonal principal.
 * Leia uma matriz de 5x5 elementos. Calcule a soma dos elementos
 * que estão abaixo da diagonal principal.
 */
public class Ex7 {
	public static void main(String[] args) {
		Random aleatorio = new Random();
		int[][] matriz = new int[5][5];
		for (int l = 0; l < matriz.length; l++) {
			for (int c = 0; c < matriz[l].length; c++) {
				matriz[l][c] = aleatorio.nextInt(1,50);
				System.out.printf("%02d ",matriz[l][c]);
			}
			System.out.println();
		}
		int somaA = 0;
		int somaB = 0;
		int somaD = 0;
		int somaF = 0;
		for (int l = 0; l < matriz.length; l++) {
			for (int c = 0; c < matriz[l].length; c++) {
				//Somando os elementos que estão acima paralelos à diagonal
				if(l>0 && l==c){
					somaF+=matriz[l-1][c];
				}
				if(l==c)
					somaD+=matriz[l][c];
				else if(l<c)
					somaA+=matriz[l][c];
				else if(l>c)
					somaB+=matriz[l][c];
			}
		}
		System.out.println("A soma dos elementos");
		System.out.println("Todos os elementos acima da diagonal "+somaD);
		System.out.println("Todos os elementos abaixo da diagonal "+somaB);
		System.out.println("Elementos na diagonal "+somaD);
		System.out.println("A soma dos elementos paralelos acima a diagonal "+somaF);
	}
}
