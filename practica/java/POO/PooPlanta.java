package POO;

/*Crear una clase Planta con los atributos: nombre, alto del tallo, 
tiene Hojas, clima ideal. 
(con sus métodos y constructores correspondientes)
Crear sus clases hijas que compartan sus atributos y métodos:
Árbol: variedad, tipo de tronco, radio de tronco, color, tipo de hojas.
Flor: color de pétalos, cantidad promedio de pétalos, color del pistilo, 
color de los pétalos, variedad de flor, estación que florece
Arbusto: Ancho arbusto, esDomestico, variedad arbusto, color de hojas, 
sePodaONo
 Una vez creada las clases crear los siguientes métodos:
·
o Árbol: método para mostrar un mensaje en pantalla que diga "Hola soy un árbol"
o Flor: método para mostrar un mensaje en pantalla que diga "Hola soy una flor"
o Arbusto: método para mostrar un mensaje en pantalla que diga "Hola soy un arbusto"
Crear en el Main un objeto de cada clase hija. Llamar a los 3 métodos desde cada objeto. Cambiar el modificador de acceso de los métodos de public a private. Intentar acceder desde el main a estos métodos.
 */

// Clase principal
class Planta {
    private String nombre;
    private double altoTallo;
    private boolean tieneHojas;
    private String climaIdeal;

    // Constructor
    public Planta(String nombre, double altoTallo, boolean tieneHojas, String climaIdeal) {
        this.nombre = nombre;
        this.altoTallo = altoTallo;
        this.tieneHojas = tieneHojas;
        this.climaIdeal = climaIdeal;
    }

    // Métodos Getters y Setters (si se requieren)
    public String getNombre() {
        return nombre;
    }

    public double getAltoTallo() {
        return altoTallo;
    }

    public boolean isTieneHojas() {
        return tieneHojas;
    }

    public String getClimaIdeal() {
        return climaIdeal;
    }
}

// Clase Árbol
class Arbol extends Planta {
    private String variedad;
    private String tipoTronco;
    private double radioTronco;
    private String color;
    private String tipoHojas;

    public Arbol(String nombre, double altoTallo, boolean tieneHojas, String climaIdeal, String variedad,
            String tipoTronco, double radioTronco, String color, String tipoHojas) {
        super(nombre, altoTallo, tieneHojas, climaIdeal);
        this.variedad = variedad;
        this.tipoTronco = tipoTronco;
        this.radioTronco = radioTronco;
        this.color = color;
        this.tipoHojas = tipoHojas;
    }

    private void mostrarMensaje() {
        System.out.println("Hola, soy un árbol.");
    }

    public void llamarMensaje() {
        mostrarMensaje();
    }
}

// Clase Flor
class Flor extends Planta {
    private String colorPetalos;
    private int cantidadPetalos;
    private String colorPistilo;
    private String variedadFlor;
    private String estacionFlorece;

    public Flor(String nombre, double altoTallo, boolean tieneHojas, String climaIdeal, String colorPetalos,
            int cantidadPetalos, String colorPistilo, String variedadFlor, String estacionFlorece) {
        super(nombre, altoTallo, tieneHojas, climaIdeal);
        this.colorPetalos = colorPetalos;
        this.cantidadPetalos = cantidadPetalos;
        this.colorPistilo = colorPistilo;
        this.variedadFlor = variedadFlor;
        this.estacionFlorece = estacionFlorece;
    }

    private void mostrarMensaje() {
        System.out.println("Hola, soy una flor.");
    }

    public void llamarMensaje() {
        mostrarMensaje();
    }
}

// Clase Arbusto
class Arbusto extends Planta {
    private double anchoArbusto;
    private boolean esDomestico;
    private String variedadArbusto;
    private String colorHojas;
    private boolean sePodaONo;

    public Arbusto(String nombre, double altoTallo, boolean tieneHojas, String climaIdeal, double anchoArbusto,
            boolean esDomestico, String variedadArbusto, String colorHojas, boolean sePodaONo) {
        super(nombre, altoTallo, tieneHojas, climaIdeal);
        this.anchoArbusto = anchoArbusto;
        this.esDomestico = esDomestico;
        this.variedadArbusto = variedadArbusto;
        this.colorHojas = colorHojas;
        this.sePodaONo = sePodaONo;
    }

    private void mostrarMensaje() {
        System.out.println("Hola, soy un arbusto.");
    }

    public void llamarMensaje() {
        mostrarMensaje();
    }
}

// Clase Main
public class PooPlanta {
    public static void main(String[] args) {
        // Creación de objetos
        Arbol arbol = new Arbol("Roble", 5.5, true, "Templado", "Quercus", "Fuerte", 0.5, "Marrón", "Lanceoladas");
        Flor flor = new Flor("Rosa", 0.3, true, "Templado", "Rojo", 25, "Amarillo", "Rosa", "Primavera");
        Arbusto arbusto = new Arbusto("Boj", 1.2, true, "Mediterráneo", 1.0, true, "Buxus", "Verde oscuro", true);

        // Llamar a los métodos de cada clase hija
        arbol.llamarMensaje();
        flor.llamarMensaje();
        arbusto.llamarMensaje();

        // Intento de acceso directo a los métodos privados (esto generará un error)
        // arbol.mostrarMensaje(); // Error: mostrarMensaje() tiene acceso privado
        // flor.mostrarMensaje(); // Error: mostrarMensaje() tiene acceso privado
        // arbusto.mostrarMensaje(); // Error: mostrarMensaje() tiene acceso privado
    }
}
