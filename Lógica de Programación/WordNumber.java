import java.util.Scanner;

public class WordNumber {
  public static void main(String[] args) {
    Scanner Entry = new Scanner(System.in);
    String Word = "", Substraction = "";
    int Characters = 0, From = 0, Til = 0;

    System.out.print("Introduce una cadena de carácteres: ");
    Word = Entry.nextLine();

    Characters = Word.length();
    System.out.println("La cadena de carácteres " + Word + " posee " + Characters + " carácteres");

    System.out.println("¿Desde qué carácter quieres obtener la nueva cadena?");
    From = Entry.nextInt();
    System.out.println("¿Hasta qué carácter quieres obtener la nueva cadena?");
    Til = Entry.nextInt();

    Substraction = Word.substring(From, Til);
    System.out.println("La nueva cadena es: " + Substraction);
  }
}