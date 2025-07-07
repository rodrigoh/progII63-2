package aula18;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class ExemploHashSet {
	public static void main(String[] args) {
		HashSet<String> lista = new HashSet<>();
		System.out.println("Adicionando o elemento 'a'"+lista.add("a"));
		System.out.println("Adicionando o elemento 'b'"+lista.add("b"));
		System.out.println("Adicionando o elemento 'c'"+lista.add("c"));
		System.out.println("Adicionando o elemento 'd'"+lista.add("d"));
		System.out.println("Adicionando o elemento 'e'"+lista.add("e"));
		System.out.println("Adicionando o elemento 'a'"+lista.add("a"));
		System.out.println("Adicionando o elemento 'f'"+lista.add("f"));
		System.out.println(lista);
		lista.remove("a");
		System.out.println(lista);
	}
}
