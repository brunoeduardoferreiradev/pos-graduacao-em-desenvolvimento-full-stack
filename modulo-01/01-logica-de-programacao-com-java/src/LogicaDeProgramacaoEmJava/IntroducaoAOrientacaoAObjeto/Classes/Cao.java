package LogicaDeProgramacaoEmJava.IntroducaoAOrientacaoAObjeto.Classes;

public class Cao {
    String nome;
    String cor;
    int idade;
    double peso;

    // Metodo construtor sempre é public
    public Cao(){
        cor = "Caramelo";
    }

    // modificadores de Acesso
    // public -> acesso total ao metodo
    // private -> Bloqueia o metodo podendo ser utilizado somente dentro da classe
    // Protected -> proteção dentro do pacote

    public Cao(String nome, int idade ){
        this.nome =  nome;
        this.idade = idade;
    }


    public void Anda() {
      System.out.println("Estou Andando ");
    }

    public void DadosCao(){
        System.out.print( nome + " " + idade);
    }
}
