/*
 * Considere o código a seguir onde temos um vetor e uma estrutura de repetição o percorrendo.
 * 
 * Considerando as informações apresentadas neste código-fonte, avalie as afirmações a seguir:
 * 
 * I. O laço for percorrerá toda lista a procura de um valor par, armazena este valor na variável x e o apresenta na linha 10.
 * II. O laço for percorrerá toda lista a procura do maior valor par, o armazena na variável x e apresenta o seu valor na linha 10.
 * III. A variável x receberá um valor da lista na linha 3 e, na linha 7, o valor da variável x é comparado com um valor da lista.
 * IV. As linhas 6 e 7 podem ser colocadas em uma única instrução if(lista[i] % 2 == 0 || lista[i] > x), e a saída será a mesma.
 *
 * Estão corretas apenas as afirmativas: 
 * 
 * 🔳 a - II e IV, apenas
 * 🔲 b - II e III, apenas
 * 🔳 c - I e II, apenas
 * 🔳 d - I e IV, apenas
 * 🔳 e - III e IV, apenas
*/

public class Main {
  public static void main(String[] args) {
    int[] lista = { 8, 1, 3, 5, 16, 7, 9, 41, 2, 10 }; // Linha 1
                                                       // Linha 2
    int x = lista[0]; // Linha 3
                      // Linha 4
    for (int i = 0; i < 10; i++) // Linha 5
      if (lista[i] % 2 == 0) // Linha 6
        if (lista[i] > x) // Linha 7
          x = lista[i]; // Linha 8
                        // Linha 9
    System.out.println("Resultado:" + x); // Linha 10
  }
}
