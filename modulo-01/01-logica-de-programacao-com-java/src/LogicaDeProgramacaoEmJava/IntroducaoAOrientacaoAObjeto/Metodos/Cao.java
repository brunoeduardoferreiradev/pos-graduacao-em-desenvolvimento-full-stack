package LogicaDeProgramacaoEmJava.IntroducaoAOrientacaoAObjeto.Metodos;

public class Cao {
    private int idade;

    public void setIdade( int idade){
        this.idade = idade;
    }

    public int getIdade(){
        return idade;
    }
    public void Andar(){
        System.out.print("Estou andando");
    }

    public boolean VerificarIdade(){
        if (idade > 10) {
            return true;
        } else {
            return false;
        }
    }
}
