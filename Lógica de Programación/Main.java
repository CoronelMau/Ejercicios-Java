import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner entry = new Scanner(System.in);

    System.out.println("Cuantos numeros leere?");
    int number = entry.nextInt();

    int secuence[] = new int[number];

    for (int i = 0; i < number; i++) {
      System.out.println("Ingrese un numero");
      secuence[i] = entry.nextInt();
    }

    System.out.println("Los numeros ingresados son:");
    for (int i = 0; i < number; i++) {
      System.out.print(secuence[i] + " ");
    }

    // Ordenando numeros
    for (int i = 0; i < number; i++) {
      for (int j = 0; j < number; j++) {
        if (secuence[i] < secuence[j]) {
          int backupValueI = secuence[i];
          secuence[i] = secuence[j];
          secuence[j] = backupValueI;
        }
      }
    }

    System.out.println("\nLos numeros ordenados son:");
    for (int i = 0; i < number; i++) {
      System.out.print(secuence[i] + " ");
    }
  }
}