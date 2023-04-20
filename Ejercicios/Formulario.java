import java.util.Scanner;

public class Formulario {
  public static class User {
    public String name;
    public String age;
    public String number;

    User(String name, String age, String number) {
      this.name = name;
      this.age = age;
      this.number = number;
    }
  }

  public static void main(String[] args) {
    String name;
    String age;
    String number;

    User users[] = new User[1000];

    // System.out.println(newUser.name + " " + newUser.age + " " + newUser.number);

    int amountUsers = 0;

    int choice = 0;
    Scanner entry = new Scanner(System.in);

    while (choice != 4) {
      showMenu();
      choice = entry.nextInt();

      if (choice == 1) {
        showUsers(name[], age[], number[], amountUsers);
      } else if (choice == 2) {
        System.out.println("Ingresa nuevo usuario: ");
        name = entry.next();

        System.out.println("Ingresa edad de usuario: ");
        age = entry.next();

        System.out.println("Ingresa número de usuario: ");
        number = entry.next();

        User newUser = new User(name, age, number);

        amountUsers++;
      } else if (choice == 3) {
        System.out.println("¿Qué usuario quieres modificar?");
        showUsers(name, age, number, amountUsers);

        int i = 0;
        i = entry.nextInt();

        if (i <= 0 || i > amountUsers) {
          System.out.println("No es un usuraio valido");
        } else {
          System.out.println("Ingresa nuevo usuario: ");
          name[i - 1] = entry.next();

          System.out.println("Ingresa edad de usuario: ");
          age[i - 1] = entry.next();

          System.out.println("Ingresa número de usuario: ");
          number[i - 1] = entry.next();
        }
      }
    }

    entry.close();
  }

  public static void showMenu() {
    System.out.println("");
    System.out.println("**********Menú**********");
    System.out.println("Elige una opción:");
    System.out.println("1. Mostrar usuarios");
    System.out.println("2. Ingresar nuevo usuario");
    System.out.println("3. Modificar usuario");
    System.out.println("4. Salir");
    System.out.println("");
  }

  // ...(User[] users, int amountUsers)
  public static void showUsers(String name[], String age[], String number[], int amountUsers) {
    System.out.println("La lista de usuarios es: ");

    for (int i = 0; i < amountUsers; i++) {
      System.out.println(i + 1 + ")");
      System.out.println("Nombre: " + name[i]);
      System.out.println("Edad: " + age[i]);
      System.out.println("Número: " + number[i]);
      System.out.println("");
    }
  }
}
