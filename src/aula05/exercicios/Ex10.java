package aula05.exercicios;

import java.util.Scanner;

/**
 * Escreva um algoritmo para ler um valor N e imprimir todos os valores
 * inteiros entre 1 (inclusive) e N (inclusive). Considere que o N será
 * sempre maior que ZERO.
 */
public class Ex10 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int n;
		do{
			System.out.print("Informe um valor para n maior que 0: ");
			n = ler.nextInt();
		}
		while (n<=0);
		for(int i=1;i<=n;i++){
			System.out.print(i+" ");
		}
	}
}
