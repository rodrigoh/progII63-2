package aula14.exemploExcecoes.arquivos;

import java.io.*;

public class CadastroPessoa {
	public static void main(String[] args) {
		File arquivo = new File("C:/Users/rodri/Documents/cadastro");
		try {
			Pessoa p1 = new Pessoa();
			p1.setNome("Jonas");
			p1.setSobrenome("Silva");
			p1.setMail("jonas@terra.com.br");

			ObjectOutputStream escrita = new ObjectOutputStream(
							new FileOutputStream(arquivo.getAbsolutePath()));
			escrita.writeObject(p1);
			escrita.close();
		} catch (IOException e) {
			System.out.println("Arquivo não localizado");
		}
	}
}
