package aula14.exemploPolimorfismo.funcionario;

public class Exemplo {
	public static void main(String[] args) {
		Motorista m1 = new Motorista();
		m1.setNome("Jonas");
		m1.setSobrenome("Silva");
		m1.setMatricula(123);
		m1.setCnh("abc123");
		System.out.println(m1);
	}
}
