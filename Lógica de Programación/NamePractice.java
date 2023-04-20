import java.util.Scanner;

public class NamePractice {
  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    String name = "";
    int num1 = 0, num2 = 0, result = 0, operation = 0;

    System.out.println("¿Cuál es tu nombre?");
    name = in.nextLine();

    System.out.println("¿Cuál es tu primer número?");
    num1 = in.nextInt();

    System.out.println("¿Cuál es tu segundo número?");
    num2 = in.nextInt();

    System.out.println("¿qué quieres hacer? Suma = 1, Resta = 2, Multiplicación = 3, División = 4");
    operation = in.nextInt();

    if (operation == 1) {
      result = num1 + num2;
      System.out.println("Hola " + name + " la suma de tus números es: " + result);
    } else if (operation == 2) {
      result = num1 - num2;
      System.out.println("Hola " + name + " la resta de tus números es: " + result);
    } else if (operation == 3) {
      result = num1 * num2;
      System.out.println("Hola " + name + " la multiplicación de tus números es " + result);
    } else if (operation == 4) {
      result = num1 / num2;
      System.out.println("Hola " + name + " la división de tus números es " + result);
    } else if (operation >= 5) {
      System.out.println("Operación no válida");
    } else if (operation == 0) {
      System.out.println("Operación no válida");
    }
  }
}