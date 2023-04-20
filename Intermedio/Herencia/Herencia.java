import java.util.Scanner;

public class Herencia {
  protected int valor1, valor2, resultado;
  Scanner entry = new Scanner(System.in);

  // Clase para pedir Datos
  public void pedirDatos() {
    System.out.print("Dame un primer valor: ");
    valor1 = entry.nextInt();

    System.out.print("Dame un segundo valor: ");
    valor2 = entry.nextInt();
  }

  public void mostrarResultado() {
    System.out.println(resultado);
  }

  // Clase para Suma
  public static class claseHija_Suma extends Herencia {
    public void Sumar() {
      resultado = valor1 + valor2;
    }
  }

  // Clase para Resta
  public static class claseHija_Resta extends Herencia {
    public void Resta() {
      resultado = valor1 - valor2;
    }
  }

  public static void main(String[] args) {
    claseHija_Suma mensajeroSuma = new claseHija_Suma();
    mensajeroSuma.pedirDatos();
    mensajeroSuma.Sumar();
    System.out.print("El resultado de la suma es: ");
    mensajeroSuma.mostrarResultado();

    claseHija_Resta mensajeroResta = new claseHija_Resta();
    mensajeroResta.pedirDatos();
    mensajeroResta.Resta();
    System.out.print("El resultado de la resta es: ");
    mensajeroResta.mostrarResultado();
  }
}
