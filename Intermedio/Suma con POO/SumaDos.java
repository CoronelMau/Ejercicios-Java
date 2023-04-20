import java.util.Scanner;

public class SumaDos {
  public static class Suma {
    private int vUno, vDos, vResultado;

    public Suma(int valorUno, int valorDos) {
      this.vUno = valorUno;
      this.vDos = valorDos;
    }

    public void Operaciones() {
      vResultado = vUno + vDos;
    }

    public void Imprimir() {
      Operaciones();
      System.out.println("El resultado de la suma es: " + vResultado);
    }
  }

  public static void main(String[] args) {

    Scanner entry = new Scanner(System.in);

    System.out.println("Dame un número: ");
    int num1 = entry.nextInt();

    System.out.println("Dame un segundo valor: ");
    int num2 = entry.nextInt();

    entry.close();

    Suma valores = new Suma(num1, num2);
    valores.Imprimir();
  }
}