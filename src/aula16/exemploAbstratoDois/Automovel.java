package aula16.exemploAbstratoDois;

import java.io.IOException;

public class Automovel extends Veiculo{

	public Automovel(String nome){
		setNomeVeiculo(nome);
	}

	public void trocarOleo(float litros){
		System.out.println("Trocando o o óleo do "+getNomeVeiculo()+"aguarde...");
		try {
			Thread.sleep(3000);
		}
		catch (Exception e){
			System.out.println("Algo deu errado na troca de óleo");
		}
		System.out.println("Pronto, óleo trocado para "+litros+"litros");
	}

	@Override
	public float acelerar(float velocidade) {
		this.velocidade++;
		System.out.println("Automóvel "+getNomeVeiculo()+" está acelerando");
		return this.velocidade;
	}

	@Override
	public void parar() {
		this.velocidade = 0;
		System.out.println("Automóvel "+getNomeVeiculo()+" está parado");
	}
}
