import java.util.Scanner;

public class ConConstructor {

  public ConConstructor() {
    Scanner entry = new Scanner(System.in);
    String nombre = "";

    System.out.println("Con constructor");

    System.out.println("¿Cuál es tu nombre?");
    nombre = entry.nextLine();
    System.out.println("Tu nombre es: " + nombre);
  }
}
