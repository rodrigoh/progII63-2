package aula12.exemploCarro;

public class Carro {
	String marca;
	String modelo;
	String cor;
	int km;
	int anoFabricacao;
	float capacidadeTanque;
	float quantCombustivel=0;

	boolean abastecer(float quantidade){
		if(quantidade<=capacidadeTanque-quantCombustivel){
			quantCombustivel+=quantidade;
			return true;
		}
		return false;
	}

	void andar(){
		System.out.println(modelo+" está andando");
	}

	void frear(){
		System.out.println(modelo+" está parado");
	}
}
