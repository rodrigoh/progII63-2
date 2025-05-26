package aula12;

public class ExemploCores {
	public static final String ANSI_RESET = "\u001B[0m"; // Reseta a cor para o padrão
	public static final String ANSI_RED = "\u001B[31m"; // Define a cor como vermelho
	public static final String ANSI_GREEN = "\u001B[32m"; // Define a cor como verde

	public static void main(String[] args) {
		System.out.println(ANSI_RED + "Este texto é vermelho" + ANSI_RESET);
		System.out.println(ANSI_GREEN + "E este texto é verde" + ANSI_RESET);
	}
}