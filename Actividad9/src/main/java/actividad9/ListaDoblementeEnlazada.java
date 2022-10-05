/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad9;

/**
 *
 * @author lmanrique
 */
public class ListaDoblementeEnlazada {
    private Nodo cabeza;
    private Nodo cola;
    
    // al inicio ambos, cabeza y cola estarán vacios
    ListaDoblementeEnlazada() {
        cabeza = null;
        cola = cabeza;
    }
    
    public Nodo cabeza() {
        return this.cabeza;
    }
    
    public Nodo cola() {
        return this.cola;
    }
    
    // caso especial donde la cabeza y la cola son el mismo
    private void añadirPrimerNodo(Nodo nodo) {
        this.cabeza = nodo;
        this.cola = cabeza;
    }
    
    private void añadirNodoAlFinal(Nodo nodo) {
        this.cola.siguiente = nodo;
        this.cola = nodo;
    }
        
    private boolean hayNodos() {
        return this.cabeza != null;
    }
    
    public void añadirNodo(Nodo nodo) {
        if(!this.hayNodos()) {
            añadirPrimerNodo(nodo);
            
            return;
        }
        
        this.añadirNodoAlFinal(nodo);
    }
}
