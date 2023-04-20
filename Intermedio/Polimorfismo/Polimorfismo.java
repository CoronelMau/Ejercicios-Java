import java.util.Scanner;

public abstract class Polimorfismo {
  protected int valor1, valor2, resultado;
  Scanner entry = new Scanner(System.in);

  public void pedirDatos() {
    System.out.print("Dame el primer valor: ");
    valor1 = entry.nextInt();

    System.out.print("Dame el segundo valor: ");
    valor2 = entry.nextInt();
  }

  public abstract void Operaciones();

  public void mostrarResultado() {
    System.out.println("El resultado es: " + resultado);
  }

  public static class Suma_Hija extends Polimorfismo {
    @Override
    public void Operaciones() {
      resultado = valor1 + valor2;
    }
  }

  public static class Resta_Hija extends Polimorfismo {
    @Override
    public void Operaciones() {
      resultado = valor1 - valor2;
    }
  }

  public static void main(String[] args) {
    Polimorfismo mensajero_Suma = new Suma_Hija();
    mensajero_Suma.pedirDatos();
    mensajero_Suma.Operaciones();
    mensajero_Suma.mostrarResultado();

    Polimorfismo mensajero_Resta = new Resta_Hija();
    mensajero_Resta.pedirDatos();
    mensajero_Resta.Operaciones();
    mensajero_Resta.mostrarResultado();
  }
}
