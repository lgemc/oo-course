package actividad8punto1;

public class Actividad8punto1 {

    public static void main(String[] args) {

        nodo cabeza = null;
        int opcion = 0;
        while (opcion != 6) {
            System.out.println("1. agregar un producto");
            System.out.println("2. eliminar un producto");
            System.out.println("3. buscar un producto");
            System.out.println("4. modificar un productoo");
            System.out.println("5. mostrar lista de productos");
            System.out.println("6. salir");
            System.out.print("digite el numero de la opcion deseada: ");
            opcion = Leer.datoInt();
            
            if (opcion == 1) {
                nodo nodo = new nodo();
                System.out.println("ingrese el codigo del producto  a agregar:");
                nodo.informacion.codigo = Leer.dato();
                System.out.println("ingrese el nombre del producto  a agregar:");
                nodo.informacion.nombre = Leer.dato();
                System.out.println("ingrese la presentacion del producto  a agregar:");
                nodo.informacion.presentacion = Leer.dato();
                  System.out.println("ingrese el valor unitario del producto  a agregar:");
                nodo.informacion.valorunitario = Leer.dato();
                System.out.println("ingrese cantidad del producto  a agregar:");
                nodo.informacion.cantidad = Leer.dato();
                  System.out.println("ingrese el vslor total del producto  a agregar:");
                String cantidad1 = null;
                 String valor1 = null;
                 String valortotal = null;
                   cantidad1 =nodo.informacion.cantidad ;
                  valor1 = nodo.informacion.valorunitario;
                   valortotal = cantidad1+valor1;
                nodo.informacion.valortotal = valortotal;               
                cabeza = new operaciones1().añadir(cabeza, nodo);
                
            } else if (opcion == 2) {
                System.out.println("ingrese el codigo del producto a eliminar :");
                String codigo = Leer.dato();
                cabeza = new operaciones1().eliminar(cabeza, codigo);
                
            } else if (opcion == 3) {
                System.out.println("ingrese el codigo del producto  a buscar :");
                String codigo = Leer.dato();
                nodo buscado = new operaciones1().buscar(cabeza, codigo);
                if (buscado != null) {
                    System.out.println("codigo: " + buscado.informacion.codigo);
                    System.out.println("nombre: " + buscado.informacion.nombre + "presentacion: "+ buscado.informacion.presentacion +"cantidad"+ buscado.informacion.cantidad+"valor unitario: "+ buscado.informacion.valorunitario + "valor total: "+buscado.informacion.valortotal);
                } else {
                    System.out.println("nodo no encontrado.");
                }
            } else if (opcion == 4) {
                System.out.println("ingrese el codigo del producto a modificar  :");
                String codigo = Leer.dato();
                 System.out.println("ingrese el nuevo codigo de producto   :");
                String ncodigo = Leer.dato();
                System.out.println("ingrese nuevo nombre producto:");
                String nnombre = Leer.dato();
                System.out.println("ingrese la nueva cantidad del producto:");
                String ncantidad = Leer.dato();
                 System.out.println("ingrese la nueva presetnacion del producto:");
                String npresentacion = Leer.dato();
                 System.out.println("ingrese el nuevo valor del producto:");
                String nvalor = Leer.dato();
                System.out.println("ingrese el nuevo valor total del producto:");
                String nvalortotal = Leer.dato();
                cabeza = new operaciones1().modificar(cabeza, codigo, ncodigo, npresentacion, nnombre, ncantidad, nvalor,nvalortotal);
                
                
                
                
                
            } else if (opcion == 5) {
                new operaciones1().listar(cabeza);
            }
        }
        System.out.println("gracias por usarnos.");
    }

    }