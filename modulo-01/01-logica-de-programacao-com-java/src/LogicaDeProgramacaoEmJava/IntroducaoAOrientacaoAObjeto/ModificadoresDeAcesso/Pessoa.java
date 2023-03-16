package LogicaDeProgramacaoEmJava.IntroducaoAOrientacaoAObjeto.ModificadoresDeAcesso;

public class Pessoa {
    private String nome;
    public int idade;
    protected String Sexo;
    double peso;
    double altura;

    public void calcularIMC(double pes, double alt){
        double imc;
        this.peso = pes;
        altura = alt;
        imc = peso/(altura* altura);
    }
}
