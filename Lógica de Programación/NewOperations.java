import java.util.Scanner;

public class NewOperations {
  public static void main(String[] args) {
    Scanner entry = new Scanner(System.in);
    int num1 = 0, num2 = 0, result = 0;
    int parameter = 0;

    System.out.println("Elige un número: ");
    num1 = entry.nextInt();
    System.out.println("Elige otro número: ");
    num2 = entry.nextInt();
    System.out.println("Elige un némro del 1 al 4");
    parameter = entry.nextInt();

    switch (parameter) {
      case 1:
        result = num1 + num2;
        System.out.println("El resultado de la suma es: " + result);
        break;
      case 2:
        result = num1 - num2;
        System.out.println("El resultado de la resta es: " + result);
        break;
      case 3:
        result = num1 * num2;
        System.out.println("El resultado de la multiplicación es: " + result);
        break;
      case 4:
        result = num1 / num2;
        System.out.println("El resultado de la división es: " + result);
        break;
      default:
        System.out.println("El parámetro es incorrecto");
        break;
    }
  }
}