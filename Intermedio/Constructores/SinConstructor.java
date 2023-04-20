import java.util.Scanner;

public class SinConstructor {

  private Scanner entry = new Scanner(System.in);
  String nombre = "";

  public void pedirNombre() {
    System.out.println("Pedir nombre sin constructor");
    System.out.println("¿Cuál es tu nombre?");
    nombre = entry.nextLine();
  }

  public void Imprimir() {
    System.out.println("Tu nombre es: " + nombre);
    System.out.println("");
  }

}
