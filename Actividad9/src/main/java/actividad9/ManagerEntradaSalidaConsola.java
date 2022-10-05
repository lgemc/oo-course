package actividad9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lmanrique
 */
public class ManagerEntradaSalidaConsola {
    public static String leerString() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        return reader.readLine();
    }
    
    public static Integer leerInt() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        return Integer.valueOf(reader.readLine());
    }
}
