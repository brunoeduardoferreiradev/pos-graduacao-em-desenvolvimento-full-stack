import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    int opcao;

    do {
      System.out.println("Digite um valor qualquer ou 88 para sair");
      Scanner entrada = new Scanner(System.in);
      opcao = entrada.nextInt();
    } while (opcao != 88);
  }
}
