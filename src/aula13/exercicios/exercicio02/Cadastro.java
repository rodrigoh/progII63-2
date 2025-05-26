package aula13.exercicios.exercicio02;

import java.util.Scanner;

public class Cadastro {
	static String leString(String mensagem){
		Scanner ler = new Scanner(System.in);
		System.out.print(mensagem+": ");
		return ler.nextLine();
	}
	public static void main(String[] args) {
		Pessoa[] lista = new Pessoa[10];
		int contP=0;
		char opc;
		do{
			System.out.println("Escolha uma opção");
			System.out.println("c - cadastro");
			System.out.println("l - listar");
			System.out.println("p - pesquisar");
			System.out.println("s - sair");
			opc = leString(" ").toLowerCase().charAt(0);
			switch (opc){
				case 'c'->{
					if(contP<lista.length) {
						lista[contP] = new Pessoa();
						lista[contP].nome = leString("Nome");
						lista[contP].eMail = leString("E-mail");
						lista[contP].endereco = leString("Endereço");
						lista[contP].telefone = leString("Telefone");
						contP++;
					}
					else{
						System.out.println("A lista está cheia");
					}
				}
				case 'l'->{
					for(int i=0;i<contP;i++){
						System.out.println(lista[i].obterInformacoes());
					}
				}
				case 'p'->{
					String termo = leString("Qual termo de busca");
					for(int i=0;i<contP;i++) {
						if(lista[i].nome.equalsIgnoreCase(termo) || lista[i].eMail.equalsIgnoreCase(termo))
							System.out.println(lista[i].obterInformacoes());
					}
				}
			}
		}
		while(opc!='s');
	}
}
