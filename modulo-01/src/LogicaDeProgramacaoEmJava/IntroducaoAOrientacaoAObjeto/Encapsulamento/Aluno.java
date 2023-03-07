package LogicaDeProgramacaoEmJava.IntroducaoAOrientacaoAObjeto.Encapsulamento;

/* Modificadores de Acesso no Encapsulamento
*  Modificador       Classe  Pacote  SubCalasse  Projeto(global)
*  Public            Sim     Sim     Sim         Sim
*  Private           Sim     Sim     Sim         Não
*  Protected         Sim     Sim     Não         Não
*  Nenhum            Sim     Não     Não         Não
*/

public class Aluno {
    private String nome;

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

}
