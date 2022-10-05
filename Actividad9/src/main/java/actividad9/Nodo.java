package actividad9;

/**
 *
 * @author Estiven Cardona
 */
public class Nodo<T> {
    public T info;
    public Nodo siguiente, anterior;
    
    public Nodo(T valor) {
        this.info = valor;
    }
    
    public Nodo() {
        this.info = null;
        this.siguiente = null;
        this.anterior = null;
    }
}