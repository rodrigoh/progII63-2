package aula07.exemploMatriz;

import java.security.SecureRandom;
import java.util.Random;

public class Exemplo04 {
	public static void main(String[] args) {
		Random aleatorio = new Random();
		int[][] matriz = new int[4][4];
		//Dados na matriz
		for (int l = 0; l < matriz.length; l++) {
			for (int c = 0; c < matriz[l].length; c++) {
				matriz[l][c] = aleatorio.nextInt(1,100);
				System.out.printf("%02d ",matriz[l][c]);
			}
			System.out.println();
		}
		//Achando a diagonal
		System.out.println("Diagonal da matriz");
		for (int i = 0; i < matriz.length; i++) {
			System.out.print(matriz[i][i]+" ");
		}
		System.out.println("\nDiagonal secundária");
		for (int l = 0; l < matriz.length; l++) {
			for (int c = 0; c < matriz[l].length; c++) {
				if(l+c==matriz.length-1)
					System.out.print(matriz[l][c]+" ");
			}
		}
	}
}
