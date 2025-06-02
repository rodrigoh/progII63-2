package aula14.exemploPolimorfismo.funcionario;

public class Motorista extends Funcionario{
	private String cnh;

	public String getCnh() {
		return cnh;
	}

	public void setCnh(String cnh) {
		this.cnh = cnh;
	}

	@Override
	public String toString(){
		return super.toString()+" CNH: "+cnh;
	}
}
