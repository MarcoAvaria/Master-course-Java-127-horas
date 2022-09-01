package cl.mavaria.tarea0025;

abstract public class Producto implements IProducto{

    private int precio;

    public Producto(int precio) {
        this.precio = precio;
    }

    @Override
    public int getPrecio() {
        return this.precio;
    }

    @Override
    public double getPrecioVenta() {
        return 0;
    }
}