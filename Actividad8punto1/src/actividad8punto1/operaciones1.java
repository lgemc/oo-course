package actividad8punto1;

public class operaciones1 {

    public nodo añadir(nodo cabeza, nodo nuevo) {
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

    public nodo eliminar(nodo cabeza, String codigo) {
        nodo recorrer = cabeza;
        nodo anterior = null;
        while ((recorrer != null) && (!recorrer.informacion.codigo.equals(codigo))) {
            anterior = recorrer;
            recorrer = recorrer.siguiente;
        }
        if (recorrer != null) {
            if (anterior != null) {
                anterior.siguiente = recorrer.siguiente;
                recorrer.siguiente = null;
            } else if (anterior == null) {
                cabeza = recorrer.siguiente;
                recorrer.siguiente = null;
            }
            System.out.println("nodo eliminado");
        } else {
            System.out.println("no existe el nodo");
        }
        return cabeza;
    }

    public nodo buscar(nodo cabeza, String codigo) {
        nodo recorrer = cabeza;
        while ((recorrer != null) && (!recorrer.informacion.codigo.equals(codigo))) {
            recorrer = recorrer.siguiente;
        }
        if (recorrer != null) {
            return recorrer;
        } else {
            return null;
        }
    }

    public nodo modificar(nodo cabeza, String codigo, String ncodigo, String nnombre, String npresentacion, String ncantidad, String nvalor, String nvalortotal) {
        nodo recorrer = cabeza;
        while ((recorrer != null) && (!recorrer.informacion.codigo.equals(ncodigo))) {
            recorrer = recorrer.siguiente;
        }
        if (recorrer != null) {
            recorrer.informacion.codigo = ncodigo;
            recorrer.informacion.nombre = nnombre;
            recorrer.informacion.presentacion = npresentacion;
            recorrer.informacion.valorunitario = nvalor;
            recorrer.informacion.valortotal = nvalortotal;

        }
        return cabeza;
    }

    public void listar(nodo cabeza) {
        nodo recorrer = cabeza;
        while (recorrer != null) {
            System.out.println("codigo: " + recorrer.informacion.codigo);
            System.out.println("nombre: " + recorrer.informacion.nombre);
            System.out.println("presentacion: " + recorrer.informacion.presentacion);
            System.out.println("valor unitario: " + recorrer.informacion.valorunitario);
            System.out.println("dvalor total: " + recorrer.informacion.valortotal);

            System.out.println("----------------------------------------------------");
            recorrer = recorrer.siguiente;
        }
    }

}


