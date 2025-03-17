package aula04.exercicios;

import java.util.Scanner;

/**
 * Receba três valores fornecidos pelo usuário que representarão os
 * lados de um triângulo.
 * Classifique esse triângulo como:
 * a) Equilátero: três lados iguais.
 * b) Isósceles: dois lados iguais.
 * c) Escaleno: três lados diferentes.
 * Lembre-se de que, para formar um triângulo, nenhum dos lados pode
 * ser igual a zero,
 * um lado não pode ser maior do que a soma dos outros
 * dois.
 */
public class ClassificaTrianguloEx9 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Sobre o triângulo informe:");
		System.out.print("l1: ");
		float l1 = ler.nextFloat();
		System.out.print("l2: ");
		float l2 = ler.nextFloat();
		System.out.print("l3: ");
		float l3 = ler.nextFloat();
		boolean okTriangulo = true;
		okTriangulo = l1>0 && l2>0 && l3>0 && l1<=l2+l3 && l2<=l1+l3 && l3<=l1+l2;
		//okTriangulo = l1<=l2+l3 && l2<=l1+l3 && l3<=l1+l2;

		//if(!(l1>0 && l2>0 && l3>0 && l1<=l2+l3 && l2<=l1+l3 && l3<=l1+l2))

		if(!okTriangulo)
			System.out.printf("As medidas %.2f, %.2f e %.2f não formam triângulo\n",l1,l2,l3);
		else if(l1==l2 && l2==l3)
			System.out.printf("Forma um triângulo equilátero de lado %.2f\n",l1);
		else if(l1==l2 || l1==l3 || l2==l3)
			System.out.printf("Forma um triângulo isósceles de lados %.2f, %.2f e %.2f\n",l1,l2,l3);
		else
			System.out.printf("Forma um triângulo escaleno de lados %.2f, %.2f e %.2f\n",l1,l2,l3);
	}
}
