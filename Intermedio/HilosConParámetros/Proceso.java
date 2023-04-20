public class Proceso extends Thread {

  int num_int;

  public Proceso(String nomHilo) {
    super(nomHilo);
  }

  @Override
  public void run() {
    for (int i = 0; i <= num_int; i++) {
      System.out.println(i + " " + this.getName());
    }
  }

  public void valorCondicion(int valor) {
    this.num_int = valor;
  }
}