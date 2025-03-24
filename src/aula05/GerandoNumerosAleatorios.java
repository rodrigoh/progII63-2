package aula05;

import java.util.Random;

public class GerandoNumerosAleatorios {
	public static void main(String[] args) {
		Random aleatorio = new Random();

		int numero = aleatorio.nextInt();
		System.out.println("O número gerado foi "+numero);
		numero = aleatorio.nextInt(100);
		System.out.println("O número gerado foi "+numero);
		numero = aleatorio.nextInt(10,200);
		System.out.println("O número gerado foi "+numero);
		System.out.println("Agora vale "+aleatorio.nextBoolean());
		numero =  aleatorio.nextInt(65,97);
		char letra = (char) numero;
		System.out.printf("%c",letra);
	}
}
