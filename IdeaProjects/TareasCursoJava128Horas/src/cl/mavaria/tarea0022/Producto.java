package cl.mavaria.tarea0022;

public class Producto {
    protected String nombre;
    protected Double precio;

    public Producto(String nombre, Double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "Producto" +
                "\n\tnombre= " + nombre +
                "\n\tprecio= " + precio;
    }
}