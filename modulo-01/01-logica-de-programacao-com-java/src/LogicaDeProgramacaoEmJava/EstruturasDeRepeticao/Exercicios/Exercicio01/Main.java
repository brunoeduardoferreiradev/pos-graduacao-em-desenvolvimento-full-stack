package LogicaDeProgramacaoEmJava.EstruturasDeRepeticao.Exercicios.Exercicio01;

public class Main {
  public static void main(String[] args) {
    for (int x = 1; x < 10; x++)
      if (x % 4 != 0 && x % 2 == 0)
        for (int y = 1; y < 5; y++)
          System.out.println(y);
  }
}
