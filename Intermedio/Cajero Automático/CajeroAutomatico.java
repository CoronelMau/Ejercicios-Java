import java.util.Scanner;

public class CajeroAutomatico {
  public static abstract class ClasePadre_Abstracta {

    protected int transacciones, retiro, deposito;
    private static int saldo;
    Scanner entry = new Scanner(System.in);

    public void Operaciones() {
      int bandera = 0;
      int seleccion = 0;

      do {
        do {
          System.out.println("Por favor seleccione una opción: ");
          System.out.println("  1. Consulta de saldo");
          System.out.println("  2. Retiro de efectivo");
          System.out.println("  3. Deposito de efectivo");
          System.out.println("  4. Salir");

          seleccion = entry.nextInt();

          if (seleccion >= 1 && seleccion <= 4) {
            bandera = 1;
          } else {
            System.out.println("--------------------------------------------------");
            System.out.println("Opción no disponible, vuelva a intentar, por favor");
            System.out.println("--------------------------------------------------");
          }
        } while (bandera == 0);

        if (seleccion == 1) {
          ClasePadre_Abstracta mensajero = new ClaseHija_Consulta();
          mensajero.Transacciones();

        } else if (seleccion == 2) {
          ClasePadre_Abstracta mensajero = new ClaseHija_Retiro();
          mensajero.Transacciones();

        } else if (seleccion == 3) {
          ClasePadre_Abstracta mensajero = new ClaseHija_Deposito();
          mensajero.Transacciones();

        } else if (seleccion == 4) {
          System.out.println("--------------------");
          System.out.println("Gracias, vuelva pronto");
          System.out.println("--------------------");
          bandera = 2;
        }
      } while (bandera != 2);
    }

    // Método para solicitar cantidad de retiro
    public void Retiro() {
      retiro = entry.nextInt();
    }

    // Método para solicitar depósito
    public void Deposito() {
      deposito = entry.nextInt();
    }

    // Método asbtracto (Polimorfismo)
    public abstract void Transacciones();

    // Métodos Setter y Getter
    public int getSaldo() {
      return saldo;
    }

    public void setSaldo(int saldo) {
      this.saldo = saldo;
    }

  }

  public static class ClaseHija_Consulta extends ClasePadre_Abstracta {

    @Override
    public void Transacciones() {
      System.out.println("---------------------------------");
      System.out.println("Tu saldo actual es: " + getSaldo());
      System.out.println("---------------------------------");
    }
  }

  public static class ClaseHija_Retiro extends ClasePadre_Abstracta {
    @Override
    public void Transacciones() {
      System.out.print("¿Cuándo deseas retirar? ");
      Retiro();
      if (retiro <= getSaldo()) {
        transacciones = getSaldo();
        setSaldo(transacciones - retiro);
        System.out.println("--------------------------------");
        System.out.println("Retiraste: " + retiro);
        System.out.println("Tu saldo actual es: " + getSaldo());
        System.out.println("--------------------------------");
      } else {
        System.out.println("------------------");
        System.out.println("Saldo insuficiente");
        System.out.println("--------------------");
      }
    }
  }

  public static class ClaseHija_Deposito extends ClasePadre_Abstracta {
    @Override
    public void Transacciones() {
      System.out.print("¿Cuánto deseas depositar? ");
      Deposito();

      transacciones = getSaldo();
      setSaldo(transacciones + deposito);
      System.out.println("---------------------------------");
      System.out.println("Depositaste: " + deposito);
      System.out.println("Tu saldo actual es: " + getSaldo());
      System.out.println("---------------------------------");
    }
  }

  public static void main(String[] args) {
    ClasePadre_Abstracta mensajero = new ClaseHija_Consulta();
    mensajero.setSaldo(500);
    mensajero.Operaciones();
  }
}
