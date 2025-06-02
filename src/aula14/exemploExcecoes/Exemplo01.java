package aula14.exemploExcecoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exemplo01 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		try {
			System.out.print("Entre com um número: ");
			int n1 = ler.nextInt();
			System.out.print("Entre com outro número: ");
			int n2 = ler.nextInt();
			float div = n1 / n2;
			System.out.println("Resultado = " + div);
		}
		catch (InputMismatchException e){
			System.out.println("n1 e n2 precisam ser números");
		}
		catch (ArithmeticException e){
			System.out.println("Não é possível dividir por zero");
		}
		catch (Exception erro){
			System.out.println("Algo mais deu errado");
		}
		finally {
			System.out.println("Essa parte sempre acontece...");
		}
	}


}
