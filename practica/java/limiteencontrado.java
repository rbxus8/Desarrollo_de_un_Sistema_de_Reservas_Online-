/*
Realizar un programa que dado por teclado un límite 
numérico por teclado (por ejemplo 100) muestre en 
pantalla todos
los números hasta ese límite (empezando por 1). 
*/

import java.util.*;
public class limiteencontrado {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ingresa numero desde donde deseas realizar el recorrido(solo numeros naturales):");
        int inicio = scanner.nextInt();

        System.out.println("ingresa numero hasta donde deseas realizar el recorrido(solo numeros naturales):");
        int Final = scanner.nextInt();
        
        for(int i = inicio ; i < Final; i++ ){
            System.out.println((i+1));

        }
    }
}