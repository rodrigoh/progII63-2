package aula14.exemploPolimorfismo.funcionario;

public class Funcionario {
	private String nome;
	private String sobrenome;
	private int matricula;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String toString(){
		return "Nome: "+nome+" "+sobrenome+" id: "+matricula;
	}
}
