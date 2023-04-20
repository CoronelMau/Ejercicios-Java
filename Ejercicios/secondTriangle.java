import java.util.Scanner;

public class secondTriangle {
  public static void main(String[] args) {

    int num1 = 0;
    Scanner entry = new Scanner(System.in);

    System.out.println("Escribe un número:");
    num1 = entry.nextInt();

    int k = num1;
    int l = num1 - 2;

    String triangle[][] = new String[num1][(num1 * 2) - 1];
    for (int i = 0; i < num1; i++) {
      for (int j = 0; j < (num1 * 2) - 1; j++) {

        if (j > l && j < k) {
          triangle[i][j] = "+";
        } else {
          triangle[i][j] = " ";
        }
      }
      l--;
      k++;
    }

    for (int i = 0; i < num1; i++) {
      for (int j = 0; j < (num1 * 2) - 1; j++) {
        System.out.print(triangle[i][j]);
      }
      System.out.println("");
    }
  }
}
