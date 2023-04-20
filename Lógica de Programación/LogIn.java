import java.util.Scanner;

public class LogIn {
  public static void main(String[] args) {
    Scanner Entry = new Scanner(System.in);
    String Mail1 = "", Mail2 = "";
    String Password1 = "", Password2 = "";

    System.out.println("Bienvenido al Registro:");
    System.out.println("");
    System.out.println("Ingrese un correo: ");
    Mail1 = Entry.nextLine();
    System.out.println("Ingrese una contraseña: ");
    Password1 = Entry.nextLine();
    System.out.println("");
    System.out.println("Inicio de sesión");
    System.out.println("");
    System.out.println("Ingrese su correo: ");
    Mail2 = Entry.nextLine();
    System.out.println("Ingrese su contraseña:");
    Password2 = Entry.nextLine();

    if (Mail1.equals(Mail2) && Password1.equals(Password2)) {
      System.out.println("Acceso correcto");
    } else {
      System.out.println("Correo o contraseña incorrectos");
    }
  }
}
