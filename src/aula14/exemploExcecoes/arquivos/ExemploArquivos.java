package aula14.exemploExcecoes.arquivos;

import java.io.File;

public class ExemploArquivos {
	public static void main(String[] args) {
		String path = "C:/Users/rodri/Documents/teste";
		File arquivo = new File(path);
		if(arquivo.exists()){
			System.out.println("O arquivo existe");
		}
		else{
			System.out.println("O arquivo não existe");
		}
		arquivo.mkdirs();

	}
}
