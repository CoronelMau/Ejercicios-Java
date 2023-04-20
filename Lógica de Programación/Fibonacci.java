public class Fibonacci {
  public static void main(String[] args) {

    int a = 0, b = 1, c = 1, i = 0;

    System.out.println("Sucesión con For:");
    for (i = 1; i <= 10; i++) {
      if (i < 10) {
        System.out.print(a + ", ");
      } else {
        System.out.print(a);
      }
      c = a + b;
      a = b;
      b = c;
    }
    System.out.println("");
    a = 0;
    b = 1;
    c = 1;
    i = 1;

    System.out.println("Sucesión con While:");
    while (i <= 10) {
      if (i < 10) {
        System.out.print(a + ", ");
      } else {
        System.out.print(a);
      }
      c = a + b;
      a = b;
      b = c;
      i++;
    }

    System.out.println("");
    i = 0;
    a = 0;
    b = 1;
    c = 1;

    System.out.println("Sucesión con Do While");
    do {
      if (i < 9) {
        System.out.print(a + ", ");
        c = a + b;
        a = b;
        b = c;
      } else {
        System.out.print(a);
      }
      i++;
    } while (i <= 9);
  }
}
