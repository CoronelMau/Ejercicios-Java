import javax.swing.JOptionPane;

public class Pila {
  private Nodo lastValue;

  public Pila() {
    lastValue = null;
  }

  // M´étodo para insertar en la pila
  public void Insertar(char valor) {
    Nodo newNodo = new Nodo();
    newNodo.information = valor;

    if (lastValue == null) {

      newNodo.next = null;
      lastValue = newNodo;

    } else {
      newNodo.next = lastValue;
      lastValue = newNodo;
    }
  }

  // Método para extrar de pila
  public char Extract() {
    if (lastValue != null) {
      char information = lastValue.information;
      lastValue = lastValue.next;
      return information;
    } else {
      return Character.MAX_VALUE;
    }
  }

  // Método para saber si la pila está vacía
  public boolean emptyPila() {
    return lastValue == null;
  }
}
