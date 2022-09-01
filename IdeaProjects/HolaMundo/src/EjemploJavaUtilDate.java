import java.text.SimpleDateFormat;
import java.util.Date;

public class EjemploJavaUtilDate {
    public static void main(String[] args){

        Date fecha = new Date();

        System.out.println("fecha = " + fecha);

        SimpleDateFormat df = new SimpleDateFormat("'Fecha: 'yyyy.MM.dd G 'Hora: ' HH:mm:ss z");
        String fechaStr = df.format(fecha);
        System.out.println("fechaStr = " + fechaStr);

        df = new SimpleDateFormat("dd MMMM, yyyy");
        fechaStr = df.format(fecha);
        System.out.println("fechaStr = " + fechaStr);

        df = new SimpleDateFormat("dd-MM-yyyy");
        fechaStr = df.format(fecha);
        System.out.println("fechaStr = " + fechaStr);

        df = new SimpleDateFormat("EEEE dd 'de ' MMMM, yyyy");
        fechaStr = df.format(fecha);

        long j = 0;
        for(int i = 0; i < 10000000; i++){
            j += i;
        }

        Date fecha2 = new Date();
        long tiempoFinal = fecha2.getTime() - fecha.getTime();
        System.out.println("Tiempo transcurrido en el ciclo for = " + tiempoFinal);
        System.out.println("fechaStr = " + fechaStr);
    }
}
