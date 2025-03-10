package aula01;

import java.util.Scanner;

public class Exemplo02 {
	public static void main(String[] args){
		Scanner ler = new Scanner(System.in);
		//Lendo números inteiros
		System.out.print("Digite um número inteiro: ");
		//scanf("%d",&numeroInteiro)
		int numeroInteiro = ler.nextInt();
		//Lendo um número real
		System.out.print("Qual sua altura em metros: ");
		float altura = ler.nextFloat();
		//Ler uma palavra
		System.out.print("Qual seu nome: ");
		String nome = ler.next();
		//Ler uma frase
		//Reset da instância
		ler = new Scanner(System.in);
		System.out.print("Qual seu nome completo: ");
		String nomeCompleto = ler.nextLine();
		System.out.printf("O nome é %s e o nome completo é %s. A altura é %.2f metros\n",
						nome,nomeCompleto,altura);

		//Lendo uma letra do teclado
		System.out.print("Entre com uma letra: ");
		char letra = ler.next().charAt(0);

		int n1 = 5;
		int n2 = 2;

		float divisao = (float) n1/n2;

		float n3 = (float) 5.67;

	}
}
