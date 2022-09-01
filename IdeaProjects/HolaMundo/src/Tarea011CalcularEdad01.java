import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Tarea011CalcularEdad01 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        Integer years = null;
        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
        String[] fechaActual = (formato.format(new Date())).split("-");
        System.out.println("Favor de ingresar fecha de nacimiento en formato dd-MM-yyyy: ");
        String dayBornSTR = s.next();
        Date dayBirth = null;
        try {
            dayBirth = formato.parse(dayBornSTR);
            // Se comprueba que es una fecha como tal
            // Luego se convierte nuevamente en String para trabajarla como arreglo
            dayBornSTR = formato.format(dayBirth);
            System.out.println("dayBornSTR = " + dayBornSTR);
            String[] diaArr = dayBornSTR.split("-");
            if (Integer.parseInt(diaArr[2]) > Integer.parseInt(fechaActual[2])){
                System.out.println("Fecha incorrecta, debe ingresar una fecha válida para calcular edad");
            }else{
                years = Integer.parseInt(fechaActual[2]) - Integer.parseInt(diaArr[2]);
                if (Integer.parseInt(diaArr[1]) > Integer.parseInt(fechaActual[1])){
                    --years;
                }else if (diaArr[1].equals(fechaActual[1])){
                    if(Integer.parseInt(diaArr[0]) > Integer.parseInt(fechaActual[0])){
                        --years;
                    }
                }
            }
            System.out.println("La edad de la persona de acuerdo a la fecha actual es " + years);
        } catch (ParseException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}