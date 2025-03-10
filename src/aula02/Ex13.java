package aula02;

import java.util.Scanner;

/**
 * Escreva um programa para ler as dimensões de uma cozinha retangular
 * (comprimento, largura e altura), calcular e escrever a quantidade de
 * caixas de azulejos para se colocar em todas as suas paredes. Também
 * deve ser lido um valor equivalente a área das Janelas e portas para
 * descontar da área total. Cada caixa de azulejos possui 1,5 m2.
 */
public class Ex13 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.print("Qual a largura da cozinha: ");
		float largura = ler.nextFloat();
		System.out.print("Qual o comprimento da cozinha: ");
		float comprimento = ler.nextFloat();
		System.out.print("Qual a altura da cozinha: ");
		float altura = ler.nextFloat();
		System.out.print("Qual a área ocupada por aberturas: ");
		float areaAberturas = ler.nextFloat();

		float areaTotal = (comprimento*altura)*2+(largura*altura)*2;
		//Subtrair a área ocupada por aberturas
		areaTotal-=areaAberturas;
		float quantCaixas = areaTotal/(float) 1.5;
		//String quantFormatado = String.format("%.3f",quantCaixas);
		System.out.println("Para cobrir os "+String.format("%.2f",areaTotal)+" m² de " +
						"parede serão necessárias "+String.format("%.3f",quantCaixas)+" de azulejos");
		//Mesmo exemplo usando printf
		System.out.printf("Para cobrir os %.2f m² de parede serão necessárias %.2f " +
						"caixas de azulejos\n",areaTotal,quantCaixas);
	}
}
