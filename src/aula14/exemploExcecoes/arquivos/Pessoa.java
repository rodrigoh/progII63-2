package aula14.exemploExcecoes.arquivos;

import java.io.Serializable;

public class Pessoa implements Serializable {
	private String nome;
	private String sobrenome;
	private String mail;

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

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	@Override
	public String toString() {
		return "Pessoa{" +
						"nome='" + nome + '\'' +
						", sobrenome='" + sobrenome + '\'' +
						", mail='" + mail + '\'' +
						'}';
	}
}
