package aula05.exercicios;

import java.util.Scanner;

/**
 * Escreva um algoritmo para ler as notas da 1a. e 2a. avaliações de
 * um aluno, calcular e imprimir a média (simples) desse aluno. Só
 * devem ser aceitos valores válidos durante a leitura de cada nota
 * (notas válidas: 0.0 a 10.0).
 */
public class Ex5 {
	public static void main(String[] args) {
		Scanner ler  = new Scanner(System.in);
		float n1;
		float n2;
		System.out.print("Qual a primeira nota: ");
		n1 = ler.nextFloat();
		while(n1<0 || n1>10){
			System.out.print("A nota precisa estar entre 0 e 10: ");
			n1 = ler.nextFloat();
		}
		System.out.print("Qual a segunda nota: ");
		n2 = ler.nextFloat();
		while(n2<0 || n2>10){
			System.out.print("A nota precisa estar entre 0 e 10: ");
			n2 = ler.nextFloat();
		}
		float media = (n1+n2)/2;
		System.out.printf("A média é %.2f\n",media);
	}
}
