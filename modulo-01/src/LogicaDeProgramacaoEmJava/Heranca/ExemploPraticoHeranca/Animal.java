package LogicaDeProgramacaoEmJava.Heranca.ExemploPraticoHeranca;

public class Animal {
   private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void Comer(){
        System.out.println("Eu gosto de Comer !!!");
    }
}
