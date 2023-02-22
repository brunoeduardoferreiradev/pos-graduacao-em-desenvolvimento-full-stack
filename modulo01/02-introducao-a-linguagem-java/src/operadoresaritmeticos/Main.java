package operadoresaritmeticos;

public class Main {

	public static void main(String[] args) {
		double numA, numB, total;

		numA = 8;
		numB = 3;

		// Soma
		total = numA + numB;
		System.out.println("Soma de A + B = " + total);

		// Subtração
		total = numA - numB;
		System.out.println("Subtração de A - B = " + total);

		// Multiplicação
		total = numA * numB;
		System.out.println("Multiplicação de A * B = " + total);

		// Divisão
		total = numA / numB;
		System.out.println("Divisão de A / B = " + total);

		// Resto da Divisão
		total = numA % numB;
		System.out.println("Resto de A % B = " + total);

	}

}
