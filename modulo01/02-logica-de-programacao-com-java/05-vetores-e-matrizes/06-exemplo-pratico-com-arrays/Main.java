import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    ArrayList<String> bandas = new ArrayList<>();

    bandas.add("Kiss");
    bandas.add("Beatles");
    bandas.add("Iron Maiden");
    bandas.add("AC/DC");

    System.out.println(bandas);

    bandas.add(bandas.indexOf("Kiss"), "System of a Down");

    System.out.println(bandas);

    bandas.remove("Kiss");

    System.out.println(bandas);

    bandas.clear();

    System.out.println(bandas);
  }
}
