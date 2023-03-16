package LogicaDeProgramacaoEmJava.IntroducaoALinguagemJava.EntradaESaida;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Olá Mundo");

        System.out.println("Informe seu Nome : ");

        String palavra;
        Scanner entrada = new Scanner(System.in);
        palavra = entrada.next();
        System.out.println("Palavra digitada : " + palavra);
    }
}
