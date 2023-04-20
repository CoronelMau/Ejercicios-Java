import java.util.Scanner;

public class Agenda {

  public static class User {
    public String name;
    public String age;
    public String number;

    User(String name, String age, String number) {
      this.name = name;
      this.age = age;
      this.number = number;

    }

    public void printUser() {

      System.out.println("Nombre: " + name);
      System.out.println("Edad: " + age);
      System.out.println("Número: " + number);
      System.out.println("");

    }
  }

  // Interfaz

  public static void main(String[] args) {

    Scanner entry = new Scanner(System.in);
    int option = 0, numUser = 0, i = 0;
    String name, age, number;

    User agendaUser[] = new User[1000];

    while (option != 4) {
      showMenu();

      System.out.println("Elige una opción: ");
      option = entry.nextInt();

      System.out.println("");

      if (option == 1) {
        if (i == 0) {
          System.out.println("La lista de usuarios está vacía");
        } else {
          System.out.println("La lista de usuarios es: ");
          for (int j = 0; j < i; j++) {
            System.out.println((j + 1) + ")");
            agendaUser[j].printUser();
          }
        }
      } else if (option == 2) {

        System.out.println("Escribe nuevo nombre: ");
        name = entry.next();
        System.out.println("Escribe edad: ");
        age = entry.next();
        System.out.println("Escribe número: ");
        number = entry.next();

        agendaUser[i] = new User(name, age, number);

        i++;

      } else if (option == 3) {

        System.out.println("¿Qué usuario deseas modificar?");

        System.out.println("La lista de usuarios es: ");
        for (int j = 0; j < i; j++) {

          System.out.println((j + 1) + ")");
          agendaUser[j].printUser();
        }

        numUser = entry.nextInt();

        System.out.println("Escribe nuevo nombre: ");
        name = entry.next();
        System.out.println("Escribe edad: ");
        age = entry.next();
        System.out.println("Escribe número: ");
        number = entry.next();

        agendaUser[numUser - 1] = new User(name, age, number);

      } else {
        System.out.println("Opción no disponible");
      }
    }
  }

  static void showMenu() {
    System.out.println("");
    System.out.println("**********Menú**********");
    System.out.println("Elige una opción:");
    System.out.println("1. Mostrar usuarios");
    System.out.println("2. Ingresar nuevo usuario");
    System.out.println("3. Modificar usuario");
    System.out.println("4. Salir");
    System.out.println("");
  }

}
