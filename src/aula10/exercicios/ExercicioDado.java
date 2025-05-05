package aula10.exercicios;

import java.util.Random;

public class ExercicioDado {
	public static int dado(){
		Random aleatorio = new Random();
		return aleatorio.nextInt(6);
	}

	public static void main(String[] args) {
		int[] lancamentos = new int[6];
		int lancamentoTotal = 1000000;
		for (int i = 0; i < lancamentoTotal; i++) {
			int valor = dado();
			lancamentos[valor]++;
			//System.out.print((dado()+1)+" ");
		}
		for(int i=0;i< lancamentos.length;i++){
			double percentual = lancamentos[i]/(float)lancamentoTotal*100;
			System.out.printf("A face %d do lado foi sorteada %d vezes " +
							"o que representa %.2f %% das vezes\n",i+1,lancamentos[i],percentual);
		}
	}
}
