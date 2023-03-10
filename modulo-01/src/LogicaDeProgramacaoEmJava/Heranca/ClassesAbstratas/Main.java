package LogicaDeProgramacaoEmJava.Heranca.ClassesAbstratas;

public class Main {
    public static void main(String[] args) {
        Conta cp = new Poupanca();
        cp.setSaldo(5000);
        cp.imprimeExtrato();
    }
}
