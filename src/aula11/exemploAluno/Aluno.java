package aula11.exemploAluno;

public class Aluno {
	String nome;
	String sobrenome;
	//float[] notas = new float[3];
	float n1;
	float n2;
	float n3;
	float media;
	int quantFaltas;

	public Aluno(){

	}

	public Aluno(String nome, String sobrenome){
		this.nome = nome;
		this.sobrenome = sobrenome;
		quantFaltas = 0;
	}

	public Aluno(String nome, float n1, float n2, float n3){
		this.nome = nome;
		this.n1 = n1;
		this.n2 = n2;
		this.n3 = n3;
	}

	void calculaMedia(){
		media = (n1+n2+n3)/3;
	}

	String verificaStatus(){
		if(media>=8)
			return "Aprovado";
		else if(media>=3)
			return "Recuperação";
		else
			return "Reprovado";
	}

	void alteraNome(String nome){
		this.nome = nome;
	}

	String obterInformacoes(){
		return "Nome: "+nome+" "+sobrenome+" media "+String.format("%.2f",media)+" e está "+verificaStatus();
	}
}
