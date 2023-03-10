package LogicaDeProgramacaoEmJava.Heranca.ExemploPraticoHeranca;

public class Main {
    public static void main(String[] args) {
    Cachorro c = new Cachorro();
    c.setNome("Bidu");

    Gato g = new Gato();
    g.setNome("Lola");


    c.mostrar();
    g.mostrar();
    }
}
