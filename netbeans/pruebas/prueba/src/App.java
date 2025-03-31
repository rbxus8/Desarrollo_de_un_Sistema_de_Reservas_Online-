import java.util.*;

class Producto {
    private String nombre;
    private double precio;
    private int cantidad;

    // Constructor
    public Producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    // Método para mostrar la información del producto
    @Override
    public String toString() {
        return "Producto{" +
               "nombre='" + nombre + '\'' +
               ", precio=" + precio +
               ", cantidad=" + cantidad +
               '}';
    }
}

public class App {
    private static List<Producto> inventario = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        boolean salir = false;

        while (!salir) {
            System.out.println("\n--- Sistema de Gestión de Inventarios ---");
            System.out.println("1. Agregar producto");
            System.out.println("2. Modificar cantidad de producto");
            System.out.println("3. Buscar producto por nombre");
            System.out.println("4. Mostrar todos los productos");
            System.out.println("5. Calcular valor total del inventario");
            System.out.println("6. Salir");
            System.out.print("Elige una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1 -> agregarProducto(scanner);
                case 2 -> modificarCantidad(scanner);
                case 3 -> buscarProducto(scanner);
                case 4 -> mostrarProductos();
                case 5 -> calcularValorTotal();
                case 6 -> {
                    System.out.println("Saliendo del sistema...");
                    salir = true;
                }
                default -> System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        }
    }

    // Métodos del sistema
    private static void agregarProducto(Scanner scanner) {
        System.out.print("Nombre del producto: ");
        String nombre = scanner.nextLine();
        System.out.print("Precio del producto: ");
        double precio = scanner.nextDouble();
        System.out.print("Cantidad disponible: ");
        int cantidad = scanner.nextInt();

        inventario.add(new Producto(nombre, precio, cantidad));
        System.out.println("Producto agregado con éxito.");
    }

    private static void modificarCantidad(Scanner scanner) {
        System.out.print("Nombre del producto a modificar: ");
        String nombre = scanner.nextLine();

        for (Producto producto : inventario) {
            if (producto.getNombre().equalsIgnoreCase(nombre)) {
                System.out.print("Nueva cantidad: ");
                int nuevaCantidad = scanner.nextInt();
                producto.setCantidad(nuevaCantidad);
                System.out.println("Cantidad actualizada.");
                return;
            }
        }
        System.out.println("Producto no encontrado.");
    }

    private static void buscarProducto(Scanner scanner) {
        System.out.print("Nombre del producto a buscar: ");
        String nombre = scanner.nextLine();

        for (Producto producto : inventario) {
            if (producto.getNombre().equalsIgnoreCase(nombre)) {
                System.out.println("Producto encontrado: " + producto);
                return;
            }
        }
        System.out.println("Producto no encontrado.");
    }

    private static void mostrarProductos() {
        if (inventario.isEmpty()) {
            System.out.println("El inventario está vacío.");
            return;
        }

        inventario.stream()
                .sorted(Comparator.comparing(Producto::getNombre))
                .forEach(System.out::println);
    }

    private static void calcularValorTotal() {
        double total = 0;
        for (Producto producto : inventario) {
            total += producto.getPrecio() * producto.getCantidad();
        }
        System.out.println("Valor total del inventario: $" + total);
    }
}
