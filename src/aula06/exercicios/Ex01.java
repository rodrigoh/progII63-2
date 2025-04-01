package aula06.exercicios;

import java.util.Random;
import java.util.Scanner;

/*
Ler dois vetores, A e B com um número variável de conteúdo (números)
(no máximo 10). O programa deve solicitar antes da leitura dos vetores
a quantidade de dados a serem lidos (1 a 10), os dois vetores terão o
mesmo número de elementos. Gerar um terceiro vetor chamado Soma (de no
máximo 10 elementos) que seja a soma dos dados do vetor A com os do vetor
B.
 */
public class Ex01 {
	public static void main(String[] args) {
		int capacidade;
		Scanner ler = new Scanner(System.in);
		Random aleatorio = new Random();
		System.out.print("Qual a capacidade dos vetores (1..10): ");
		capacidade = ler.nextInt();
		while(capacidade<1 || capacidade>10){
			System.out.print("Entre 1 e 10! ");
			capacidade = ler.nextInt();
		}
		//Declarando os vetores...
		int[] va = new int[capacidade];
		int[] vb = new int[capacidade];
		int[] soma = new int[capacidade];
		System.out.println("\nGerando dados e mostrando os vetores...");
		for(int i=0;i<capacidade;i++){
			va[i] = aleatorio.nextInt(1,100);
			vb[i] = aleatorio.nextInt(1,100);
			soma[i] = va[i]+vb[i];
			System.out.printf("%d + %d = %d\n",va[i],vb[i],soma[i]);
		}
	}
}
