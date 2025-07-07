package aula18;

import java.util.Stack;

public class ExemploPilha {
	public static void main(String[] args) {
		Stack<String> pilha = new Stack<>();
		pilha.push("elemento 1");
		pilha.push("elemento 2");
		pilha.push("elemento 3");
		pilha.push("elemento 4");
		pilha.push("elemento 5");
		pilha.push("elemento 6");
		System.out.println(pilha);
		System.out.println("Removendo o elemento "+pilha.pop());
		System.out.println(pilha);
	}
}
