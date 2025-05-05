package aula08;

import java.util.Scanner;

public class ExemploMetodos {
	//tipo_acesso static tipo_retorno nome(tipo parâmetro)
	public static int soma(int n1, int n2){
		return n1+n2;
	}
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.print("Entre com um valor: ");
		int a = ler.nextInt();
		System.out.print("Entre com um valor: ");
		int b = ler.nextInt();
		int resultado = soma(a,b);
		System.out.println("A soma vale "+resultado);
	}
}
