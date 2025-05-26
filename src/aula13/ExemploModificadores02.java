package aula13;

import aula13.exemploModificadores.Pessoa;

public class ExemploModificadores02 {
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		//Aqui só serão visíveis os atributos públicos de pessoa
		p1.endereco = "Endereço...";
	}
}
