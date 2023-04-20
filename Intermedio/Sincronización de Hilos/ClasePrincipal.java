public class ClasePrincipal {
  public static void main(String[] args) {
    Hilo1 hilo1 = new Hilo1();
    Hilo2 hilo2 = new Hilo2();
    Hilo3 hilo3 = new Hilo3();
    Hilo4 hilo4 = new Hilo4();

    // Hilo 1
    hilo1.start();
    try {
      hilo1.sleep(10);
    } catch (InterruptedException e) {
      System.out.println("Error en Hilo1" + e);
    }

    // Hilo 2
    hilo2.start();
    try {
      hilo2.sleep(10);
    } catch (InterruptedException e) {
      System.out.println("Error en Hilo2" + e);
    }

    // Hilo 3
    hilo3.start();
    try {
      hilo3.sleep(10);
    } catch (InterruptedException e) {
      System.out.println("Error en Hilo3" + e);
    }

    // Hilo 4
    hilo4.start();
    try {
      hilo4.sleep(10);
    } catch (InterruptedException e) {
      System.out.println("Error en Hilo4" + e);
    }

  }
}