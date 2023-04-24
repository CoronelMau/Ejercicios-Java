import javax.swing.JOptionPane;

public class Pila {

  private Nodo lastValue;
  int size = 0;
  String list = "";

  public Pila() {
    lastValue = null;
    size = 0;
  }

  // Método para saber si está vacío
  public boolean PilaVacia() {
    return lastValue == null;
  }

  // Método para insertar un nodo
  public void insertarNodo(int nodo) {
    Nodo newNodo = new Nodo(nodo);

    newNodo.next = lastValue;
    lastValue = newNodo;
    size++;
  }

  // Método para eliminar nodo
  public int deleteNodo() {
    int auxiliar = lastValue.informacion;
    lastValue = lastValue.next;
    size--;
    return auxiliar;
  }

  // Método para saber último valor
  public int showLastValue() {
    return lastValue.informacion;
  }

  // Método para saber tamaño de pila
  public int pilaSize() {
    return size;
  }

  // Método para vaciar pila
  public void emptyPila() {
    while (!PilaVacia()) {
      deleteNodo();
    }
  }

  // Método para mostrar contenido de pila
  public void showValues() {
    Nodo recorrido = lastValue;

    while (recorrido != null) {
      list += recorrido.informacion + "\n";
      recorrido = recorrido.next;
    }
    JOptionPane.showMessageDialog(null, list);
    list = "";
  }
}
