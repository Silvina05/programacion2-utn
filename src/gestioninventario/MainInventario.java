package gestioninventario;

public class MainInventario {
    public static void main(String[] args) {
        
        Producto productoUno = new Producto();
        productoUno.codigo = "P-001";
        productoUno.nombre = "Teclado mecánico";
        productoUno.precio = 45000.0;
        productoUno.stock = 12;

        Producto productoDos = new Producto();
        productoDos.codigo = "P-002";
        productoDos.nombre = "Auriculares inalámbricos";
        productoDos.precio = 18000.0;
        productoDos.stock = 24;

        Producto productoTres = new Producto();
        productoTres.codigo = "P-003";
        productoTres.nombre = "disco SSD 1TB";
        productoTres.precio = 280000.0;
        productoTres.stock = 6;

        //DESAFÍO: Arreglo de productos + recorrido 
        Producto[] inventario = { productoUno, productoDos, productoTres };

        System.out.println("=== Listado completo del inventario ===");
        for (int i = 0; i < inventario.length; i++) {
            inventario[i].mostrarFicha();
        }

        //Pruebas sobre productoUno
        productoUno.venderUnidades(3);
        productoUno.venderUnidades(50);   //Error: stock insuficiente
        productoUno.venderUnidades(-2);   //Error: cantidad inválida
        productoUno.reponerStock(20);
        productoUno.reponerStock(-5);      //Error: cantidad inválida
        productoUno.actualizarPrecio(39900.0);

        //DESAFÍO: Pruebas de descuento
        System.out.println("\n--- Pruebas de descuento ---");
        productoDos.aplicarDescuento(10);   // Válido
        productoTres.aplicarDescuento(15);   // Válido
        productoUno.aplicarDescuento(-5);    // Error: porcentaje negativo
        productoTres.aplicarDescuento(110);  // Error: supera 100

        //Verificación de que cada objeto mantiene su propio estado
        System.out.println("\n--- Verificación de independencia ---");
        System.out.println("Stock de Auriculares inalámbricos: " + productoDos.stock);
        System.out.println("Stock de disco SSD 1TB: " + productoTres.stock);

        //Aliasing
        System.out.println("\n--- Demostración de referencia compartida ---");
        Producto copia = productoUno;
        copia.stock = 29;
        System.out.println("Stock de productoUno tras modificar copia: "
                + productoUno.stock + " (mismo objeto en el Heap)");
    }
}