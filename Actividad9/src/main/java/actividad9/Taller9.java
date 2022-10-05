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
    public static void punto2() throws IOException {
        ListaDoblementeEnlazada lista = new ListaDoblementeEnlazada();

        int celularesInscritos = 0;
        while (celularesInscritos < 3) {
            System.out.println("Ingrese la marca de un celular:");

            String marca = ManagerEntradaSalidaConsola.leerString();

            lista.añadirNodo(new Nodo(marca));

            celularesInscritos++;
        }

        System.out.println("--- Marcas ingresadas ----");
        ManejadorDeListasDoblementeEnlazadas.pintar(lista.cabeza());
    }

    // Realice una lista doblemente encadenada donde capture por teclado la lista de cinco países
    // con sus capitales e imprima el primero y el último solamente.
    public static void punto3() throws IOException {
        ListaDoblementeEnlazada lista = new ListaDoblementeEnlazada();

        int paisesInscritos = 0;
        while (paisesInscritos < 5) {
            System.out.print("Ingrese el pais:");

            String marca = ManagerEntradaSalidaConsola.leerString();

            lista.añadirNodo(new Nodo(marca));

            paisesInscritos++;
        }

        System.out.printf("El primer pais fue %s, el ultimo fue %s\n",
                lista.cabeza().info,
                lista.cola().info);
    }
    
    // Realice una lista doblemente encadenada donde realice una serie de N números.
    // Capture por teclado un valor e indique “si está” en la lista “o no esta”.
    public static void punto4() throws IOException {
        System.out.println("Vamos a generar una lista de los primeros n numeros (de 0 a n)");
        System.out.print("Ingrese n: ");
        
        Integer maximoNumero = ManagerEntradaSalidaConsola.leerInt();
        ListaDoblementeEnlazada<Integer> lista = new ListaDoblementeEnlazada();
        for(int i = 0; i < maximoNumero ; i++) {
            lista.añadirNodo(new Nodo(i));
        }

        System.out.print("Ingrese que numero quiere buscar en la lista ");
        Integer numeroABuscar = ManagerEntradaSalidaConsola.leerInt();
        
        boolean existe = lista.existe(numeroABuscar);
        if (existe) {
            System.out.println("el numero existe");
             return;
        }
        
          System.out.println("el numero no existe");
    }
}
