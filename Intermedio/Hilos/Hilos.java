public class Hilos {
  public static class Proceso1 extends Thread {

    @Override
    public void run() {
      for (int i = 0; i <= 5; i++) {
        System.out.println("Proceso 1");
      }
    }

  }

  public static class Proceso2 implements Runneable {

    public void run() {
      System.out.println("Proceso 2");
    }
  }

  public static void main(String[] args) {
    Proceso1 mensajero1 = new Proceso1();
    Thread mensajero2 = new Thread(new Proceso2());

    mensajero1.start();
    mensajero2.start();
  }
}
