import java.util.Scanner;

public class Name {
  public static void main(String[] args) {
    Scanner entry = new Scanner(System.in);
    String name = "";

    System.out.println("¿Cuál es tu nombre? ");
    name = entry.nextLine();
    System.out.println("");
    System.out.println("Tu nombre es: " + name);
  }
}
