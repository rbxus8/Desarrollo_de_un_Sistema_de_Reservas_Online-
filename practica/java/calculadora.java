import java.util.Scanner;

public class calculadora {

    // Método principal
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            System.out.println("=== Calculadora ===");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");

            int opcion = scanner.nextInt();

            if (opcion >= 1 && opcion <= 4) {
                System.out.print("Introduce el primer número: ");
                double num1 = scanner.nextDouble();

                System.out.print("Introduce el segundo número: ");
                double num2 = scanner.nextDouble();

                double resultado = 0;

                switch (opcion) {
                    case 1:
                        resultado = num1 + num2;
                        System.out.println("Resultado de la suma: " + resultado);
                        break;
                    case 2:
                        resultado = num1 - num2;
                        System.out.println("Resultado de la resta: " + resultado);
                        break;
                    case 3:
                        resultado = num1 * num2;
                        System.out.println("Resultado de la multiplicación: " + resultado);
                        break;
                    case 4:
                        if (num2 != 0) {
                            resultado = num1 / num2;
                            System.out.println("Resultado de la división: " + resultado);
                        } else {
                            System.out.println("Error: No se puede dividir entre cero.");
                        }
                        break;
                }
            } else if (opcion == 5) {
                salir = true;
                System.out.println("Saliendo de la calculadora. ¡Adiós!");
            } else {
                System.out.println("Opción no válida. Intenta de nuevo.");
            }

            System.out.println(); // Línea en blanco para separación
        }

        scanner.close();
    }
}
