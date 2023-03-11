package LogicaDeProgramacaoEmJava.EstruturasDeRepeticao.Exercicios.Exercicio03;

public class Main {
  public static void main(String[] args) {
    int n = 11;
    int cont = 0;
    for (int i = 1; i < (n + 1); i++)
      if (n % i == 0)
        cont = cont + 1;
    System.out.println(cont == 2);
  }
}
