package aula12.exemploCarro;

public class Exemplo01 {
	public static void main(String[] args) {
		Carro c1 = new Carro();
		c1.marca = "vw";
		c1.modelo = "fusca";
		c1.capacidadeTanque = 45;
		c1.km = 85000;
		c1.cor = "azul";
		c1.anoFabricacao = 1980;
		System.out.println("Abastecendo o veículo "+c1.modelo+" "+c1.abastecer(20));
		c1.andar();
		c1.frear();
		Carro c2 = new Carro();
		c2.marca = "fiat";
		c2.modelo = "500";
		c2.capacidadeTanque = 35;
		c2.km = 85000;
		c2.cor = "vermelho";
		c2.anoFabricacao = 1965;


	}
}
