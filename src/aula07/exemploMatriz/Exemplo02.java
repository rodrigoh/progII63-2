package aula07.exemploMatriz;

import java.util.Scanner;

public class Exemplo02 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int[][] matriz = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
		//Descobrindo o tamanho da matriz
		System.out.println("Quantas linhas tem a matriz: "+matriz.length);
		System.out.println("Quantas colunas tem cada linha: "+matriz[0].length);
		//Mostrar a matriz com base no seu tamanho
		for (int l = 0; l < matriz.length; l++) {
			for (int c = 0; c < matriz[l].length; c++) {
				System.out.printf("%02d ",matriz[l][c]);
			}
			System.out.println();
		}
	}
}
