/*
Realizar un programa que permita cargar 15 números en un vector. 
Una vez cargados, se necesita que el programa cuente e informe por 
pantalla cuántas veces se cargó el número 3 
*/

import java.util.*;

public class hallarnumeroenlista {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //ingresar cantidad de datos del vector
        System.out.println("ingresa la cantidad de datos a ingresar en el vector:");
        int cantl_inst = scanner.nextInt();
        
        //vector
        int[] vector = new int[cantl_inst];

        //repetir para solicitar numeros y llenar el vector
        for(int i= 0 ; i < vector.length ; i++){

            System.out.println("datoN"+(i+1)+":");
            vector[i] = scanner.nextInt();
        }

        //mostar datos del vector
        System.out.println("datos ingresados:");
        for (int i = 0; i < vector.length; i++) {
    
            System.out.println("datoN"+(i+1)+":"+vector[i]);
        }

        //contar cuantas veces se presenta la relacion de numero 
        System.out.println("ingresa numero a consultar que se repite:");
        int repite = scanner.nextInt();
        int cont = 0;

        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == repite) {

                cont = cont + 1;
                
            }
        }
        
        System.out.println("el total es:"+cont);




    }
}