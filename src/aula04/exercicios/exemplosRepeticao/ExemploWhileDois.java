package aula04.exercicios.exemplosRepeticao;

import java.util.Scanner;

public class ExemploWhileDois {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.print("Informe um número entre 1 e 10: ");
		int num = ler.nextInt();
		//Validando a leitura
		while(num<1 || num>10){
			System.out.print("Eu disse entre 1 e 10: ");
			num = ler.nextInt();
		}
		//Calculando a tabuada...
		int cont=1;
		while(cont<=10){
			int mult = cont*num;
			System.out.printf("%d x %d = %d\n",cont,num,mult);
			cont++;
		}
	}
}
