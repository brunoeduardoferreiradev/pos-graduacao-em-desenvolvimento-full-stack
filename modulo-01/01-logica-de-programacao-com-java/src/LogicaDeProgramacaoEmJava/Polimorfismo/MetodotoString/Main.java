package LogicaDeProgramacaoEmJava.Polimorfismo.MetodotoString;

public class Main {
    public static void main(String[] args) {
        String primeira = "Java";
        String segunda = "CSharp";
        String terceira = new String("Python");

        System.out.println(primeira.toUpperCase());
        System.out.println(segunda.length());
        System.out.println(terceira);

        boolean result = primeira.equals(segunda);
        System.out.println("Primeira é igual a segunda : " + result);

        result = segunda.equals(terceira);
        System.out.println("Segunda é igual a terceira : " + result);
    }
}
