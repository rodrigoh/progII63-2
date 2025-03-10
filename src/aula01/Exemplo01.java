package aula01;

public class Exemplo01 {
	public static void main(String[] args){
		System.out.print("Imprime a mensagem sem quebrar linha");
		System.out.println("Imprime e quebra linha no final");
		System.out.printf("Imprime a mensagem como no C");
		//Imprimindo variáveis
		String nome = "Ana";
		int idade = 19;
		//Sintaxe usada no print e println
		System.out.println("\nO nome é "+nome+" e a idade é "+idade);
		System.out.printf("O nome é %s e a idade é %d\n",nome,idade);

	}
}
