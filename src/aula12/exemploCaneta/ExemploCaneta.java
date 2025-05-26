package aula12.exemploCaneta;

public class ExemploCaneta {
	public static void main(String[] args) {
		Caneta canetaUm = new Caneta();
		canetaUm.quantTinta = 10;
		canetaUm.cor = "azul";
		canetaUm.fabricante = "BIC";
		for (int i = 0; i < 15; i++) {
			canetaUm.escrever("Contando a linha "+(i+1));
		}
	}
}
