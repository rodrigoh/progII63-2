package aula08.exercicios;

import java.util.Scanner;

public class ExemploMediaVetores {

	public static float media(float[] notas) {
		float soma = 0;
		for (int i = 0; i < notas.length; i++)
			soma += notas[i];
		return soma / notas.length;
	}
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		float[] notas = new float[3];
		for(int i=0;i< notas.length;i++){
			System.out.print("Qual a "+(i+1)+"° nota: ");
			notas[i] = ler.nextFloat();
		}
		float media = media(notas);
		System.out.printf("A média vale %.2f\n",media);
	}
}
