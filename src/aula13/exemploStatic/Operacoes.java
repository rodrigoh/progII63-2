package aula13.exemploStatic;

public class Operacoes {

	static String soma(float n1, float n2){
		return n1+"+"+n2+"="+(n1+n2);
	}

	static String subtracao(float n1, float n2){
		return n1+"-"+n2+"="+(n1-n2);
	}

	static String multiplica(float n1, float n2){
		return n1+"*"+n2+"="+(n1*n2);
	}

	static String divisao(float n1, float n2){
		if(n2!=0)
			return n1+"-"+n2+"="+(n1-n2);
		else
			return "Não é possível dividir por zero";
	}
}
