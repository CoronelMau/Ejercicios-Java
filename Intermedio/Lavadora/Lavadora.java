import java.util.Scanner;

public class Lavadora {

  public static class LLFuntions {

    private int kilos = 0, llenadoCompleto = 0, tipoRopa = 0, lavadoCompleto = 0, secadoCompleto = 0;

    public LLFuntions(int kilos, int tipoRopa) {
      this.kilos = kilos;
      this.tipoRopa = tipoRopa;
    }

    private void Llenado() {
      if (kilos <= 12) {
        llenadoCompleto = 1;
        System.out.println("Llenando...");
        System.out.println("Llenado completo.");
      } else {
        System.out.println("La carga de la ropa es muy pesada, reduce la carga");
      }
    }

    private void Lavado() {
      Llenado();
      if (llenadoCompleto == 1) {
        if (tipoRopa == 1) {
          System.out.println("Ropa blanca / lavado suave");
          System.out.println("Lavando...");
          lavadoCompleto = 1;
        } else if (tipoRopa == 2) {
          System.out.println("Ropa de color / lavado intenso");
          System.out.println("Lavando...");
          lavadoCompleto = 1;
        }
      } else {
        System.out.println("El tipo de ropa no está disponible");
        System.out.println("Se lavará como ropa de color / lavado intenso");
        lavadoCompleto = 1;
      }
    }

    private void Secado() {
      Lavado();
      if (lavadoCompleto == 1) {
        System.out.println("Secando...");
        secadoCompleto = 1;
      }
    }

    public void CicloFinalizado() {
      Secado();
      if (secadoCompleto == 1) {
        System.out.println("Tu ropa está lista.");
      }
    }

    // Setter y Getter

    public int getTipoRopa() {
      return tipoRopa;
    }

    public void setTipoRopa(int tipoRopa) {
      this.tipoRopa = tipoRopa;
    }
  }

  public static void main(String[] args) {
    Scanner entry = new Scanner(System.in);

    System.out.println("¿La ropa es blanca o de color?");
    System.out.println("Presiona 1 - Ropa Blanca  / 2 - Ropa de Color");
    int tipoRopa = entry.nextInt();

    System.out.println("¿Cuántos kilos de ropa?");
    int kilos = entry.nextInt();

    LLFuntions mensajero = new LLFuntions(kilos, tipoRopa);
    mensajero.setTipoRopa(2);
    System.out.println("El tipo de ropa es: " + mensajero.getTipoRopa());
    mensajero.CicloFinalizado();
  }
}