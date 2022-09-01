package cl.mavaria.tarea0025;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ProyectoCatalogo {
    public static void main(String[] args) throws ParseException {
        IProducto[] productos = new IProducto[6];
        SimpleDateFormat form = new SimpleDateFormat("dd-MM-yyyy");

        productos[0] = new IPhone(560000, "Apple", "Black", "9S");
        productos[1] = new TvLcd(340000, "Samsung", 55);
        productos[2] = new Libro(5000, form.parse("05-10-2020"), "Stephen Hawking","Historia del tiempo", "Planeta");
        productos[3] = new Comics(7500, form.parse("03-04-2018"), "Tomohito Oda", "Komi-san wa Komyushou Desu", "Shōgakukan", "Komi Shouko");
        productos[4] = new Comics(6500, form.parse("06-12-2009"),"Masashi Kishimoto", "Naruto Shippuden", "Shonen Jump","Naruto Uzumaki");
        productos[5] = new Libro(17200, form.parse("30-09-2012"),"Paulo Freire", "Pedagogia del Oprimido", "Siglo XXI");

        for (IProducto prod:productos) {

            StringBuilder sb = new StringBuilder();
            sb.append("Tipo: ").append(prod.getClass().getSimpleName()).append("\t")
                    .append("Precio: ").append(prod.getPrecio()).append("\t")
                    .append("Precio final: ").append(prod.getPrecioVenta()).append("\n");

            if (prod instanceof IElectronico) {
                sb.append("Fabricante: ").append(((IElectronico) prod).getFabricante()).append("\n");
                if (prod instanceof IPhone) {
                    sb.append("Modelo: ").append(((IPhone) prod).getModelo()).append("\t")
                            .append("Color: ").append(((IPhone) prod).getColor()).append("\n");
                }
                if (prod instanceof TvLcd) {
                    sb.append("Pulgadas: ").append(((TvLcd) prod).getPulgada()).append("\n");
                }
            }

            if (prod instanceof ILibro) {
                sb.append("Titulo: ").append(((ILibro) prod).getTitulo()).append("\t")
                        .append("Autor: ").append(((ILibro) prod).getAutor()).append("\n")
                        .append("Fecha de publicación: ")
                        .append(((ILibro) prod).getFechaPublicacion()).append("\n");
                if (prod instanceof Comics) {
                    sb.append("Personaje: ").append(((Comics) prod).getPersonaje()).append("\n");
                }
            }

            System.out.println(sb.toString());
            System.out.println("====================================================================");
        }
    }
}