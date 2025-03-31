<?php
include 'db_connect.php';
?>

<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>Base de Datos de Productos</title>
</head>
<body>
    <h1>Lista de Productos</h1>

    <?php
    $sql = "SELECT * FROM productos";
    $result = $conn->query($sql);

    if ($result->num_rows > 0) {
        echo "<table border='1'>";
        echo "<tr><th>ID</th><th>Nombre</th><th>Precio</th><th>Stock</th></tr>";
        while($row = $result->fetch_assoc()) {
            echo "<tr><td>".$row["id_producto"]."</td><td>".$row["nombre"]."</td><td>".$row["precio"]."</td><td>".$row["cantidad_stock"]."</td></tr>";
        }
        echo "</table>";
    } else {
        echo "No hay productos.";
    }
    ?>

    <h2>Consulta por Categoría</h2>
    <form method="GET" action="">
        <label for="id_categoria">ID de Categoría:</label>
        <input type="number" id="id_categoria" name="id_categoria" required>
        <button type="submit">Consultar</button>
    </form>

    <?php
    if (isset($_GET['id_categoria'])) {
        $id_categoria = $_GET['id_categoria'];
        $sql = "SELECT * FROM productos WHERE id_categoria = $id_categoria";
        $result = $conn->query($sql);

        if ($result->num_rows > 0) {
            echo "<table border='1'>";
            echo "<tr><th>ID</th><th>Nombre</th><th>Precio</th><th>Stock</th></tr>";
            while($row = $result->fetch_assoc()) {
                echo "<tr><td>".$row["id_producto"]."</td><td>".$row["nombre"]."</td><td>".$row["precio"]."</td><td>".$row["cantidad_stock"]."</td></tr>";
            }
            echo "</table>";
        } else {
            echo "No hay productos en esta categoría.";
        }
    }
    ?>

    <h2>Actualizar Stock</h2>
    <form method="POST" action="">
        <label for="id_producto">ID de Producto:</label>
        <input type="number" id="id_producto" name="id_producto" required>
        <label for="cantidad">Cantidad a agregar:</label>
        <input type="number" id="cantidad" name="cantidad" required>
        <button type="submit">Actualizar</button>
    </form>

    <?php
    if ($_SERVER["REQUEST_METHOD"] == "POST" && isset($_POST['id_producto']) && isset($_POST['cantidad'])) {
        $id_producto = $_POST['id_producto'];
        $cantidad = $_POST['cantidad'];
        $sql = "UPDATE productos SET cantidad_stock = cantidad_stock + $cantidad WHERE id_producto = $id_producto";
        if ($conn->query($sql) === TRUE) {
            echo "Stock actualizado exitosamente.";
        } else {
            echo "Error al actualizar el stock: " . $conn->error;
        }
    }
    ?>

    <?php $conn->close(); ?>
</body>
</html>
