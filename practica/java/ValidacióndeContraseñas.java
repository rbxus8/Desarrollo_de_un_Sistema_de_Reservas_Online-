/*
 ### **Enunciado del Problema: Sistema de Gestión de Usuarios con Validación de Contraseñas**

#### **Contexto:**
Se desea desarrollar un sistema para gestionar usuarios en una aplicación. El sistema debe permitir el registro de usuarios, con validación de contraseñas, y permitirles iniciar sesión utilizando su nombre de usuario y contraseña. Las contraseñas deben cumplir con una serie de reglas de seguridad que aseguren que el usuario elija contraseñas robustas. El sistema debe garantizar que los usuarios se registren de manera segura, que sus contraseñas sean validadas adecuadamente y que el inicio de sesión sea correcto.

#### **Requisitos del sistema:**

1. **Validación de contraseñas:**
   Las contraseñas deben cumplir con las siguientes reglas de seguridad:
   - La contraseña debe tener **al menos 8 caracteres**.
   - La contraseña debe contener **al menos una letra mayúscula**.
   - La contraseña debe contener **al menos una letra minúscula**.
   - La contraseña debe contener **al menos un número**.
   - La contraseña debe contener **al menos un carácter especial** (de los siguientes: `!@#$%^&*`).

2. **Registro de usuarios:**
   - El sistema debe permitir que un usuario se registre proporcionando un **nombre de usuario** y una **contraseña**.
   - Si el nombre de usuario ya está registrado, el sistema debe notificar al usuario que el nombre de usuario está en uso y permitirle elegir otro.
   - Si la contraseña no cumple con las reglas de seguridad, el sistema debe indicar qué reglas no se cumplen y solicitar al usuario que ingrese una nueva contraseña.

3. **Inicio de sesión:**
   - El sistema debe permitir que un usuario inicie sesión proporcionando su **nombre de usuario** y su **contraseña**.
   - Si el nombre de usuario no existe, el sistema debe notificar al usuario que no se encuentra registrado.
   - Si el nombre de usuario y la contraseña no coinciden, el sistema debe informar al usuario que la contraseña es incorrecta y permitirle intentarlo nuevamente.

4. **Menú de opciones:**
   - El sistema debe tener un menú interactivo con las siguientes opciones:
     1. Registrar un nuevo usuario.
     2. Iniciar sesión con un usuario existente.
     3. Salir del sistema.
   
   El sistema debe continuar ejecutándose hasta que el usuario elija la opción de salir.

#### **Funciones del sistema:**

1. **Función de registro de usuario:**  
   Debe permitir ingresar un nombre de usuario y una contraseña, y validar que la contraseña cumpla con las reglas de seguridad.

2. **Función de inicio de sesión:**  
   Debe permitir al usuario ingresar su nombre de usuario y contraseña, y verificar si coinciden con los datos registrados.

3. **Validación de contraseñas:**  
   Debe garantizar que las contraseñas sean seguras según las reglas establecidas.

4. **Menú interactivo:**  
   Debe ofrecer al usuario un menú de opciones para registrar un nuevo usuario, iniciar sesión o salir del sistema.

#### **Objetivos del ejercicio:**
- **Objetivo principal:** Desarrollar un sistema de autenticación de usuarios con contraseñas validadas.
- **Objetivo adicional:** Aprender a manejar entradas de usuario, validar contraseñas y gestionar un sistema de usuarios mediante el uso de colecciones como `HashMap` en Java.

#### **Consideraciones adicionales:**
- En este ejercicio, **no se requiere** el uso de bases de datos. Los usuarios y contraseñas se almacenarán en memoria utilizando un `HashMap`.
- El sistema debe ser fácil de usar y proporcionar mensajes claros sobre errores de validación o inicio de sesión.

 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ValidacióndeContraseñas {

    // Mapa para almacenar usuarios y sus contraseñas
    private static Map<String, String> users = new HashMap<>();

    // Método para validar la contraseña
    public static String validatePassword(String password) {
        StringBuilder errors = new StringBuilder();

        // Regla 1: Al menos 8 caracteres
        if (password.length() < 8) {
            errors.append("- Debe tener al menos 8 caracteres.\n");
        }

        // Regla 2: Al menos una letra mayúscula
        if (!password.matches(".*[A-Z].*")) {
            errors.append("- Debe contener al menos una letra mayúscula.\n");
        }

        // Regla 3: Al menos una letra minúscula
        if (!password.matches(".*[a-z].*")) {
            errors.append("- Debe contener al menos una letra minúscula.\n");
        }

        // Regla 4: Al menos un número
        if (!password.matches(".*\\d.*")) {
            errors.append("- Debe contener al menos un número.\n");
        }

        // Regla 5: Al menos un carácter especial
        if (!password.matches(".*[!@#$%^&*].*")) {
            errors.append("- Debe contener al menos un carácter especial (!@#$%^&*).\n");
        }

        return errors.length() > 0 ? errors.toString() : "OK";
    }

    // Método para registrar un nuevo usuario
    public static void registerUser(Scanner scanner) {
        System.out.print("Ingrese un nombre de usuario: ");
        String username = scanner.nextLine();

        // Verificar si el nombre de usuario ya está registrado
        if (users.containsKey(username)) {
            System.out.println("Este nombre de usuario ya está registrado. Por favor, elija otro.");
            return;
        }

        String password;
        while (true) {
            System.out.print("Ingrese una contraseña: ");
            password = scanner.nextLine();
            String validation = validatePassword(password);

            // Si la contraseña es válida, se registra el usuario
            if (validation.equals("OK")) {
                users.put(username, password);
                System.out.println("Usuario registrado con éxito.");
                break;
            } else {
                System.out.println("La contraseña no es válida. Por favor, corrija los siguientes errores:");
                System.out.println(validation);
            }
        }
    }

    // Método para iniciar sesión
    public static void loginUser(Scanner scanner) {
        System.out.print("Ingrese su nombre de usuario: ");
        String username = scanner.nextLine();

        // Verificar si el usuario existe
        if (!users.containsKey(username)) {
            System.out.println("El usuario no existe.");
            return;
        }

        String password;
        System.out.print("Ingrese su contraseña: ");
        password = scanner.nextLine();

        // Verificar si la contraseña es correcta
        if (users.get(username).equals(password)) {
            System.out.println("Inicio de sesión exitoso. ¡Bienvenido, " + username + "!");
        } else {
            System.out.println("Contraseña incorrecta. Intente nuevamente.");
        }
    }

    // Menú principal
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\n----- Menú -----");
            System.out.println("1. Registrar usuario");
            System.out.println("2. Iniciar sesión");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción (1-3): ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Limpiar el buffer de la entrada

            switch (choice) {
                case 1:
                    registerUser(scanner);
                    break;
                case 2:
                    loginUser(scanner);
                    break;
                case 3:
                    System.out.println("Gracias por usar el sistema. ¡Hasta pronto!");
                    exit = true;
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, intente de nuevo.");
                    break;
            }
        }
        scanner.close();
    }
}
