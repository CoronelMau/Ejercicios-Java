import java.util.Scanner;

public class Excepciones {
  public static void main(String[] args) {

    try {
      // Código inicial

      int valor1, valor2, resultado;
      Scanner entry = new Scanner(System.in);

      System.out.println("Dame el primer valor:");
      valor1 = entry.nextInt();

      System.out.println("Dame el segundo valor: ");
      valor2 = entry.nextInt();

      resultado = valor1 / valor2;

      System.out.println("División es igual a: " + resultado);

    } catch (Exception er) {
      // Comportamiento ante error

      System.out.println("Error" + er);
    } finally {
      System.out.println("Operación concluida");
    }

  }
}