package aula06.exercicios;

import java.util.Random;

public class Exemplo {
	public static void main(String[] args) {
		Random aleatorio = new Random();
		int[] vetor = new int[100000];
		//Gerando um vetor aleatório
		for(int i=0;i<vetor.length;i++)
			vetor[i] = aleatorio.nextInt(1,vetor.length*2);
		//Mostrando o vetor gerado (usar com vetores pequenos, a etapa de impressão de dados é demorada)
		System.out.println("\nGerado");
//		for(int i:vetor)
//			System.out.print(i+" ");

		//Obtendo o tempo inicial
		long tempoInicial = System.currentTimeMillis();
		//Código do algoritmo de ordenação
		for(int i=0;i<vetor.length;i++){
			int num = vetor[i];
			for(int j=i;j<vetor.length;j++){
				if(vetor[i]>vetor[j]){
					int aux = vetor[i];
					vetor[i] = vetor[j];
					vetor[j] = aux;
				}
			}
		}
		//Obtendo o tempo final
		long tempoFinal = System.currentTimeMillis();
		//Algoritmo de ordenação
		System.out.println("\nOrdenado");
//		for(int i:vetor)
//			System.out.print(i+" ");

		//Calculando o tempo
		long tempo = tempoFinal-tempoInicial;
		System.out.println("\nA ordenação levou "+tempo+"ms");
	}
}
