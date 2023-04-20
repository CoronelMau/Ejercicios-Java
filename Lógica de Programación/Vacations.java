import java.util.Scanner;

public class Vacations {
  public static void main(String args[]) {
    Scanner entry = new Scanner(System.in);
    String name = "";
    int clave = 0, antiguedad = 0;

    System.out.println("**********************************");
    System.out.println("*Bienvenido al sistema vacacional*");
    System.out.println("**********************************");
    System.out.println("");
    System.out.println("");

    System.out.print("¿Cuál es el nombre del trabajador? ");
    name = entry.nextLine();
    System.out.println("");

    System.out.print("¿Cuántos años de servicio tiene el trabajador? ");
    antiguedad = entry.nextInt();
    System.out.println("");

    System.out.print("¿Cuál es la clave del trabajador? ");
    clave = entry.nextInt();
    System.out.println("");

    if (clave == 1) {
      if (antiguedad == 1) {
        System.out.println("" + name + " tienes derecho a 6 días");
      } else if (antiguedad >= 2 && antiguedad <= 6) {
        System.out.println("" + name + " tienes derecho a 14 días");
      } else if (antiguedad >= 7) {
        System.out.println("" + name + " tienes derecho a 20 días");
      } else if (antiguedad <= 1) {
        System.out.println("" + name + " no tienes derecho a vacaciones");
      }
    } else if (clave == 2) {
      if (antiguedad == 1) {
        System.out.println("" + name + " tienes derecho a 7 días");
      } else if (antiguedad >= 2 && antiguedad <= 6) {
        System.out.println("" + name + " tienes derecho a 15 días");
      } else if (antiguedad >= 7) {
        System.out.println("" + name + " tienes derecho a 22 días");
      } else if (antiguedad <= 1) {
        System.out.println("" + name + " no tienes derecho a vacaciones");
      }
    } else if (clave == 3) {
      if (antiguedad == 1) {
        System.out.println("" + name + " tienes derecho a 10 días");
      } else if (antiguedad >= 2 && antiguedad <= 6) {
        System.out.println("" + name + " tienes derecho a 20 días");
      } else if (antiguedad >= 7) {
        System.out.println("" + name + " tienes derecho a 30 días");
      } else if (antiguedad <= 1) {
        System.out.println("" + name + " no tienes derecho a vacaciones");
      }
    } else if (clave != 1 && clave != 2 && clave != 3) {
      System.out.println("La clave que colocaste es incorrecta");
    }
  }
}
