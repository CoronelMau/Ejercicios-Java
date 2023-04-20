public class Operations {
  public static void main(String args[]) {

    int operations = 5;
    int num1 = 5;
    int num2 = 8;
    int result = 0;

    if (operations == 1) {
      result = num1 + num2;
      System.out.println("El resultado de la suma es: " + result);
    } else if (operations == 2) {
      result = num1 - num2;
      System.out.println("El resultado de la resta es: " + result);
    } else if (operations == 3) {
      result = num1 * num2;
      System.out.println("El resultado de la multiplicación es: " + result);
    } else if (operations == 4) {
      result = num1 / num2;
      System.out.println("El resultado de la división es: " + result);
    } else if (operations >= 5) {
      System.out.println("El número del usuario es 5 o mayor");
    }
  }
}