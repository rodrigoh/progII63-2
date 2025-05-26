package aula13.exercicios.exercicio01;

import java.util.Scanner;

public class Calculadora {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Operacoes op = new Operacoes();
		char opc;
		do{
			System.out.println("Selecione uma opção");
			System.out.println("+ para soma");
			System.out.println("- para subtração");
			System.out.println("* para multiplicação");
			System.out.println("/ para divisão");
			System.out.println("^ para exponenciação");
			System.out.println("q para área do quadrado");
			System.out.println("c para área do círculo");
			System.out.println("s sair");
			opc = ler.next().toLowerCase().charAt(0);
			if(opc=='^' || opc=='q' || opc=='c'){
				System.out.println("Entre com um número: ");
				op.n1 = ler.nextFloat();
			}
			else if(opc!='s'){
				System.out.println("Entre com um valor para n1: ");
				op.n1 = ler.nextFloat();
				System.out.println("Entre com um valor para n2: ");
				op.n2 = ler.nextFloat();
			}
			switch (opc){
				case '+'-> System.out.println(op.soma());
				case '-'-> System.out.println(op.subtracao());
				case '*'-> System.out.println(op.multiplica());
				case '/'-> System.out.println(op.divisao());
				case '^'-> System.out.println(op.potencia());
				case 'q'-> System.out.println(op.areaQuadrado());
				case 'c'-> System.out.println(op.areaCirculo());
			}
		}
		while(opc!='s');
	}
}
