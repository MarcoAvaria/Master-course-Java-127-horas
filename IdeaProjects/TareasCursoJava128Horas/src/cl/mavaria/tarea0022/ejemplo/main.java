package cl.mavaria.tarea0022.ejemplo;

import cl.mavaria.tarea0022.*;

public class main {
    public static void main(String[] args) {
        Producto[] productos = new Producto[8];
        productos[0] = new Fruta("Manzana",900.0, 1.1, "Roja");
        productos[1] = new Fruta("Uvas",1400.0, 1.5, "verdes");
        productos[2] = new Lacteo("Leche de vaca", 950.0, 1, 5);
        productos[3] = new Lacteo("Leche de soya", 1450.0, 1, 9);
        productos[4] = new Limpieza("Limpia pisos",
                2300.0, "Jabón, Alcohol, agua", 2.5);
        productos[5] = new Limpieza("Limpia vidrios",
                1950.0, "Agua, solvente, alcalinizante", 1.5);
        productos[6] = new NoPerecible("Fideos", 1500.0, 1, 820);
        productos[7] = new NoPerecible("Café", 1200.0, 1, 0);

        for (Producto prod: productos){
            System.out.println(prod);
            System.out.println("==================================================");
        }
    }
}