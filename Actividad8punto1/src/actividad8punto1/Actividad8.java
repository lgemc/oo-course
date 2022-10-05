package actividad8punto1;

public class Actividad8 {

    public static void main(String[] args) {

            nodo Cabeza = new nodo();
nodo recorrer = Cabeza;
int contador = 80;	
 
while (contador <= 100) {
 	recorrer.informacion.numero = String.valueOf (contador); 
        if (contador < 100)  {
 	recorrer.siguiente = new nodo();
        recorrer = recorrer.siguiente;
          }
 	
        contador += 2;	
        }   	
recorrer = Cabeza;	
while (recorrer != null) {
 	System.out.println(recorrer.informacion.numero);
                recorrer = recorrer.siguiente;
         }
        
        
        nodo cabeza = null;
        int opcion = 0;
        
     
        while (opcion != 6) {
            System.out.println("1. agregar un nodo al final");
            System.out.println("2. agregar inicial un nodo");
            
            System.out.println("3. mostrar lista");
            System.out.println("6. salir");
            System.out.print("digite el numero de la opcion deseada: ");
            opcion = Leer.datoInt();
            
               if (opcion == 1) {
                nodo nodo = new nodo();
                System.out.println("ingrese un numero:");
                nodo.informacion.numero = Leer.dato();
                
                Cabeza = new Operaciones().añadir(Cabeza, nodo);
            } else if (opcion == 2) {
                nodo nodo = new nodo();
                System.out.println("ingrese numero para agregar al principio :");
                nodo.informacion.numero = Leer.dato();
                Cabeza = new Operaciones().añadir2(Cabeza, nodo);
            } else if (opcion == 3) {
                new Operaciones().listar(Cabeza);
            }
        }
        System.out.println("gracias por usarnos.");
    }

    }