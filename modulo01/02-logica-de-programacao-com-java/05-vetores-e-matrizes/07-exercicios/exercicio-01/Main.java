/*
 * Observe com atenção o código a seguir:
 * 
 * Considerando essas informações e os conteúdos estudados sobre estrutura de repetição, analise as asserções a seguir e a relação proposta entre elas.
 * 
 * I. No laço da linha 5, o nosso programa tem um while cuja execução (iteratividade) será encerrada assim que a variável cont atingir o valor 5, mostrando os 5 valores da lista.
 * 
 * Porque:
 * 
 * II. Todo laço de repetição necessita de uma condição de parada. Se no laço while a condição de parada está na linha 5, no segundo laço temos a condição de parada na linha 9, e é cont < 5.
 * 
 * A seguir, assinale a alternativa correta.
 * 
 * 🔲 a - A asserção I é uma proposição verdadeira, e a II é uma proposição falsa
 * 🔳 b - As asserções I e II são proposições verdadeiras, e a II é uma justificativa correta da I
 * 🔳 c - As asserções I e II são proposições verdadeiras, mas a II não é uma justificativa correta da I
 * 🔳 d - A asserção I é uma proposição falsa, e a II é uma proposição verdadeira
 * 🔳 e - As asserções I e II são proposições falsas
*/

public class Main {
  public static void main(String[] args) {
    int[] lista = { 3, 4, 5, 6, 7 };

    int cont = 0;

    while (cont < 5) {
      System.out.println(lista[cont]);
      cont = cont + 1;
    }
    for (cont = 0; cont < 5; cont++)
      System.out.println(lista[cont]);

  }
}
