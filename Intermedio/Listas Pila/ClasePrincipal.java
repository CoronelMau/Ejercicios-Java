import javax.swing.JOptionPane;

public class ClasePrincipal {
  public static void main(String[] args) {
    int option = 0, nodo = 0;
    Pila pila = new Pila();

    do {
      try {

        option = Integer.parseInt(JOptionPane.showInputDialog(null,
            "Menú de Opciones:\n\n"
                + "1. Insertar un nodo\n"
                + "2. Eliminar un nodo\n"
                + "3. ¿La pila está vacía?\n"
                + "4. ¿Cuál es el último valor ingresado de la pila?\n"
                + "5. ¿Cuántos nodos tiene la pila?\n"
                + "6. Vaciar pila\n"
                + "7. Mostrar contenido de la pila\n"
                + "8. Salir \n\n"));

        switch (option) {
          case 1:
            nodo = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Por favor, ingresa el valor a guardar:"));
            pila.insertarNodo(nodo);
            break;
          case 2:
            if (!pila.PilaVacia()) {
              JOptionPane.showMessageDialog(null,
                  "Se ha eliminado un nodo con el valor: "
                      + pila.deleteNodo());
            } else {
              JOptionPane.showMessageDialog(null,
                  "La pila está vacía");
            }
            break;
          case 3:
            if (pila.PilaVacia()) {
              JOptionPane.showMessageDialog(null,
                  "La pila está vacía");
            } else {
              JOptionPane.showMessageDialog(null,
                  "La pila NO está vacía");
            }
            break;
          case 4:
            if (!pila.PilaVacia()) {
              JOptionPane.showMessageDialog(null,
                  "El último valor de la pila es: "
                      + pila.showLastValue());
            } else {
              JOptionPane.showMessageDialog(null,
                  "La pila está vacía");
            }
            break;
          case 5:
            JOptionPane.showMessageDialog(null,
                "La pila contiene: " + pila.pilaSize() + " nodos");
            break;
          case 6:
            if (!pila.PilaVacia()) {
              pila.emptyPila();
              JOptionPane.showMessageDialog(null,
                  "La pila se vació correctamente");
            } else {
              JOptionPane.showMessageDialog(null,
                  "La pila está vacía");
            }
            break;
          case 7:
            pila.showValues();
            break;
          case 8:
            option = 8;
            break;
          default:
            JOptionPane.showMessageDialog(null,
                "Opción incorrecta, vuelve a intentar nuevamente");
            break;
        }

      } catch (NumberFormatException e) {

      }
    } while (option != 8);
  }
}