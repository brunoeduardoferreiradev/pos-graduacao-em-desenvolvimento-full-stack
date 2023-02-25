/*
 * Neste código temos duas estruturas de repetição for aninhadas, sendo que o for interno está dentro de uma estrutura condicional. Considerando as informações apresentadas neste código, assinale a opção correta.
 * 
 * 🔲 a - A linha 4 será executada em um total de 8 vezes, apresentando a sequência 12341234
 * 🔳 b - A expressão da linha 2 só será verdadeira quando o número for par e divisível por 4
 * 🔳 c - A linha 4 será executada 10 vezes, apresentando a sequência 1234512345
 * 🔳 d - A linha 2 será executada quando o valor de x for par e divisível por 4
 * 🔳 e - A linha 4 apresentará o valor de y na tela quando o resto da divisão de x por 4 for diferente de zero ou quando o resto for igual 2
*/

public class Main {
  public static void main(String[] args) {
    for (int x = 1; x < 10; x++)
      if (x % 4 != 0 && x % 2 == 0)
        for (int y = 1; y < 5; y++)
          System.out.println(y);
  }
}
