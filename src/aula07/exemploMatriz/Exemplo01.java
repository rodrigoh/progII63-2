package aula07.exemploMatriz;

import java.util.Scanner;

public class Exemplo01 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		//tipo[][] nome = new tipo[quantLinhas][quantColunas]
		int[][] matriz = new int[2][3];
		//matriz[0][2] = 12
		//Lendo do teclado
		for (int l = 0; l < 2; l++) {
			for (int c = 0; c < 3; c++) {
				System.out.printf("matriz[%d][%d] = ",l,c);
				matriz[l][c] = ler.nextInt();
			}
		}
		for (int l = 0; l < 2; l++) {
			for (int c = 0; c < 3; c++) {
				System.out.printf("%02d ",matriz[l][c]);
			}
			System.out.println();
		}
	}
}
