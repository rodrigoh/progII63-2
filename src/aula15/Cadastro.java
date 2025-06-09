package aula15;

import java.io.*;

public class Cadastro {
	public static void main(String[] args) {
		Pessoa[] lista = new Pessoa[10];
		int cont=0;
		lista[cont++] = new Pessoa("Jonas","Silva");
		lista[cont++] = new Pessoa("Ana","Souza");
		lista[cont++] = new Pessoa("Danilo","Silva");

		File arquivo = new File("C:/Users/rodri/Documents/dadosPessoa.dat");
		try {
			ObjectOutputStream escrita = new ObjectOutputStream(
							new FileOutputStream(arquivo.getAbsolutePath()));
			escrita.writeObject(lista);
			escrita.close();
			System.out.println("Dados gravados com sucesso!");
		}
		catch (IOException e){
			System.out.println("Erro ao criar ou abrir o arquivo");
		}

	}
}
