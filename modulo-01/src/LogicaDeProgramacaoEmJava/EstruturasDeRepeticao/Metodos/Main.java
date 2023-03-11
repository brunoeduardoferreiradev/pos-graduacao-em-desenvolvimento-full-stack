package LogicaDeProgramacaoEmJava.EstruturasDeRepeticao.Metodos;
import java.io.Console;

public class Main {
  public static int somar(int a, int b) {
    return (a + b);
  }

  public static void main(String[] args) {
    int total = Main.somar(10, 20);
    System.out.println("Total é " + total);
  }
}
