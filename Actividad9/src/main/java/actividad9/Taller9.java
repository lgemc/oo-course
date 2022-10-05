package actividad9;

import java.io.IOException;

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
    // Realice una lista doblemente encadenada donde capture por teclado los datos de tres tipos de celular
    // (marca, Modelo, numero, dueño, cc dueño) y los muestre numerando el nodo donde se encuentra (1, 2 y 3)
    public static void punto2()  throws IOException {
        ConstructorDeListas constructor = new ConstructorDeListas();
        
        int celularesInscritos = 1;
        while(celularesInscritos <= 3) {
            System.out.println("Ingrese la marca de un celular:");
            
            String marca = ManagerEntradaSalidaConsola.leerString();
            
            constructor.añadirNodo(new Nodo(marca));
            
            celularesInscritos++;
        }
        
        System.out.println("--- Marcas ingresadas ----");
        ManejadorDeListasDoblementeEnlazadas.pintar(constructor.cabeza());
    }
}
