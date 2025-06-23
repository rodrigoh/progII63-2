package aula17;

import java.util.ArrayList;

public class ExemploArrayList {
	public static void main(String[] args) {
		//ArrayList<Tipo_objeto> nome = new ArrayList<>()
		ArrayList<String> lista = new ArrayList<>();
		//Adicionar um elemento no final da lista
		lista.add("item 1");
		lista.add("item 3");
		//Adicionar um elemento em qualquer posição
		lista.add(1,"item 2");
		System.out.println(lista);
		lista.add("item 4");
		lista.add("item 5");
		lista.add("item 6");
		lista.add("item 4");
		lista.add("item 7");
		lista.add("item 8");
		//Obtendo um elemento da lista
		System.out.println("Obtendo o elemento da posição 3 "+lista.get(3));
		//Verificando a posição de determinado elemento (indexOf - posicaoDe)
		System.out.println("A posição do elemento 'item 3' na lista "+lista.indexOf("item 3"));
		System.out.println("A posição do elemento 'teste' na lista "+lista.indexOf("teste"));
		//Verificando a última ocorrência de um elemento na lista (lastIndexOf - precisamos fazer)
		System.out.println("A primeira ocorrência do elemento 'item 4' na lista está na posição "+lista.indexOf("item 4"));
		System.out.println("A última ocorrência do elemento 'item 4' na lista está na posição "+lista.lastIndexOf("item 4"));
		//Imprimir a lista
		System.out.println(lista);
		//Verificando se um elemento existe na lista (contains - precisamos fazer)
		System.out.println("O elemento 'item 8' existe na lista? "+(lista.contains("item 8")?"Sim":"Não"));
		System.out.println("O elemento 'teste' existe na lista? "+(lista.contains("teste")?"Sim":"Não"));
		//Removendo um elemento da lista pela posição
		System.out.println("Apagando o elemento da posição 6 da lista: "+lista.remove(6));
		//Removendo um elemento pelo elemento (precisamos fazer)
		System.out.println("Apagando o elemento 'item 4' da lista: "+(lista.remove("item 4")?"OK":"Erro"));
		//Descobrir o tamanho da lista (precisamos fazer)
		System.out.println("O tamanho atual da lista é "+lista.size());
		//Descobrir se a lista está vazia (precisamos fazer)
		System.out.println("A lista está vazia? "+(lista.isEmpty()?"Sim":"Não"));
		//Apagar todos os elementos da lista
		lista.clear();
		System.out.println("A lista está vazia? "+(lista.isEmpty()?"Sim":"Não"));
		System.out.println(lista);

	}
}
