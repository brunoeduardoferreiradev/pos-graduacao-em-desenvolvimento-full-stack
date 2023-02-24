package switchcase;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Escolha uma opção");
		System.out.println("1 - Cadastrar Aluno: ");
		System.out.println("2 - Cadastrar notas: ");
		System.out.println("3 - Listar alunos e Nota");

		int numero = entrada.nextInt();

		switch (numero) {
		case 1:
			System.out.println("Vamos Cadastrar Aluno");
			break;
		case 2:
			System.out.println("Vamos Cadastrar Nota");
			break;
		case 3:
			System.out.println("Vamos Listar alunos e notas");
			break;
		default:
			System.out.println("Opção inválida");
			break;
		}
	}

}
