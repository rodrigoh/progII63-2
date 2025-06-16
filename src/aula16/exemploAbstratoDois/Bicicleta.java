package aula16.exemploAbstratoDois;

public class Bicicleta extends Veiculo{

	public Bicicleta(){
		setNomeVeiculo("Bicicleta");
	}
	@Override
	public float acelerar(float velocidade) {
		this.velocidade = velocidade;
		System.out.println("Pedalando mais rápido a "+getNomeVeiculo());
		return 0;
	}

	@Override
	public void parar() {
		this.velocidade = 0;
		System.out.println("Usando o freio da "+getNomeVeiculo());
	}
}
