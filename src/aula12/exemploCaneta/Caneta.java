package aula12.exemploCaneta;

public class Caneta {
	String fabricante;
	String cor;
	int quantTinta;

	void escrever(String texto){
		if(quantTinta>0){
			System.out.println(texto);
			quantTinta--;
		}
	}
}
