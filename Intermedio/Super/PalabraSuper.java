public class PalabraSuper {
  public static class Padre {
    public void Saludar() {
      System.out.println("Hola, yo soy el Padre");
    }
  }

  public static class Hija extends Padre {
    public void Saludar() {
      super.Saludar();
    }
  }

  public static void main(String[] args) {
    Hija mensajero = new Hija();
    mensajero.Saludar();

  }
}
