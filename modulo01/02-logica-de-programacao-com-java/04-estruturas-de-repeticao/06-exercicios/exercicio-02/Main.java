/*
 * Observe com atenção o seguinte código escrito em Java.
 * 
 * Considerando o uso de uma estrutura de repetição na linha 3 deste código, marque a alternativa que apresenta respectivamente os valores de x e d após a execução do laço while.
 * 🔲
 * 🔳 a - x = 1; d = 9
 * 🔳 b - x = 1; d = 10.
 * 🔳 c - x = 0.6; d = 9
 * 🔳 d - x = 0; d = 10
 * 🔳 e - x = 0.6; d = 10
*/

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
