package aula16.exemploAbstrato;

public class Teste {
	public static void main(String[] args) {
		Circulo c1 = new Circulo();
		c1.setRaio(5);
		System.out.printf("A área do %s de raio %.2f vale %.2fcm²\n",c1.getNomeFigura(),c1.getRaio(),c1.calculaArea());
		System.out.printf("O perímetro do %s de raio %.2f vale %.2fcm\n",c1.getNomeFigura(),c1.getRaio(),c1.calculaPerimetro());
	}
}
