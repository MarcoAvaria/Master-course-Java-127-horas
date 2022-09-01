package cl.mavaria.tarea0026.clasesyotros;

import java.util.ArrayList;
import java.util.List;

public class BolsaSupermercado<T> {

    private List<T> productos;
    private int numProd;
    private static int maxProd = 5;

    public BolsaSupermercado() {
        this.productos = new ArrayList<>();
    }

    public List<T> getProductos() {
        return productos;
    }

    public int getNumProd() {
        return numProd;
    }

    public void addProducto(T t){
        if(this.productos.size() <= maxProd){
            this.productos.add(t);
        }else System.out.println("El número de productos ha alcanzado su máxima capacidad");
    }
}