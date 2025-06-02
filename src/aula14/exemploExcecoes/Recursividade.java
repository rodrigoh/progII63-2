package aula14.exemploExcecoes;

public class Recursividade {

	//n! = (n-1)!*n
	public static int fatorial(int n){
		if(n==1){
			return 1;
		}
		else
			return fatorial(n-1)*n;
	}
	//F(n) = F(n-1)+F(n-2) para n>1
	public static int fibonacci(int n){
		if(n==0)
			return 0;
		if(n==1)
			return 1;
		else
			return fibonacci(n-1)+fibonacci(n-2);
	}

	public static void main(String[] args) {
		System.out.println(fatorial(5));
		for(int i=0;i<10;i++){
			System.out.print((fibonacci(i)+" "));
		}
	}
}
