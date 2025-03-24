package aula05;

public class Exemplo02 {
	public static void main(String[] args) {
		int[] lista = {1,5,6,9,10,21,22,50};
		String[] nomes = {"Ana","Pedro","Rodrigo"};
		System.out.println("O tamanho da lista é "+lista.length);
		System.out.println("O tamanho da lista nomes é "+nomes.length);

		for(int i=0;i<lista.length;i++){
			System.out.print(lista[i]+" ");
		}

	}
}
