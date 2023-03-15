package LogicaDeProgramacaoEmJava.Polimorfismo.SobrescritaDeMetodos;

class Linguagem{
    public void mostrarInfomacao(){
        System.out.println("Lingua Portuguesa");
    }
}

class Java extends Linguagem{
    public void mostrarInfomacao(){
        System.out.println("Linguagem Java");
    }
}
public class Main {
    public static void main(String[] args) {
        Java j1 = new Java();
        j1.mostrarInfomacao();

        Linguagem l1 = new Linguagem();
        l1.mostrarInfomacao();
    }
}
