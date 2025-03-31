/*Realizar un programa que permita el intercambio 
de valores entre dos variables. Por ejemplo: Si una
 variable numero vale 35, y una variable numero2 vale
  20, realizar las acciones necesarias para que numero
   pase a valer 20 y numero2 pase a valer 35. Una vez
 realizado el cambio mostrar
 */

public class intercambiodevariables {

    public static void main(String[] args) {
        int v1 = 35;
        int v2 = 20;
        int adicional = 0;

        adicional = v1;
        v1 = v2;
        v2 = adicional;

        System.out.println("v1" + v1);
        System.out.println("v2" + v2);

    }
}