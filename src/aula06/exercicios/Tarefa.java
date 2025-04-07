package aula06.exercicios;

import java.util.Random;

public class Tarefa {
	public static int[] bubbleSort(int[] vb){
		for (int i = 0; i < vb.length - 1; i++) {
			for (int j = 0; j < vb.length - i - 1; j++) {
				if (vb[j] > vb[j + 1]) {
					int c = vb[j];
					vb[j] = vb[j + 1];
					vb[j + 1] = c;
				}
			}
		}
		return vb;
	}
	public static int[] insertionSort(int[] vi){
		for (int i = 1; i < vi.length; i++) {
			int chave = vi[i];
			int j = i - 1;
			while (j >= 0 && vi[j] > chave) {
				vi[j + 1] = vi[j];
				j = j - 1;
			}
			vi[j + 1] = chave;
		}
		return vi;
	}

	public static void main(String[] args) {
		Random aleatorio = new Random();
		int[] quantidades = {1000, 10000};
		String resultados = "    Algoritmo     |  Tamanho   |  Tempo (ms)  \n";
		resultados += "------------------+------------+--------------\n";
		String formato = "%17s |%11d |%12dms\n";
		for (int tamanho : quantidades) {
			int[] vi = new int[tamanho];
			int[] vb = new int[tamanho];
			System.out.print("\nGerando " + tamanho + " números...");
			//Gerando um vetor aleatório
			for (int i = 0; i < tamanho; i++) {
				vi[i] = aleatorio.nextInt(1, vi.length * 2);
				vb[i] = vi[i];
			}
			System.out.println("[OK]");
			//Mostrando o v gerado (usar com ves pequenos, a etapa de impressão de dados é demorada)

			if (tamanho < 100) {
				System.out.println("\nMostrando o vetor");
				for (int i : vi)
					System.out.print(i + " ");
			}
			System.out.print("\nOrdenando o vetor com o BubbleSort...");
			//Código do BubbleSort
			long tempoInicial = System.currentTimeMillis();
			vb = bubbleSort(vb);
			long tempoFinal = System.currentTimeMillis();
			System.out.println("[OK]");
			long tempoBubbleSort = tempoFinal - tempoInicial;
			//Mostrando o vetor
			if (tamanho < 100) {
				System.out.println("\nOrdenado com Bubble");
				for (int i : vb)
					System.out.print(i + " ");
			}
			System.out.print("\nOrdenando o vetor com o InsertionSort...");
			//Código do insertionSort
			tempoInicial = System.currentTimeMillis();
			vi = insertionSort(vi);
			tempoFinal = System.currentTimeMillis();
			long tempoInsertionSort = tempoFinal - tempoInicial;
			System.out.println("[OK]");
			//Mostrando o vetor
			if (tamanho < 100) {
				System.out.println("\nOrdenado com Insertion");
				for (int i : vi)
					System.out.print(i + " ");
			}
			//Mostrando os resultados...
			resultados+=String.format(formato,"Bubble Sort",tamanho,tempoBubbleSort);
			resultados += "------------------+------------+--------------\n";
			resultados+=String.format(formato,"Insertion Sort",tamanho,tempoInsertionSort);
			resultados += "------------------+------------+--------------\n";

			System.out.println("\nPara ordenar " + tamanho + " elementos o Bubble Sort precisou de " + tempoBubbleSort + "ms");
			System.out.println("\nPara ordenar " + tamanho + " elementos o Insertion Sort precisou de " + tempoInsertionSort + "ms");
		}
		System.out.println(resultados);
	}
}
