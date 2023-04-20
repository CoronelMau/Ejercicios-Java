import java.util.Scanner;

public class CookieBuildings {
  public static void main(String[] args) {

    double Price = 0, NumberB = 0;
    Scanner Entry = new Scanner(System.in);

    System.out.println("Bienvenido al calculador de edificios en Cookie Clicker");
    System.out.println("");
    System.out.println("Ingresa el precio actual");
    Price = Entry.nextDouble();
    System.out.println("Ingresa el número de edificios que quieres comprar");
    NumberB = Entry.nextInt();

    for (int i = 0; i < NumberB; i++) {
      System.out.println("El precio para " + (i + 1) + " es: " + Price;
      Price = Price * 1.15;
    }
  }
}
