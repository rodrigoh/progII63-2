package aula13.exemploModificadores;

public class Exemplo01 {
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		//Aqui serão visíveis os atributos sem modificador, protected e public
		p1.endereco = "Endereço...";
		p1.altura = 1.8f;
		p1.eMail = "mail@gmail.com";
	}
}
