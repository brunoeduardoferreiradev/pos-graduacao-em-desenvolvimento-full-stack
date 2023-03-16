package LogicaDeProgramacaoEmJava.EstruturasDeRepeticao.Exercicios.Exercicio02;

public class Main {
  public static void main(String[] args) {
    int d = 0;
    int x = 314;

    while (x > 1) {
      x = x / 2;
      d = d + 1;
    }

    System.out.println("x = " + x);
    System.out.println("d = " + d);
  }
}
