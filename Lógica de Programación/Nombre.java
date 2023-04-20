import java.util.Scanner;

public class Nombre {
  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    String name = "";
    int num1 = 0, num2 = 0, result = 0;

    System.out.println("¿Cuál es tu nombre?");
    name = in.nextLine();

    System.out.println("¿Cuál es tu primer número?");
    num1 = in.nextInt();

    System.out.println("¿Cuál es tu segundo número?");
    num2 = in.nextInt();

    result = num1 + num2;
    System.out.println("Hola " + name + " el resultado de la suma es: " + result);
  }
}