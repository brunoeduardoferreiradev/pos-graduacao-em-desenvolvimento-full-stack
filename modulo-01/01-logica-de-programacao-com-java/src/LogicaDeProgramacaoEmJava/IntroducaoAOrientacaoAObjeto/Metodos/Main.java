package LogicaDeProgramacaoEmJava.IntroducaoAOrientacaoAObjeto.Metodos;

public class Main {
    public static void main(String[] args) {
        Cao cao = new Cao();
        cao.setIdade(5);
        if (cao.VerificarIdade() == true){
          System.out.print("Ele é idoso");
        } else {
            System.out.print("Ele é novinho");
        }
    }
}
