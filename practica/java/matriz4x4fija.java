/*
TODO CODE
En una tabla de 4 filas y 4 columnas se guardan 
las notas de 4 alumnos de secundaria. Cada fila 
corresponde a las notas y al promedio de cada alumno.
 Se necesite un programa que permita a un profesor 
 cargar, en las 3 posiciones (columnas) de cada fila,
  las notas del alumno y que en la última columna se 
  calculen los promedios. Una vez realizados los 
  cálculos, se desea mostrar las 3 notas de cada 
  alumno y el promedio
correspondiente recorriendo la matriz */

import java.util.*;
public class matriz4x4fija {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    //crear matriz
    double[][] notas = new double[4][4];

    //ingresa datos a la matriz y realizar calculos
    for(int i = 0 ; i < 4 ; i++){
      System.out.println("ingresa las notas del estudiante N" + (i + 1) + ":");
      double suma = 0;

      for(int j = 0 ; j < 3 ; j++){
        System.out.println("nota de estudiante N" + (j + 1) + ":");
        notas [i][j] = scanner.nextDouble();
        suma += notas[i][j];
      }
      notas[i][3] = suma / 3;
    }

    //mostrar datos
    for(int i = 0 ; i < 4 ; i++){
      System.out.println("la notas del estudiantes N" + (i + 1) + ":");

      for(int j = 0 ; j < 3 ; j++){
        System.out.println("Nota N" + (j + 1) + notas[i][j]);
      }
      System.out.println("promedio"+ notas[i][3] );
    }



  }
}