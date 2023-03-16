package LogicaDeProgramacaoEmJava.VetoresEMatrizes.Exercicios.Exercicio04;

public class Main {
  public static void main(String[] args) {
    int[] lista = { 8, 1, 3, 5, 16, 7, 9, 41, 2, 10 }; // Linha 1
                                                       // Linha 2
    int x = lista[0]; // Linha 3
                      // Linha 4
    for (int i = 0; i < 10; i++) // Linha 5
      if (lista[i] % 2 == 0) // Linha 6
        if (lista[i] > x) // Linha 7
          x = lista[i]; // Linha 8
                        // Linha 9
    System.out.println("Resultado:" + x); // Linha 10
  }
}
