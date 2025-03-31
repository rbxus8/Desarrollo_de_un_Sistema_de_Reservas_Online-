<?php
$servername = "localhost";
$username = "root"; // Usuario predeterminado de XAMPP
$password = ""; // Contraseña predeterminada de XAMPP (vacía)
$dbname = "uwu";

// Crear conexión
$conn = new mysqli($servername, $username, $password, $dbname);

// Verificar conexión
if ($conn->connect_error) {
    die("Conexión fallida: " . $conn->connect_error);
}
?>
