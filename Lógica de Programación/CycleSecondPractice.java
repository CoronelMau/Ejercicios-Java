public class CycleSecondPractice {
  public static void main(String[] args) {

    int i = 1;
    int j = 99;

    System.out.println("Sucesión con For: ");
    for (i = 1; i <= 5; i++) {
      if (i < 5) {
        System.out.print(i + ", " + j + ", ");
      } else {
        System.out.print(i + ", " + j);
      }
      j--;
    }

    System.out.println("");
    i = 1;
    j = 99;

    System.out.println("Sucesión con While: ");
    while (i <= 5) {
      if (i < 5) {
        System.out.print(i + ", " + j + ", ");
      } else {
        System.out.print(i + ", " + j);
      }
      i++;
      j--;
    }

    System.out.println("");
    i = 1;
    j = 99;

    System.out.println("Sucesión con Do While:");
    do {
      if (i < 5) {
        System.out.print(i + ", " + j + ", ");
      } else {
        System.out.print(i + ", " + j);
      }
      i++;
      j--;
    } while (i <= 5);
  }
}
