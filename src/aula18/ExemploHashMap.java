package aula18;

import java.util.HashMap;

public class ExemploHashMap {
	public static void main(String[] args) {
		HashMap<String, String> iniciais = new HashMap<>();

		iniciais.put("RH","Rodrigo Henrich");
		iniciais.put("AS", "Ana Silva");
		iniciais.put("JS","Jonas Souza");
		iniciais.put("AS", "Adriano Silva");
		System.out.println(iniciais);
	}
}
