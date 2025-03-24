package aula05;

import java.util.Random;

public class Exemplo04 {
	public static void main(String[] args) {
		Random aleatorio = new Random();
		int[] lista = new int[20];
		for(int i=0;i<lista.length;i++)
			lista[i] = aleatorio.nextInt(1,100);

		for(int i:lista)
			System.out.print(i+" ");
	}
}
