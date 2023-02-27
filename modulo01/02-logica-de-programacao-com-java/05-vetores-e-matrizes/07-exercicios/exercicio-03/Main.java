/*
 * Considere um analista que, baseado em uma lista com 10 valores numéricos inteiros, deseja analisar quantos destes são pares e quantos são maiores que 28. Para isso, ele criou o seguinte algoritmo.
 * 
 * A única dúvida do analista é o que colocar nas linhas 6 e 7. Considerando as informações apresentadas, assinale a opção que, corretamente, pode ser inserida respectivamente nas linhas 6 e 7.
 * 
 * 🔳 a - Linha 6: while (i <10) e linha 7: if (lista[i] % 2 == 0)
 * 🔳 b - Linha 6: for (int i=0; i <=10; i++) e linha 7: if (lista % 2 == 0)
 * 🔲 c - Linha 6: for (int i=0; i <10; i++) e linha 7: if (lista[i] % 2 == 0)
 * 🔳 d - Linha 6: while (lista < 10) e linha 7: if (lista % 2 == 0)
 * 🔳 e - Linha 6: for (int i=0; i<10; i++) e linha 7: if (valor[0] % 2=0)
*/

public class Main {
  public static void main(String[] args) {
     int[] lista = {13,41,5,86,72,9,82,36,27,8};           // Linha 1
                                                           // Linha 2 
     int pares = 0;                                        // Linha 3 
     int maiores = 0;                                      // Linha 4
                                                           // Linha 5
     ?                                                     // Linha 6
     ?                                                     // Linha 7 
     pares = pares + 1;                                    // Linha 8
     if(lista[i] > 28)                                     // Linha 9 
        maiores = maiores + 1;                             // Linha 10
                                                           // Linha 11 
     System.out.println("Pares são: " + pares);            // Linha 12
     System.out.println("Maiores que 28 são: " + maiores); // Linha 13
  }
}
