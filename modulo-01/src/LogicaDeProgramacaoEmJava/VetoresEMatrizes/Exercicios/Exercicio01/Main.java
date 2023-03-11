package LogicaDeProgramacaoEmJava.VetoresEMatrizes.Exercicios.Exercicio01;

public class Main {
  public static void main(String[] args) {
    int[] lista = { 3, 4, 5, 6, 7 };

    int cont = 0;

    while (cont < 5) {
      System.out.println(lista[cont]);
      cont = cont + 1;
    }
    for (cont = 0; cont < 5; cont++)
      System.out.println(lista[cont]);

  }
}
