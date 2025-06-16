package aula16.exemploAbstrato;

public class Quadrado extends Figura{

	private double lado;

	public Quadrado(){
		setNomeFigura("Quadrado");
	}

	@Override
	public double calculaArea() {
		return lado*lado;
	}

	@Override
	public double calculaPerimetro() {
		return 4*lado;
	}
}
