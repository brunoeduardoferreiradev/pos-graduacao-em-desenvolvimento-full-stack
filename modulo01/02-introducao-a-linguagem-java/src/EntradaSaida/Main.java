package EntradaSaida;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Olá Mundo");

		System.out.println("Informe seu Nome : ");
		
		String palavra;
		
		// Pega a palavra que foi digitada no console e manda para visualizacao na tela
		try (Scanner entrada = new Scanner(System.in)) {
			palavra = entrada.next();
		}
		System.out.println("Palavra digitada : " + palavra);
	}

}
