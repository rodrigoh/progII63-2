package aula14.exemploPolimorfismo.conta;

public class ContaCorrente extends Conta {

	private float limite;

	public ContaCorrente(String titular, String senha, float limite) {
		super(titular, senha);
		this.limite = limite;
		saldo = 0;
	}

	@Override
	public boolean sacar(float valor){
		if(saldo+limite>=valor){
			saldo-=valor;
			return true;
		}
		return false;
	}

	@Override
	public String verificaSaldo(){
		String info = "Seu saldo é de R$"+String.format("%.2f",saldo);
		if(saldo<0)
			info+="Limite disponível R$"+String.format("%.2f",(saldo+limite));
		else
			info+="Limite disponível R$"+String.format("%.2f",limite);
		return info;
	}
}
