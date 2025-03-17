package aula04.exercicios.exemplosRepeticao;

public class ExemploFor {
	public static void main(String[] args) {
		System.out.println("Exemplo 1:");
		for(int cont=0;cont<10;cont++)
			System.out.print(cont+" ");

		System.out.println("\nExemplo 2");
		int i=10;
		for(;i>0;i--)
			System.out.print(i+" ");

		System.out.println("\nExemplo 3");
		for(i=0;i<20;){
			System.out.print(i+" ");
			i+=2;
		}

		System.out.println("\nExemplo 4");
		for(int j=0,t=9;j<10;j++,t--){
			System.out.println("j="+j+", t="+t);
		}
	}
}
