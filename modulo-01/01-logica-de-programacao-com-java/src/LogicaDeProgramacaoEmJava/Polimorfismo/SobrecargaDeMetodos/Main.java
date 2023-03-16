package LogicaDeProgramacaoEmJava.Polimorfismo.SobrecargaDeMetodos;

class Desenho {
    // Metodo sem parametro
    public void mostrar() {
        for (int i = 0;
             i < 10;
             i++) {
            System.out.println("*");
        }
    }
    // Metodo com um parametro sobrecarga do metodo acima
    public void mostrar(char simbol) {
        for (int i = 0;
             i < 10;
             i++) {
            System.out.println(simbol);
        }
    }

    // Metodo com dois parametros sobrecarga dos metodos anteriores = mesmo nome e assinaturas diferentes
    public void mostrar(char simbol, int n) {
        for (int i = 0;
             i < n;
             i++) {
            System.out.println(simbol);
        }
    }
}

public class Main {
    public static void main(String[] args) {
       Desenho d1 = new Desenho();
       d1.mostrar();
       d1.mostrar('b');
       d1.mostrar('$',15);
    }
}
