package aula16.exemploInterfaceDois;

import aula16.exemploAbstratoDois.Veiculo;

public class Teste {
	public static void main(String[] args) {
		Vetor v1 = new Vetor();
		v1.adiciona("Item 1");
		v1.adiciona("Item 2");
		v1.adiciona("Item n");
		System.out.println(v1.obterLista());
		v1.remove();
		System.out.println(v1.obterLista());
		//Criando uma instância de Lista
		Lista l1 = new Vetor();
		l1.adiciona("Elemento 1");
		l1.remove();
		//O método obterLista, não está disponível na instância l1, tendo em vista que ele não é implementado na interface
		//l1.obterLista();

	}
}
