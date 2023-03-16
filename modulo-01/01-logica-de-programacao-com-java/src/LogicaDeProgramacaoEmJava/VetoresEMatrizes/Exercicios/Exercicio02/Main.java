package LogicaDeProgramacaoEmJava.VetoresEMatrizes.Exercicios.Exercicio02;

public class Main {
  public static void main(String[] args) {
    int[] valores = { 9, 8, 7, 6, 5 };

    int cont = 0;

    while (cont < 2) {
      int aux = valores[cont];
      valores[cont] = valores[cont + 1];
      valores[cont + 1] = aux;
      cont += 1;
    }

    for (int i = 0; i < 5; i++) {
      System.out.println(valores[i]);
    }
  }
}
