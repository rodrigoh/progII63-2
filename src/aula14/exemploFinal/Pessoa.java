package aula14.exemploFinal;

public final class Pessoa {

	//public para ter acesso universal
	//static para existir independente da criação de instância
	//final para não ter seu valor modificado
	public static final String ESPECIE = "humano";
	//Atributo final
	//Ele precisa receber um valor, até o final do construtor
	//final float altura=1.8f;
	final float altura;

	public Pessoa(float altura){
		this.altura = altura;
	}
	//Não é possível alterar o valor de um atributo final...
//	public void setAltura(float altura){
//		this.altura = altura;
//	}
}
