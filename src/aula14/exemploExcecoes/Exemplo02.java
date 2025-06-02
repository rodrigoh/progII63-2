package aula14.exemploExcecoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exemplo02 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		boolean valido = false;
		int numero=0;
		do{
			try{
				System.out.print("Digite um número: ");
				numero = ler.nextInt();
				valido = true;
				System.out.println("O número é "+numero);
			}
			catch (InputMismatchException erro){
				System.out.println("o valor precisa ser um número");
				ler.next();
				valido = false;
			}
		}
		while(!valido);
	}
}
