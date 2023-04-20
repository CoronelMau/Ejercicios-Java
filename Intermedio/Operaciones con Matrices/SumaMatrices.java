public class SumaMatrices {
  public static void main(String[] args) {

    int matriz_1[][] = new int[3][3];
    int matriz_2[][] = new int[3][3];
    int resultado[][] = new int[3][3];

    // Llenado de primer matriz
    for (int i = 0; i < matriz_1.length; i++) {
      for (int j = 0; j < matriz_1.length; j++) {
        matriz_1[i][j] = (int) (Math.random() * 5);
      }
    }

    // Llenado de segunda matriz
    for (int i = 0; i < matriz_2.length; i++) {
      for (int j = 0; j < matriz_2.length; j++) {
        matriz_2[i][j] = (int) (Math.random() * 5);
      }
    }

    // Suma o resta de matrices
    for (int i = 0; i < matriz_1.length; i++) {
      for (int j = 0; j < matriz_2.length; j++) {
        resultado[i][j] = matriz_1[i][j] + matriz_2[i][j];
      }
    }

    // Imprimir matrices
    for (int i = 0; i < matriz_1.length; i++) {

      for (int j = 0; j < matriz_1.length; j++) {
        System.out.print("[" + matriz_1[i][j] + "]");
      }

      if (i == 1) {
        System.out.print(" + ");
      } else {
        System.out.print("   ");
      }

      for (int j = 0; j < matriz_2.length; j++) {
        System.out.print("[" + matriz_2[i][j] + "]");
      }

      if (i == 1) {
        System.out.print(" = ");
      } else {
        System.out.print("   ");
      }

      for (int j = 0; j < resultado.length; j++) {
        System.out.print("[" + resultado[i][j] + "]");
      }

      System.out.println("");
    }
  }
}
