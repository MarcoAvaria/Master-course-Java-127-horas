import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;
import java.util.Scanner;

public class Tarea011CalcularEdad {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
        Date fechaActual = new Date();
        
        System.out.println("Favor de ingresar fecha de nacimiento en formato dd-MM-yyyy: ");
        String dayBornSTR = s.next();
        try {
            Date fecha = formato.parse(dayBornSTR);
            if (fecha.after(fechaActual)){
                System.out.println("La fecha ingresada debe ser anterior a la actual !");
            } else if (fecha.compareTo(fechaActual) <= 0) {

                Instant instante1 = fecha.toInstant();
                LocalDate localDate1 = instante1.atZone(ZoneId.systemDefault()).toLocalDate();

                Instant instante2 = fechaActual.toInstant();
                LocalDate localDate2 = instante2.atZone(ZoneId.systemDefault()).toLocalDate();

                Period yearsDifference = Period.between(localDate1, localDate2);
                System.out.println("La edad de la persona de acuerdo a la fecha actual es "
                    + yearsDifference.getYears());
            }
        } catch (ParseException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}
