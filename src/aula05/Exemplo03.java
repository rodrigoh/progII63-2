package aula05;

public class Exemplo03 {
	public static void main(String[] args) {
		int[] vetor = {1,5,7,8,9,10};
		int[] copia = vetor;
		System.out.println("Dados no vetor...");
		for(int i=0;i<vetor.length;i++){
			System.out.print(vetor[i]+" ");
		}
		System.out.println("\nDados no vetor copia...");
		for(int i=0;i<copia.length;i++){
			System.out.print(copia[i]+" ");
		}

		copia[2] = 99;

		System.out.println("\nDados no vetor...");
		for(int i=0;i<vetor.length;i++){
			System.out.print(vetor[i]+" ");
		}
		System.out.println("\nDados no vetor copia...");
		for(int i=0;i<copia.length;i++){
			System.out.print(copia[i]+" ");
		}
	}
}
