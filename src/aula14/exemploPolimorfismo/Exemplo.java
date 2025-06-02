package aula14.exemploPolimorfismo;

import java.util.Random;

public class Exemplo {
	public static void main(String[] args) {
		Operacoes op = new Operacoes();
		int[] lista = {1,2,3};
		System.out.println(op.soma(lista));
		System.out.println(op.soma("Aula de ","programação"));
		System.out.println(op.soma(5,2));

	}
}
