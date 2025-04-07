package aula07.exemploMatriz;

import java.util.Random;

public class Exemplo03 {
	public static void main(String[] args) {
		Random aleatorio = new Random();
		int[][] ma = new int[5][3];
		int[][] mb = new int[5][3];
		int[][] soma = new int[5][3];
		//Gerando números e mostrando a matriz
		for (int l = 0; l < ma.length; l++) {
			for (int c = 0; c < ma[l].length; c++) {
				ma[l][c] = aleatorio.nextInt(1,100);
				mb[l][c] = aleatorio.nextInt(1,100);
				soma[l][c] = ma[l][c]+mb[l][c];
				System.out.println(ma[l][c]+" + "+mb[l][c]+" = "+soma[l][c]);
			}
		}
	}
}
