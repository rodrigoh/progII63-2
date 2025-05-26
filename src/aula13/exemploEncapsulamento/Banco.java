package aula13.exemploEncapsulamento;

public class Banco {
	public static void main(String[] args) {
		Conta c1 = new Conta("Jonas",100);
		System.out.println(c1.getTitular());
		c1.setTitular("Ana");
		System.out.println(c1.getIdentificador());
	}
}
