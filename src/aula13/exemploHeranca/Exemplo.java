package aula13.exemploHeranca;

public class Exemplo {
	public static void main(String[] args) {
		Funcionario f1 = new Funcionario("Jonas","Silva",123);
		Motorista m1 = new Motorista("Ana","Souza",125);
		Engenheiro e1 = new Engenheiro("Jessica","Souza",589,"ab58");
		System.out.println(f1.obterInformacoes());
		System.out.println(m1.obterInformacoes());
		System.out.println(e1.obterInformacoes());
	}
}
