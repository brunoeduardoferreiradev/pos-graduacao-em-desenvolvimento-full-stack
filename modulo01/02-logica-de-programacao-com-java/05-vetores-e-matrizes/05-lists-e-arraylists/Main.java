import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    // Arraylist do tipo String
    ArrayList<String> estados = new ArrayList<>();

    estados.add("ES");
    estados.add("CE");
    estados.add("RJ");
    estados.add("PE");

    estados.remove("CE");

    System.out.println(estados.contains("AM"));

    System.out.println(estados);

  }
}
