package aula05;

import java.util.Scanner;

public class Exemplo01 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		//Como era em C
		//int vetor[10];
		//10 elementos com índices 0 a 9
		int[] vetor = new int[10];
		//Todos os vetores de números do Java são inicializados com 0
		vetor[0] = 5;
		vetor[1] = 10;
		//...
		//Lendo dados para o vetor...
		for(int i=0;i<10;i++){
			System.out.print("vetor["+i+"]: ");
			//System.out.printf("vetor[%d]: ",i);
			vetor[i] = ler.nextInt();
		}
		//Mostrando vetor na tela
		for(int i=0;i<10;i++){
			System.out.print(vetor[i]+" ");
		}
	}
}
