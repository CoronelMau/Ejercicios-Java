public class Trigonometricas {
  public static void main(String[] args) {
    double resultado = 0, anguloGrados = 45, anguloRadianes = Math.toRadians(anguloGrados);

    // Seno
    resultado = Math.sin(anguloRadianes);
    System.out.println("Seno de: " + anguloGrados + " es: " + resultado);

    // Coseno
    resultado = Math.cos(anguloRadianes);
    System.out.println("Coseno de: " + anguloGrados + " es: " + resultado);

    // Tangente
    resultado = Math.tan(anguloRadianes);
    System.out.println("Tangente de: " + anguloGrados + " es: " + resultado);

    double valorIngresado = 0.707;

    // Arco Coseno
    anguloRadianes = Math.acos(valorIngresado);
    anguloGrados = Math.toDegrees(anguloRadianes);

    System.out.println("Arco Coseno de: " + valorIngresado + " es: " + anguloGrados);

    // Arco Seno
    anguloRadianes = Math.asin(valorIngresado);
    anguloGrados = Math.toDegrees(anguloRadianes);

    System.out.println("Arco Seno de: " + valorIngresado + " es: " + anguloGrados);

    // Arco Tangente
    anguloRadianes = Math.atan(valorIngresado);
    anguloGrados = Math.toDegrees(anguloRadianes);

    System.out.println("Arco Tangente de: " + valorIngresado + " es: " + anguloGrados);
  }
}
