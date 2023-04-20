import java.util.Scanner;

public class BiArray {
  public static void main(String[] args) {
    int Line = 0, Column = 0, Counter = 1;
    Scanner Entry = new Scanner(System.in);

    System.out.println("¿Cuántas filas quieres que tenga?");
    Line = Entry.nextInt();
    System.out.println("¿Cuántas columnas quieres que tenga?");
    Column = Entry.nextInt();

    int Numbers[][] = new int[Line][Column];
    for (int j = 0; j < Line; j++) {
      for (int i = 0; i < Column; i++) {
        Numbers[j][i] = Counter;
        Counter++;
        System.out.print("[" + Numbers[j][i] + "]");
      }
      System.out.println("");
    }
  }
}