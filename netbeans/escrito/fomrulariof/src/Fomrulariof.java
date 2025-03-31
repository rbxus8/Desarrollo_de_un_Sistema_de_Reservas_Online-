
import java.util.Scanner;
public class Fomrulariof {

    
    
     public static void main(String[] args) {
     Scanner PEP = new Scanner(System.in);
     
     
     
    System.out.print("Bienvenido a la hogaza felliz"); 
    System.out.println("""   
                       seleccione_una_opcion
                       1.Consultar_Menu
                       2.Agregar_cliente
                       3.Registrar_pedido
                       4.Consultar_pedidos
                       0.Salir"""); 
    
    int opcion = PEP.nextInt();
    
    switch (opcion){
        
        case 1:System.out.print("Menu");
         mostrarTablaProductos();
        break;

        default: System.out.print("no valido");
    }
    
 
    
    
    }   
    /*aqui empiezatablaproductos */
     private static void mostrarTablaProductos() {
        System.out.println("\n--- Tabla de Productos ---");
        System.out.printf("%-10s %-20s %-10s %-10s\n", "ID", "Nombre", "Precio", "Stock");
        System.out.println("-------------------------------------------------");
        String[][] productos = {
            {"1", "Pan Integral", "1.50", "100"},
            {"2", "Pastel de Fresa", "20.00", "50"},
            {"3", "Bollos de Leche", "0.80", "200"},
            {"4", "Galletas", "2.50", "75"}
        };
        for (String[] producto : productos) {
            System.out.printf("%-10s %-20s %-10s %-10s\n", producto[0], producto[1], producto[2], producto[3]);
        }
    }/*qui terminatablaproductos*/
} 