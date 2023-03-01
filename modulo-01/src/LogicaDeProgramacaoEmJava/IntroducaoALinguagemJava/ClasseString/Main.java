package LogicaDeProgramacaoEmJava.IntroducaoALinguagemJava.ClasseString;

public class Main {
    public static void main(String[] args) {
        String valor = "Descomplica - Java";

        // Verifica se a palavra Java Existe na String
        System.out.println(valor.contains("Java"));
        // Pega o tamanho da String
        System.out.println(valor.length());
        // Concatena uma string com a outra
        System.out.println(valor.concat("Full Stack Developer"));
        // Extrai uma string de outra string
        System.out.println(valor.substring(4));
        // comapra duas strings
        System.out.println(valor.equals("Java"));
        // Substitui uma string pela outra
        System.out.println(valor.replace("Java", "C#"));
    }
}
