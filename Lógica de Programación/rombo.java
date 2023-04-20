import java.util.Scanner;

public class rombo {
  public static void main(String[] args) {

    int num1 = 0;
    Scanner entry = new Scanner(System.in);

    System.out.println("Escribe un número:");
    num1 = entry.nextInt();

    int k = num1;
    int l = num1 - 2;

    String triangle1[][] = new String[(num1 * 2) - 1][(num1 * 2) - 1];
    for (int i = 0; i < (num1 * 2) - 1; i++) {
      for (int j = 0; j < (num1 * 2) - 1; j++) {

        if (j > l && j < k) {
          triangle1[i][j] = "+";
        } else {
          triangle1[i][j] = " ";
        }
      }
      l--;
      k++;
    }

    for (int i = 0; i < num1; i++) {
      for (int j = 0; j < (num1 * 2) - 1; j++) {
        System.out.print(triangle1[i][j]);
      }
      System.out.println("");
    }

    int m = 0;
    int n = (num1 * 2) - 2;

    String triangle2[][] = new String[(num1 * 2) - 1][(num1 * 2) - 1];
    for (int i = 0; i < (num1 * 2) - 1; i++) {
      for (int j = 0; j < (num1 * 2) - 1; j++) {

        if (j > m && j < n) {
          triangle2[i][j] = "+";
        } else {
          triangle2[i][j] = " ";
        }
      }
      m++;
      n--;
    }

    for (int i = 0; i < num1; i++) {
      for (int j = 0; j < (num1 * 2) - 1; j++) {
        System.out.print(triangle2[i][j]);
      }
      System.out.println("");
    }
  }
}