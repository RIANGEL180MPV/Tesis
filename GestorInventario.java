public class GestorInventario {

    // Atributos privados
    private String nombreArticulo;
    private double precioUnitario;
    private int cantidadStock;

    // Metodo para actualizar los datos del inventario
    public void actualizarDatos(String nuevoNombre, double nuevoPrecio, int nuevaCantidad) {
        nombreArticulo = nuevoNombre;
        precioUnitario = nuevoPrecio;
        cantidadStock = nuevaCantidad;
    }

    // Metodo para calcular el total con descuento
    public double calcularTotalConDescuento(double precio, int cantidad, double porcentajeDescuento) {
        double subtotal = cantidad * precio;
        double montoDescuento = subtotal * (porcentajeDescuento / 100.0);

        return subtotal - montoDescuento;
    }

    // Metodo para mostrar el reporte del inventario
    public void mostrarReporteInventario(String nombre, int stock, double totalFinal) {
        System.out.println("Articulo: " + nombre + " | Stock: " + stock);
        System.out.println("Total inventario valorizado: $" + totalFinal);
    }

    // Getters para consultar los atributos privados
    public String getNombreArticulo() {
        return nombreArticulo;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public int getCantidadStock() {
        return cantidadStock;
    }
}
