public class ClasePrincipal {
  public static void main(String[] args) {

    int matrizUno[][] = new int[2][3];
    int matrizDos[][] = new int[3][2];
    int matrizRestultante[][] = new int[2][2];

    // Llenado de matriz 1
    for (int i = 0; i < 2; i++) {
      for (int j = 0; j < 3; j++) {
        matrizUno[i][j] = (int) (Math.random() * 5);
      }
    }

    // Llenado de matriz 2
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 2; j++) {
        matrizDos[i][j] = (int) (Math.random() * 5);
      }
    }

    // Multiplicación de Matrices
    for (int i = 0; i < 4; i++) {
      if (matrizRestultante[0][0] == 0) {
        int temporal = (matrizUno[0][0] * matrizDos[0][0])
            + (matrizUno[0][1] * matrizDos[1][0])
            + (matrizUno[0][2] * matrizDos[2][0]);

        matrizRestultante[0][0] = temporal;

      } else if (matrizRestultante[1][0] == 0) {
        int temporal = (matrizUno[1][0] * matrizDos[0][0])
            + (matrizUno[1][1] * matrizDos[1][0])
            + (matrizUno[1][2] * matrizDos[2][0]);

        matrizRestultante[1][0] = temporal;

      } else if (matrizRestultante[0][1] == 0) {
        int temporal = (matrizUno[0][0] * matrizDos[0][1])
            + (matrizUno[0][1] * matrizDos[1][1])
            + (matrizUno[0][2] * matrizDos[2][1]);

        matrizRestultante[0][1] = temporal;
      } else if (matrizRestultante[1][1] == 0) {
        int temporal = (matrizUno[1][0] * matrizDos[0][1])
            + (matrizUno[1][1] * matrizDos[1][1])
            + (matrizUno[1][2] * matrizDos[2][1]);

        matrizRestultante[1][1] = temporal;
      }
    }

    // Imprimir matrices
    for (int i = 0; i < 3; i++) {
      if (i < 2) {
        for (int j = 0; j < 3; j++) {
          System.out.print("[" + matrizUno[i][j] + "]");
        }
        if (i == 1) {
          System.out.print(" * ");
        } else {
          System.out.print("   ");
        }
      } else {
        System.out.print("            ");
      }

      for (int j = 0; j < 2; j++) {
        System.out.print("[" + matrizDos[i][j] + "]");
      }
      if (i == 1) {
        System.out.print(" = ");
      } else {
        System.out.print("   ");
      }
      if (i < 2) {
        for (int j = 0; j < 2; j++) {
          System.out.print("[" + matrizRestultante[i][j] + "]");
        }
      }
      System.out.println("");
    }
  }
}