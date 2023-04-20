import java.util.Scanner;

public class DynamicArray {
  public static void main(String[] args) {

    Scanner Entry = new Scanner(System.in);
    int Long = 0;

    System.out.println("¿Cuántos espacios quieres tener?");
    Long = Entry.nextInt();

    int Numbers[] = new int[Long];
    for (int i = 0; i < Numbers.length; i++) {
      System.out.println("Por favor dame el #" + (i + 1));
      Numbers[i] = Entry.nextInt();
    }
    for (int i = 0; i < Numbers.length; i++) {
      System.out.print("[" + Numbers[i] + "]");
    }
  }
}