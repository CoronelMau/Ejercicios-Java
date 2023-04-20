import java.util.Scanner;

public class Triangle {
  public static void main(String[] args) {

    Scanner Entry = new Scanner(System.in);
    int num1 = 0;

    System.out.println("Escribe un número: ");
    num1 = Entry.nextInt();

    for (int i = 1; i <= num1; i++) {
      int j = 0;

      while (j < i) {
        System.out.print("*");
        j++;
      }
      System.out.println("");
    }
  }
}
