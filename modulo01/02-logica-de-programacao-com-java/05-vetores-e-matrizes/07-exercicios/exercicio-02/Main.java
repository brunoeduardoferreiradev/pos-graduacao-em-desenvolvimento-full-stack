/*
 * Observe com atenção o seguinte código escrito em Java.
 * 
 * De acordo com o código apresentado, qual a saída correta para o código apresentado?
 * 
 * 🔲 a - Na linha 12, a lista estará com esta sequência de valores 8 7 9 6 5
 * 🔳 b - Nas linhas 6, 7 e 8 nós temos o princípio do código que é ordenar a lista
 * 🔳 c - Na linha 12, a lista estará ordenada e os valores apresentados serão 5 6 7 8 9
 * 🔳 d - Na linha 6 teremos um erro pois a variável aux precisa ser declarada antes do while
 * 🔳 e - Na linha 5 temos um erro na condição de parada, o que resultará em loop infinito
*/

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
