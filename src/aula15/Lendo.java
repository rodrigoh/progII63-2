package aula15;

import java.io.*;

public class Lendo {
	public static void main(String[] args) {
		Pessoa[] lista = new Pessoa[10];
		int cont=0;

		File arquivo = new File("C:/Users/rodri/Documents/dadosPessoa.dat");
		try {
			FileInputStream arquivoLeitura = new FileInputStream(arquivo.getAbsolutePath());
			ObjectInputStream leitura = new ObjectInputStream(arquivoLeitura);
			lista = (Pessoa[]) leitura.readObject();
			//Contando quantas pessoas tem na lista
			while(lista[cont]!=null)
				cont++;
			//Listando as pessoas
			for(int i=0;i<cont;i++){
				System.out.println(lista[i]);
			}
			System.out.println("Dados gravados com sucesso!");
		}
		catch (Exception e){
			System.out.println("Erro ao criar ou abrir o arquivo");
		}

	}
}
