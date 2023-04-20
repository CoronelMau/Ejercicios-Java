import java.util.Scanner;

public class Secuencia {
  public static void main(String[] args) {

    int num1 = 0, num2 = 0, num3 = 0;
    Scanner Entry = new Scanner(System.in);

    System.out.println("Ingresa el primer número: ");
    num1 = Entry.nextInt();
    System.out.println("");

    System.out.println("Ingresa el segundo número: ");
    num2 = Entry.nextInt();
    System.out.println("");

    System.out.println("Ingresa el tercer número: ");
    num3 = Entry.nextInt();
    System.out.println("");

    if (num1 < num2) {
      if (num1 < num3) {
        if (num2 < num3) {
          System.out.print(num1 + ", " + num2 + ", " + num3);
        } else if (num2 > num3) {
          System.out.print(num1 + ", " + num3 + ", " + num2);
        }
      } else if (num1 > num3) {
        System.out.print(num3 + ", " + num1 + ", " + num2);
      }
    }

    else if (num2 < num3) {
      if (num2 < num1) {
        if (num1 < num3) {
          System.out.print(num2 + ", " + num1 + ", " + num3);
        } else if (num1 > num3) {
          System.out.print(num2 + ", " + num3 + ", " + num1);
        }
      } else if (num2 > num3) {
        System.out.print(num3 + ", " + num1 + ", " + num2);
      }
    }

    else if (num3 < num1) {
      if (num3 < num2) {
        if (num1 < num2) {
          System.out.print(num3 + ", " + num1 + ", " + num2);
        } else if (num1 > num2) {
          System.out.print(num3 + ", " + num2 + ", " + num1);
        }
      } else if (num3 > num2) {
        System.out.print(num2 + ", " + num3 + ", " + num1);
      }
    }
  }
}
