package jogoadivinha;

import java.util.Scanner;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Random gerador = new Random();
		// Gera numeros aleatórios que estejam entre 0 e 100
		int numeroAleatorio = gerador.nextInt(100);

		Scanner entrada = new Scanner(System.in);
		System.out.println("Adivinhe io numero que estou pensando : ");
		int numero = entrada.nextInt();

		if(numero == numeroAleatorio) {
			System.out.println("Parabéns vc acertou, eu pensei no " + numeroAleatorio);
		} else {
			System.out.println("Voce Errou eu pensei no " + numeroAleatorio);
		}
	}

}
