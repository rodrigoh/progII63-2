package aula13.exemploStatic;

public class Exemplo {
	public static void main(String[] args) {
		Conta c1 = new Conta("Jonas",50);
		Conta c2 = new Conta("Ana",100);
		c1.nomeBanco = "Banco cimol";
		//O atributo static é único para todas as instâncias
		System.out.println(c1.nomeBanco);
		System.out.println(c2.nomeBanco);
		//Existe sem a necessidade de criar uma instância
		Conta.nomeBanco = "Teste";
		System.out.println(c1.nomeBanco);
		System.out.println(c2.nomeBanco);
	}
}
