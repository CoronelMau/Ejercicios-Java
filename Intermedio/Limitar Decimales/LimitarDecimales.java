import java.text.DecimalFormat;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class LimitarDecimales {
  public static void main(String[] args) {

    double num1 = 2, raiz = Math.sqrt(num1);

    System.out.println("La raíz cuadrada de: " + num1 + " es: " + raiz);

    // DecimalFormat
    DecimalFormat df = new DecimalFormat("#.00");
    System.out.println("La raíz cuadrada de: " + num1 + " es: " + df.format(raiz));

    // String.format
    System.out.println("La raíz cuadrada de: " + num1 + " es: " + String.format("%.2f", raiz));

    // Math.round();
    System.out.println("La raíz cuadrada de: " + num1 + " es: " + (double) Math.round(raiz * 100d) / 100);

    // BigDecimal
    BigDecimal bd = new BigDecimal(raiz);
    bd = bd.setScale(2, RoundingMode.HALF_UP);
    System.out.println("La raíz cuadrada de: " + num1 + " es: " + bd.doubleValue());
  }
}
