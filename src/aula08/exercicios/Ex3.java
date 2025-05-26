package aula08.exercicios;

import java.util.Random;
import java.util.Scanner;

/**
 * Ler uma matriz G 3x3 e criar 2 vetores, SL e SC, de 3
 * elementos cada, contendo respectivamente as somas das
 * linhas e das colunas de G. Escrever os vetores criados.
 */
public class Ex3 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int[][] matriz = new int[3][3];
		int[] sl = new int[3];
		int[] sc = new int[3];
		for (int l = 0; l < matriz.length; l++) {
			for (int c = 0; c < matriz[l].length; c++) {
				System.out.print("matriz["+l+"]["+c+"]: ");
				matriz[l][c] = ler.nextInt();
			}
		}
		for (int l = 0; l < matriz.length; l++) {
			for (int c = 0; c < matriz[l].length; c++) {
				sl[l]+=matriz[l][c];
				sc[l]+=matriz[c][l];
				System.out.printf("%02d ",matriz[l][c]);
			}
			System.out.println();
		}
		System.out.println("A soma dos elementos em cada linha da matriz vale");
		for(int i : sl)
			System.out.print(i+" ");
		System.out.println("\nA soma dos elementos em cada coluna da matriz vale");
		for(int i : sc)
			System.out.print(i+" ");
	}
}
