package aula10.exercicios;

import java.util.Scanner;

public class Ex01 {
	public static double calculaDelta(double a, double b, double c){
		return b*b-4*a*c;
	}

	public static double caculaX(double a, double b, double d, char opc){
		if(opc=='+')
			return (-b+Math.sqrt(d))/(2*a);
		else
			return (-b-Math.sqrt(d))/(2*a);
	}

	public static double leDouble(String mensagem){
		Scanner ler = new Scanner(System.in);
		System.out.print(mensagem+": ");
		return ler.nextDouble();
	}

	public static void main(String[] args) {
		System.out.println("Dada a equação ax² + bx + c = 0 informe");
		double a = leDouble("a");
		double b = leDouble("b");
		double c = leDouble("c");
		double d = calculaDelta(a,b,c);
		if(d>=0){
			double x1 = caculaX(a,b,d,'+');
			double x2 = caculaX(a,b,d,'-');
			System.out.printf("As raízes da equação são \nx'=%.2f e \nx\"=%.2f\n",x1,x2);
		}
		else{
			System.out.println("A equação não possui raízes no conjunto dos reais");
		}
	}
}
