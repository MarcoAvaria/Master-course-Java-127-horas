import java.util.Arrays;

public class EjemploArreglosForOrdenamientoBurbuja {

    public static void arregloInverso(String[] arreglo){
        int total = arreglo.length;
        int total2 = arreglo.length;
        for(int i = 0; i < total2; i++){
            String actual = arreglo[i];
            String inverso = arreglo[total-1-i];
            arreglo[i] = inverso;
            arreglo [total-1-i] = actual;
            total2--;
        }
    }

    public static void main(String[] args) {

        String[] productos = {"Kingston Pendrive 64GB", "Samsung Galaxy",
                "Disco Duro SSD Samsung Externo",
                "Asus Notebook", "Macbook Air",
                "Chromecast 4ta generación", "Bicicleta Oxford"};

        int total = productos.length;

        int contador = 0;
        for(int i = 0; i < total; i++){
            for (int j = 0; j < total; j++){
                if (productos[i].compareTo(productos[j]) < 0){
                    String auxiliar = productos[i];
                    productos[i] = productos[j];
                    productos[j] = auxiliar;
                }
                contador++;
            }
        }
        System.out.println("contador = " + contador);

        //Arrays.sort(productos);
        //arregloInverso(productos);

        //Collections.reverse(Arrays.asList(productos));

        System.out.println("=== Usando for ===");
        for (int i = 0; i < total; i++){
            System.out.println("para índice " + i + " : " + productos[i]);
        }
    }
}
