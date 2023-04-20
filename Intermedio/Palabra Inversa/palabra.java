import java.util.Scanner;

public class palabra {
  public static class reversed {
    private String word;

    public reversed(String word) {
      this.word = word;
    }

    public void pInversa() {
      int j = 0;

      for (int i = word.length() - 1; i >= 0; i--) {
        System.out.print(word.substring((i), (word.length() - j)));
        j++;
      }
    }
  }

  public static void main(String[] args) {

    String word = "";
    Scanner entry = new Scanner(System.in);

    System.out.println("Ingresa una frase");
    word = entry.nextLine();

    entry.close();

    reversed mensajero = new reversed(word);
    mensajero.pInversa();
  }
}
