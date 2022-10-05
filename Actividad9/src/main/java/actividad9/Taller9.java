package actividad9;

/**
 *
 * @author Estiven Cardona
 */
public class Taller9 {
    // Realice una lista doblemente encadenada que permita mostrar los números impares del 3 al 11.
    public static void punto1() {
        Nodo cabezaDeImpares = ManejadorDeListasDoblementeEnlazadas.crearListaDeImpares(3, 11);
        ManejadorDeListasDoblementeEnlazadas.pintar(cabezaDeImpares);
    }
}
