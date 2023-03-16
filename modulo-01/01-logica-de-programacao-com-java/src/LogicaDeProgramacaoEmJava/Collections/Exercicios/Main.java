// Resposta Exercicio 04
package LogicaDeProgramacaoEmJava.Collections.Exercicios;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();     // Linha 01
        for(int i=0; i<8; i++)                            // Linha 02
            lista.add(i, i+1);                             // Linha 03
        System.out.println(lista.get(4));
    }
}
