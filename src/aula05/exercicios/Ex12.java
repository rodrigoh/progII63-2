package aula05.exercicios;

import java.util.Scanner;

public class Ex12 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite um número: ");
		int num = ler.nextInt();
		int contDiv = 0;
		for(int i=1;i<=num;i++){
			if(num%i==0)
				contDiv++;
		}
		if(contDiv==2)
			System.out.println(num+" é primo");
		else
			System.out.println(num+" não é primo");
	}
}
