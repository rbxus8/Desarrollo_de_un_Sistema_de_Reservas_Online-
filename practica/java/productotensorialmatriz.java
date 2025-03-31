import java.util.Scanner;

public class productotensorialmatriz {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // declaraciones

        // ingresa tamaño de fiñas y matriz de origen

        System.out.println("ingrese numero de filas de matriz origen");
        int filas_matriz = scanner.nextInt();
        System.out.println("ingrese numero de colubnas de matriz origen");
        int colubnas_matriz = scanner.nextInt();

        // creacion de matriz origen
        int[][] matriz_origen = new int[filas_matriz][colubnas_matriz];

        // ingresar datos la matriz origen

        for (int i = 0; i < filas_matriz; i++) {
            for (int j = 0; j < colubnas_matriz; j++) {
                System.out.println(
                        "ingresa numero de la fila N:" + (i + 1) + "y de colbna N:" + j + ":");
                matriz_origen[i][j] = scanner.nextInt();
            }
        }

        // ingresa tamaño de fiñas y matriz de alterna

        System.out.println("ingresa cantidad de filas de matriz alterna");
        int fila_alterna = scanner.nextInt();

        System.out.println("ingresa cantidad de colubnas de matriz alterna");
        int colubnas_alterna = scanner.nextInt();

        // crear matriz alterna
        int[][] matriz_alterna = new int[fila_alterna][colubnas_alterna];

        // llenar matriz al3

        for (int i = 0; i < matriz_alterna.length; i++) {
            for (int j = 0; j < colubnas_alterna; j++) {
                System.out.println("ingresa numero de la fila N:" + (i + 1) + " y de columna N:" + (j + 1) + ":");
                matriz_alterna[i][j] = scanner.nextInt();
            }
        }

        // mostrar matriz origen
        System.err.println("esta es la matriz origen");
        for (int i = 0; i < matriz_origen.length; i++) {
            for (int j = 0; j < matriz_origen[0].length; j++) {
                System.out.printf("%4d", matriz_origen[i][j]);
            }
            System.out.println(); // Salto de línea para la siguiente fila
        }

        // mostrar matriz alterna
        System.err.println("esta es la matriz alterna");
        for (int i = 0; i < matriz_alterna.length; i++) {
            for (int j = 0; j < matriz_alterna[0].length; j++) {
                System.out.printf("%4d", matriz_alterna[i][j]);
            }
            System.out.println();
        }

        /* aqui se relaiza la multiplicacion */

        // declaraciones
        int fila_orig = matriz_origen.length;
        int fila_alter = matriz_alterna.length;
        int colubna_orig = matriz_origen[0].length;
        int colubna_alter = matriz_alterna[0].length;

        // establecer fila final
        int fila_final = fila_orig * fila_alter;

        // establecer colubna final
        int colubna_final = colubna_orig * colubna_alter;

        // crear matriz que guarda
        int[][] matriz_final = new int[fila_final][colubna_final];

        // multiplicar matrices

        for (int i = 0; i < filas_matriz; i++) {
            for (int j = 0; j < colubnas_matriz; j++) {
                for (int k = 0; k < fila_alterna; k++) {
                    for (int l = 0; l < colubnas_alterna; l++) {
                        matriz_final[i * fila_alterna + k][j * colubnas_alterna + l] = matriz_origen[i][j]
                                * matriz_alterna[k][l];
                    }
                }
            }
        }

        // Mostrar matriz final
        System.out.println("\nProducto Tensorial de las Matrices:");
        for (int i = 0; i < fila_final; i++) {
            for (int j = 0; j < colubna_final; j++) {
                System.out.printf("%4d", matriz_final[i][j]);
            }
            System.out.println();
        }

        scanner.close();
    }
}
