package aula13.exercicios.exercicio01;

/**
 * Crie uma classe java chamada Operações (Operacoes), nela
 * implemente métodos para realizar soma, subtração, multiplicação,
 * divisão e exponenciação (apenas ao quadrado).
 * Implemente outra classe chamada calculadora que utilize
 * esses métodos.
 */
public class Operacoes {
	float n1;
	float n2;

	String soma(){
		return n1+"+"+n2+"="+(n1+n2);
	}

	String subtracao(){
		return n1+"-"+n2+"="+(n1-n2);
	}

	String multiplica(){
		return n1+"*"+n2+"="+(n1*n2);
	}

	String divisao(){
		if(n2!=0)
			return n1+"-"+n2+"="+(n1-n2);
		else
			return "Não é possível dividir por zero";
	}

	String potencia(){
		return  n1+"^"+n2+"="+String.format("%.3f",Math.pow(n1,n2));
	}

	String areaQuadrado(){
		return "A área do quadrado de lado "+n1+" vale "+n1*n1;
	}

	String areaCirculo(){
		return "A área do círculo de raio "+n1+" vale "+n1*n1*Math.PI;
	}

}
