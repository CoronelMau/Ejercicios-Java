import java.util.Scanner;

public class Secuence {
  public static void main(String[] args) {

    Scanner entry = new Scanner(System.in);
    int positions = 0;

    System.out.println("¿Cuántos números quieres que tenga la secuencia?");
    positions = entry.nextInt();

    int secuence[] = new int[positions];

    for (int i = 0; i < positions; i++) {
      System.out.println("Escribe un número:");
      secuence[i] = entry.nextInt();
    }

    System.out.println("Los números de la secuencia son: ");
    for (int i = 0; i < positions; i++) {
      System.out.print(secuence[i] + " ");
    }

    for (int i = 0; i < positions; i++) {
      for (int j = 0; j < positions; j++) {
        if (secuence[i] < secuence[j]) {
          int helpInt = secuence[i];
          secuence[i] = secuence[j];
          secuence[j] = helpInt;
        }
      }
    }

    System.out.println("");
    System.out.println("Los números de la secuencia arreglada son: ");
    for (int i = 0; i < positions; i++) {
      System.out.print(secuence[i] + " ");
    }
  }
}