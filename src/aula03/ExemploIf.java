package aula03;

import java.util.Scanner;

public class ExemploIf {
	public static void main(String[] args) {
//		if(condicao)
//			comandos;
//		else
//			comandos
		System.out.print("Entre com um número: ");
		int numero = new Scanner(System.in).nextInt();
		// > maior que
		// < menos que
		// >= maior ou igual
		// <= menor ou igual
		// == igual a
		// != diferente
		// OU lógico = ||
		// E lógico = &&

		if(numero == 0)
			System.out.println("O número é zero");
		else if(numero>0)
			System.out.println("O número "+numero+" é positivo");
		else
			System.out.println("O número "+numero+" é negativo");

		//Outro exemplo
		if(numero>10 && numero<20)
			System.out.println("Número está entre 10 e 20");

	}
}
