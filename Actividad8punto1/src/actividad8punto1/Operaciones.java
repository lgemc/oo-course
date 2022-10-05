package actividad8punto1;

public class Operaciones {

    public nodo añadirAlFinal(nodo cabeza, nodo nuevo) {
        if (cabeza != null) {
            nodo recorrer = cabeza;
            while (recorrer.siguiente != null) {
                recorrer = recorrer.siguiente;
            }
            recorrer.siguiente = nuevo;
            nuevo.siguiente = null;
        } else {
            cabeza = nuevo;
        }
        return cabeza;
    }

    public nodo añadirAlInicio(nodo cabeza, nodo nuevo) {
        nuevo.siguiente = cabeza;
        
        return nuevo;
    }
 
 
    
    

    public nodo buscar(nodo cabeza, String nombreCiudad) {
        nodo recorrer = cabeza;
        while ((recorrer != null) && (!recorrer.informacion.ciudad.equals(nombreCiudad))) {
            recorrer = recorrer.siguiente;
        }
        if (recorrer != null) {
            return recorrer;
        } else {
            return null;
        }
    }

    public nodo modificar(nodo cabeza, String ciudadbuscada, String nuevaCiudad, String nuevoDepartamento) {
        nodo recorrer = cabeza;
        while ((recorrer != null) && (!recorrer.informacion.ciudad.equals(ciudadbuscada))) {
            recorrer = recorrer.siguiente;
        }
        if (recorrer != null) {
            recorrer.informacion.ciudad = nuevaCiudad;
            recorrer.informacion.departamento = nuevoDepartamento;
        }
        return cabeza;
    }

    public void listar(nodo cabeza) {
        nodo recorrer = cabeza;
        while (recorrer != null) {
            System.out.println("lista numeros: " + recorrer.informacion.numero);

            System.out.println("----------------------------------------------------");
            recorrer = recorrer.siguiente;
        }
    }

    nodo eliminar(nodo cabeza, String nombreCiudad) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
