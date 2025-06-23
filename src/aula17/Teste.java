package aula17;

import aula15.Pessoa;

public class Teste {
	public static void main(String[] args) {
		Lista<String> l1 = new Lista<>(3);
		l1.adiciona("item 1");
		l1.adiciona("item 3");
		l1.adiciona("item 4");
		System.out.println(l1);
		System.out.println(l1.obter(1));
		System.out.println(l1.posicaoDe("item 2"));
		System.out.println(l1.posicaoDe("teste"));
		l1.adiciona(1,"item 2");
		System.out.println(l1);
		l1.adiciona("item 5");
		l1.adiciona("item 6");
		l1.adiciona("item 7");
		l1.adiciona("item 8");
		l1.adiciona("item 9");
		l1.adiciona("item 10");
		l1.adiciona("item 11");
		System.out.println(l1);
		System.out.println(l1.remove(5));
		System.out.println(l1);
		//não funciona int, float, char, double
		//funciona Integer, Float, Double, String
		Lista<Pessoa> listaPessoa = new Lista<>(5);
		listaPessoa.adiciona(new Pessoa("Jonas","Silva"));
		listaPessoa.adiciona(new Pessoa("Ana","Souza"));
		System.out.println(listaPessoa);
	}
}
