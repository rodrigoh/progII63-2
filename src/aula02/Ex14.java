package aula02;

import java.util.Scanner;

/**
 * Um motorista de táxi deseja calcular o rendimento de seu carro na praça.
 * Sabendo-se que o preço do combustível é de R$ 4,15, escreva um programa
 * para ler: a marcação do odômetro (Km) no início do dia, a marcação (Km)
 * no final do dia, o número de litros de combustível gasto e o valor
 * total (R$) recebido dos passageiros. Calcular e escrever: a média do
 * consumo em Km/L e o lucro (líquido) do dia.
 */
public class Ex14 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.print("Qual a km inicial: ");
		float kmInicial = ler.nextFloat();
		System.out.print("Qual a km final: ");
		float kmFinal = ler.nextFloat();
		System.out.print("Quantos litros de combustível foram usados: ");
		float quantLitros = ler.nextFloat();
		System.out.print("Qual o valor recebido dos passageiros: ");
		float valorBruto = ler.nextFloat();
		float distancia = kmFinal-kmInicial;
		float autonomia = distancia/quantLitros;
		float valorLiquido = valorBruto-quantLitros*(float)4.15;
		System.out.printf("Seu veículo percorre %.2f km/l\n",autonomia);
		System.out.printf("Seu lucro do dia foi de R$%.2f\n",valorLiquido);
	}
}
