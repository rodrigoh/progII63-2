package aula14.exemploFinal;

public class Exemplo {
	public static void main(String[] args) {
		//Leitura de uma constante
		System.out.println(Pessoa.ESPECIE);

		Pessoa p1 = new Pessoa((float) 1.8);
		//Não é possível alterar um atributo final
		//p1.altura = 1.9f;
	}
}
