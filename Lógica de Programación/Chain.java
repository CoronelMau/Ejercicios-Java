import java.util.Scanner;

public class Chain {
  public static void main(String[] args) {
    String Name1 = "", Name2 = "";
    Scanner Entry = new Scanner(System.in);

    System.out.println("Escribe un nombre:");
    Name1 = Entry.nextLine();
    System.out.println("Escribe otro nombre:");
    Name2 = Entry.nextLine();

    if (Name1.equals(Name2)) {
      System.out.print("Los nombres son los mismos");
    } else {
      System.out.print("Los nombres son diferentes");
    }
  }
}