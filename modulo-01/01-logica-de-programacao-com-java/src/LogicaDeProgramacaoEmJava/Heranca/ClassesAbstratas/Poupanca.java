package LogicaDeProgramacaoEmJava.Heranca.ClassesAbstratas;

public class Poupanca extends Conta {
    @Override
    public void imprimeExtrato() {
        System.out.println("Saldo : " + this.getSaldo());
    }
}
