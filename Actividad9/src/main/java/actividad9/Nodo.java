package actividad9;

/**
 *
 * @author Estiven Cardona
 */
public class Nodo {
    public int info;
    public Nodo siguiente, anterior;
    
    public Nodo(int valor) {
        this.info = valor;
    }
    
    public Nodo() {
        this.info = 0;
        this.siguiente = null;
        this.anterior = null;
    }
}