package aula16.exemploInterfaceDois;


public class Vetor implements Lista{

	private String[] elementos;
	private int tamanho;

	public Vetor(){
		elementos = new String[10];
		tamanho = 0;
	}
	@Override
	public void adiciona(String elemento) {
		elementos[tamanho] = elemento;
		tamanho++;
	}

	@Override
	public void remove() {
		tamanho--;
	}

	public int tamanho(){
		return tamanho;
	}

	public String obterLista(){
		String retorno = "[";
		if(tamanho>0){
			for (int i = 0; i < tamanho; i++) {
				retorno+=elementos[i]+" ";
			}
		}
		return retorno+"]";
	}
}
