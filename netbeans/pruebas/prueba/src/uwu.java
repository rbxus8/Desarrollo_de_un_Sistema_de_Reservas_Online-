import java.util.*;

class Producto{
    String nombre;
    double precio;
    int cantidad;

    public Producto(String nombre,double precio,int cantidad){

        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }


}


public class uwu {
    private static List <Producto> Inventario = new ArrayList<>();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean fea = false;

        while (!fea) {
            System.out.println("\n--- Sistema de Gestión de Inventarios ---");
            System.out.println("1. Agregar producto");
            System.out.println("2. Modificar cantidad de producto");
            System.out.println("3. Buscar producto por nombre");
            System.out.println("4. Mostrar todos los productos");
            System.out.println("5. Calcular valor total del inventario");
            System.out.println("6. Salir");
            System.out.print("Elige una opción: ");

           int opcion = scanner.nextInt();

            switch(opcion){

                case 1 -> agregarProducto(scanner);
                case 2 -> modificarCantidad(scanner);
                case 3 -> buscarProducto(scanner);
                case 4 -> mostrarProductos(scanner);
                case 5 -> calcularValorTotal(scanner);
                case 6 -> {
                    System.out.println("salir");
                    fea = true;}
                default -> System.out.println("esta saliedno del programa");


            }
        } 
    }

//metodos

public static void agregarProducto (Scanner scanner){
    
    System.out.println("ingresa nombre de producto");
    String nombre = scanner.nextLine();
    System.out.println("ingresa precio");
    double precio = scanner.nextDouble();
    System.out.println("ingresa la cantidad");
    int cantidad = scanner.nextInt();

    Inventario.add(new Producto(nombre, precio, cantidad));
}

public static void modificarCantidad (Scanner scanner){
    
}

public static void buscarProducto (Scanner scanner){
    
}

public static void mostrarProductos (Scanner scanner){
    
}

public static void calcularValorTotal (Scanner scanner){
    
}

}

