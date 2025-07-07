package aula18;

import java.util.LinkedList;
import java.util.Queue;

public class ExemploQueue {
	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<>();
		fila.add("Pessoa 1");
		fila.add("Pessoa 2");
		fila.add("Pessoa 3");
		fila.add("Pessoa 4");
		fila.add("Pessoa 5");
		System.out.println("Qual o próximo da fila: "+fila.peek());
		System.out.println(fila);
		System.out.println("Atendendo a pessoa "+fila.remove());

	}
}
