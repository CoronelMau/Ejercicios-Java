import java.util.Scanner;

public class Main2 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Escribe un número");
    int size = input.nextInt();

    for (int i = 0; i < size; i++) {
      for (int j = 0; j < size - i - 1; j++) {
        System.out.print(" ");
      }

      for (int j = 0; j < 2 * i + 1; j++) {
        System.out.print("*");
      }

      System.out.println();
    }

    input.close();
  }
}