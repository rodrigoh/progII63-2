package aula02;

import java.util.Scanner;

/**
 * Uma equipe de Fórmula 1 deseja calcular o número mínimo de litros que deverá colocar no
 * tanque de seu carro para que ele possa percorrer um determinado número de voltas até o
 * primeiro reabastecimento. Escreva um programa que leia o comprimento da pista (em metros),
 * o número total de voltas a serem percorridas no grande prêmio, o número de reabastecimentos
 * desejados e o consumo de combustível do carro (em Km/L). Calcular e escrever o número mínimo
 * de litros necessários para percorrer até o primeiro reabastecimento. Observação:
 * Considere que o número de voltas entre os reabastecimentos é o mesmo.
 */
public class Ex15 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.print("Qual o comprimento da pista em metros: ");
		float compPista = ler.nextFloat()/1000;
		System.out.print("Quantas voltas tem o GP: ");
		int quantVoltas = ler.nextInt();
		System.out.print("Quantos reabastecimentos serão realizados: ");
		int quantReabastece = ler.nextInt();
		System.out.print("Qual a autonomia do carro: ");
		float autonomia = ler.nextFloat();
		float distanciaTotal = compPista*quantVoltas;
		float litrosTotal = distanciaTotal/autonomia;
		float litrosPorAbastece = litrosTotal/quantReabastece;
		System.out.printf("Para percorrer as %d voltas do GP serão necessários %d " +
						"reabastecimentos com %.2f litros cada\n",quantVoltas,quantReabastece,litrosPorAbastece);
	}
}
