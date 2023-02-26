public class Main {
  public static void main(String[] args) {
    int[] passarosPorDia = { 2, 5, 0, 7, 4, 1, 3, 0, 2, 5, 0, 1, 3, 1 };

    int totalPassaros = 0;
    int passarosPrimeira = 0;
    int passarosSegunda = 0;

    for (int i = 0; i < passarosPorDia.length; i++) {
      totalPassaros = totalPassaros + passarosPorDia[i];

      if (i <= 7) {
        passarosPrimeira = passarosPrimeira + passarosPorDia[i];
      }

      if ((i > 7) & (i <= 14)) {
        passarosSegunda = passarosSegunda + passarosPorDia[i];
      }

    }

    System.out.println("Total de Pássaros : " + totalPassaros);
    System.out.println("Total de Pássaros Primeira Semana : " + passarosPrimeira);
    System.out.println("Total de Pássaros Segunda Semana : " + passarosSegunda);
  }
}
