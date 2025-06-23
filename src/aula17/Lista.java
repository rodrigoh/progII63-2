package aula17;

public class Lista<T> {
	private T[] elementos;
	private int tamanho;

	public Lista(int capacidade){
		elementos = (T[]) new Object[capacidade];
		tamanho = 0;
	}

	public void adiciona(T elemento){
		aumentaCapacidade();
		elementos[tamanho] = elemento;
		tamanho++;
	}

	public void adiciona(int posicao, T elemento){
		if(posicao<0 || posicao>=tamanho)
			throw new IllegalArgumentException("Posição "+posicao+" não é válida");
		aumentaCapacidade();
		for(int i=tamanho-1;i>=posicao;i--){
			elementos[i+1] = elementos[i];
		}
		elementos[posicao] = elemento;
		tamanho++;
	}

	private void aumentaCapacidade(){
		if(tamanho== elementos.length){
			T[] auxiliar = (T[]) new Object[tamanho*2];
			for (int i = 0; i < tamanho; i++) {
				auxiliar[i] = elementos[i];
			}
			//Aqui vai o código...
			elementos = auxiliar;
		}
	}

	public int posicaoDe(T elemento){
		for(int i=0;i<tamanho;i++){
			if(elementos[i].equals(elemento)){
				return i;
			}
		}
		return -1;
	}

	public T remove(int posicao){
		if(posicao<0 || posicao>=tamanho)
			throw new IllegalArgumentException("Posição "+posicao+" não é válida");
		T copia = elementos[posicao];
		for(int i=posicao;i<tamanho-1;i++){
			elementos[i] = elementos[i+1];
		}
		tamanho--;
		return copia;
	}

	public T obter(int posicao){
		if(posicao<0 || posicao>=tamanho)
			throw new IllegalArgumentException("Posição "+posicao+" não é válida");
		return elementos[posicao];
	}
	//TODO Construtor que não recebe capacidade inicial
	//TODO ultimaPosicaoDe
	//TODO contem
	//TODO remove pelo elemento
	//TODO tamanho
	//TODO limpar
	//[]
	//[1, 2, 3, 4, 5, 6]
	@Override
	public String toString(){
		String retorno = "[";
		if(tamanho>0){
			for(int i=0;i<tamanho-1;i++)
				retorno+=elementos[i]+", ";
			retorno+=elementos[tamanho-1];
		}
		return retorno+"]";
	}
}
