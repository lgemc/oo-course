/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad9;

import java.util.ArrayList;

/**
 *
 * @author lmanrique
 */
public class ManejadorDeListasDeNumeros {
        public static ArrayList<Integer> crearArrayDeImpares(int numeroInicial, int numeroFinal) {
        if (numeroInicial %2 == 0) {
            return null;
        }
        
        ArrayList<Integer> lista = new ArrayList();
        
        int numeroActual = numeroInicial;
        while(numeroActual <= numeroFinal) {
            lista.add(numeroActual);
            
            numeroActual+=2;
        }
        
        return lista;
    }
}
