import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class EjemploJavaUtilCalendar {
    public static void main(String[] args) {
        // Es una clase abstracta, por lo que no permite crear una instancia completa con el operador 'new'
        Calendar calendario = Calendar.getInstance(); // Por "debajo" este método creará la instancia

        //calendario.set(2022, Calendar.SEPTEMBER, 25, 18, 20, 10);
        calendario.set(Calendar.YEAR, 2022);
        calendario.set(Calendar.MONTH, Calendar.MARCH);
        calendario.set(Calendar.DAY_OF_MONTH, 25);

        //calendario.set(Calendar.HOUR_OF_DAY, 21);
        calendario.set(Calendar.HOUR, 7);
        calendario.set(Calendar.AM_PM, Calendar.PM);
        calendario.set(Calendar.MINUTE, 20);
        calendario.set(Calendar.SECOND, 10);
        calendario.set(Calendar.MILLISECOND, 125);

        Date fecha = calendario.getTime();
        System.out.println("fecha sin formato = " + fecha);

        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS a");
        String fechaConFormato = formato.format(fecha);
        System.out.println("fechaConFormato = " + fechaConFormato);

        Calendar calActual = Calendar.getInstance();
        Date fecha2 = calActual.getTime();

        if(fecha.after(fecha2)){
            System.out.println("Fecha1 (del usuario) es después que fecha2 (actual)");
        } else if (fecha.before(fecha2)) {
            System.out.println("Fecha1 es anterior que fecha2");
        } else if (fecha.equals(fecha2)) {
            System.out.println("fecha es igual a fecha2");
        }

        if(fecha.compareTo(fecha2) > 0){
            System.out.println("Fecha1 (del usuario) es después que fecha2 (actual)");
        } else if (fecha.compareTo(fecha2) < 0) {
            System.out.println("Fecha1 es anterior que fecha2");
        } else if (fecha.compareTo(fecha2) == 0) {
            System.out.println("fecha es igual a fecha2");
        }

    }
}
