package aula08;

import java.util.Scanner;

public class ExemploMedia {

	public static float media(float notaUm, float notaDois, float notaTres){
		return (notaUm+notaDois+notaTres)/3;
	}

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.print("Entre com a primeira nota do aluno: ");
		float n1 = ler.nextFloat();
		System.out.print("Entre com a segunda nota do aluno: ");
		float n2 = ler.nextFloat();
		System.out.print("Entre com a terceira nota do aluno: ");
		float n3 = ler.nextFloat();
		float media = media(n1,n2,n3);
		System.out.printf("A média do aluno %.2f\n",media);
	}
}
