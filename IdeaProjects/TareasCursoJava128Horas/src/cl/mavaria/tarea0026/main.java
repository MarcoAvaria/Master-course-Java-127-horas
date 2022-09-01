package cl.mavaria.tarea0026;

import cl.mavaria.tarea0026.clasesyotros.*;

public class main {
    public static void main(String[] args) {

        BolsaSupermercado<Lacteo> bolsaLacteos = new BolsaSupermercado<>();
        BolsaSupermercado<Fruta> bolsaFrutas = new BolsaSupermercado<>();
        BolsaSupermercado<Limpieza> bolsaLimpieza = new BolsaSupermercado<>();
        BolsaSupermercado<NoPerecible> bolsaNoPerecibles = new BolsaSupermercado<>();

        bolsaLacteos.addProducto(new Lacteo("Leche Colum", 1500.0, 1, 4));
        bolsaLacteos.addProducto(new Lacteo("Yogurth Colum", 85.0, 4, 7));
        bolsaLacteos.addProducto(new Lacteo("Leche Vegetal VEGX", 1800.0, 1, 10));
        bolsaLacteos.addProducto(new Lacteo("Yogurth Veggie", 105.0, 4, 9));
        bolsaLacteos.addProducto(new Lacteo("Colum", 1500.0, 1, 4));

        bolsaFrutas.addProducto(new Fruta("Plátano", 1100.0, 1.2, "Verde"));
        bolsaFrutas.addProducto(new Fruta("Manzana", 1000.0, 1.3, "Roja"));
        bolsaFrutas.addProducto(new Fruta("Naranja", 900.0, 0.9, "Naranja"));
        bolsaFrutas.addProducto(new Fruta("Durazno", 900.0, 0.8, "Roja"));
        bolsaFrutas.addProducto(new Fruta("Uva", 1200.0, 1.0, "Morada"));

        bolsaLimpieza.addProducto(new Limpieza("Lisoform", 1500.0,
                "Alcohol, Jabón, Desinfectante, Aromatizante", 1.1));
        bolsaLimpieza.addProducto(new Limpieza("Jabón de manos Jumbo", 640.0,
                "Jabón, Desinfectante, Aromatizante", 0.8));
        bolsaLimpieza.addProducto(new Limpieza("Cloro Clorox", 1300.0,
                "Cloro", 1.0));
        bolsaLimpieza.addProducto(new Limpieza("Aromatizante ambiental", 4800.0,
                "Alcohol, Aromatizante", 0.9));
        bolsaLimpieza.addProducto(new Limpieza("Desengrasante Cif", 2400.0,
                "Alcohol, Jabón, Desinfectante, Aromatizante", 0.5));

        bolsaNoPerecibles.addProducto(new NoPerecible("Fideos",1700.0, 1, 138));
        bolsaNoPerecibles.addProducto(new NoPerecible("Cafe",1100.0, 1, 0));
        bolsaNoPerecibles.addProducto(new NoPerecible("Harina",1200.0, 1, 364));
        bolsaNoPerecibles.addProducto(new NoPerecible("Azúcar",1320.0, 1, 387));
        bolsaNoPerecibles.addProducto(new NoPerecible("Aceite",2500.0, 1, 884));

        System.out.println("Lacteos");
        for (Lacteo l:bolsaLacteos.getProductos()){
            System.out.println("Producto tipo lácteo        : " + l.getNombre());
            System.out.println("\tCantidad              : " + l.getCantidad());
            System.out.println("\tProteínas por unidad  : " + l.getProteinas());
            System.out.println("\tValor total           : " + (l.getPrecio() * l.getCantidad()));
            System.out.println();
        }

        System.out.println("=============================================================\n");
        System.out.println("Frutas\n");
        for (Fruta f:bolsaFrutas.getProductos()){
            System.out.println("Producto tipo fruta         : " + f.getNombre());
            System.out.println("\tColor fruta           : " + f.getColor());
            System.out.println("\tPeso total            : " + f.getPeso());
            System.out.println("\tValor total           : " + f.getPrecio());
            System.out.println();
        }

        System.out.println("=============================================================\n");
        System.out.println("Artículos de limpieza");
        for (Limpieza l:bolsaLimpieza.getProductos()){
            System.out.println("Producto de limpieza        : " + l.getNombre());
            System.out.println("\tComponentes           : " + l.getComponentes());
            System.out.println("\tCantidad en litros    : " + l.getLitros());
            System.out.println("\tValor total           : " + l.getPrecio());
            System.out.println();
        }

        System.out.println("=============================================================\n");
        System.out.println("Alimentos no perecibles");
        for (NoPerecible n:bolsaNoPerecibles.getProductos()){
            System.out.println("Producto no perecible   : " + n.getNombre());
            System.out.println("\tCalorías x c/100gr    : " + n.getCalorias());
            System.out.println("\tContenido             : " + n.getContenido());
            System.out.println("\tValor total           : " + n.getPrecio());
            System.out.println();
        }
    }
}