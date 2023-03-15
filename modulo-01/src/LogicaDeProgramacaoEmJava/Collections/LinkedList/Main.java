package LogicaDeProgramacaoEmJava.Collections.LinkedList;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<String> animais = new LinkedList<>();

        animais.add("Cachorro");
        animais.add("Cavalo");
        animais.add("vaca");

        System.out.println("LinkedList: "+animais);

        animais.add(1, "Gato");

        System.out.println("LinkedList: "+animais);
    }
}
