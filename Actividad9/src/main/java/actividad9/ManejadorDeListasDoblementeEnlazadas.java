package actividad9;

import java.util.ArrayList;

/**
 *
 * @author Estiven Cardona
 */
public class ManejadorDeListasDoblementeEnlazadas {
    public static void pintar(Nodo nodo) {        
        while(nodo != null) {
            System.out.println(nodo.info);
            nodo = nodo.siguiente;
        }
    }
   
    public static Nodo crearListaDeImpares(int numeroInicial, int numeroFinal) {
        ArrayList<Integer> impares = ManejadorDeListasDeNumeros.crearArrayDeImpares(numeroInicial, numeroFinal);
        
        ListaDoblementeEnlazada lista = new ListaDoblementeEnlazada();
        
        for(Integer infoParaElNodo: impares) {
            lista.añadirNodo(new Nodo(infoParaElNodo));
        }
        
        return lista.cabeza();
    }
}
