package LogicaDeProgramacaoEmJava.EstruturasCondicionais.EstruturaCondicionalAninhada;

public class Main {

	public static void main(String[] args) {
		int nota = 2;

		if (nota >= 5) {
			System.out.println("Aprovado");
		} else if (nota >= 3 && nota < 5) {
			System.out.println("Exame");
		} else {
			System.out.println("Reprovado");
		}

	}

}
