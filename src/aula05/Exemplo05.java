package aula05;

import java.util.Scanner;

public class Exemplo05 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int[] vetor = new int[100];
		char resp = 's';
		int cont=0;
		while(resp=='s'){
			System.out.print("vetor["+cont+"]: ");
			vetor[cont] = ler.nextInt();
			cont++;
			System.out.print("Mais números: s - sim n - não: ");
			resp = ler.next().toLowerCase().charAt(0);
		}
		for(int i=0;i<cont;i++){
			System.out.print(vetor[i]+" ");

		}
	}
}
