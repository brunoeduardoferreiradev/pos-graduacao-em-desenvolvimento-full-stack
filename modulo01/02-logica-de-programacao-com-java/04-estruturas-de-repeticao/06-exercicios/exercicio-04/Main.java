/*
 * Considere o código a seguir onde temos uma estrutura de repetição for. ( exercicio esta incompleto falta o resto da questão )
 * 
 * Considerando as informações apresentadas neste código-fonte, avalie as afirmações a seguir:
 * 
 * 
 * 🔲 a - II e IV, apenas
 * 🔳 b - I e II, apenas
 * 🔳 c - I e IV, apenas.
 * 🔳 d - III e IV, apenas.
 * 🔳 e - II e III, apenas
*/

public class Main {
  public static void main(String[] args) {
    int x = 4, y = 8, r = 0;

    for (int i = 0; i < x; i++)
      r = r + y;

    System.out.println(r);
  }
}
