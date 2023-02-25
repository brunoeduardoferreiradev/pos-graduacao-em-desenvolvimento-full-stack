/*
 * Observe com atenção o código a seguir, onde temos uma variável n que não possui valor declarado, porém, aceita qualquer valor inteiro positivo ou negativo.
 * 
 * O conteúdo da linha 6 (cont==2) será verdadeiro para um número positivo n sempre que (marque a opção correta).
 * 
 * 
 * 🔳 a - n for divisível por 2
 * 🔳 b - n for um número composto
 * 🔳 c - n for divisível por números pares
 * 🔲 d - n for um número primo
 * 🔳 e - n for um número par e divisível por i
*/

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
