package aula14.exemploExcecoes.arquivos;

import java.io.*;

public class LendoPessoa {
	public static void main(String[] args) {
		File arquivo = new File("C:/Users/rodri/Documents/cadastro");
		try {
			ObjectInputStream leitura = new ObjectInputStream(new
							FileInputStream(arquivo.getAbsolutePath()));
			Pessoa p1 = (Pessoa) leitura.readObject();
			//
			System.out.println(p1);
			leitura.close();
		}
		catch (ClassNotFoundException e){
			System.out.println("Erro ao identificar o objeto");
		}
		catch (IOException e) {
			System.out.println("Arquivo não localizado");
		}

	}
}
