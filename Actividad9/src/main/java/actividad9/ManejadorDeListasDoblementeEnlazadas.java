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
        
        ConstructorDeListas constructor = new ConstructorDeListas();
        
        for(Integer infoParaElNodo: impares) {
            constructor.añadirNodo(new Nodo(infoParaElNodo));
        }
        
        return constructor.cabeza();
    }
}
