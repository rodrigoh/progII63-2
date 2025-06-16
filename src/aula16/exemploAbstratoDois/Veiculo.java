package aula16.exemploAbstratoDois;

public abstract class Veiculo {

	private String nomeVeiculo;
	protected float velocidade;

	public String getNomeVeiculo() {
		return nomeVeiculo;
	}

	public void setNomeVeiculo(String nomeVeiculo) {
		this.nomeVeiculo = nomeVeiculo;
	}

	public float getVelocidade() {
		return velocidade;
	}

	public abstract float acelerar(float velocidade);

	public abstract void parar();
}
