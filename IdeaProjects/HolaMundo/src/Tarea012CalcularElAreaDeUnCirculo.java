import java.util.InputMismatchException;
import java.util.Scanner;

public class Tarea012CalcularElAreaDeUnCirculo {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        double radio = 0, area = 0;
        System.out.println("Favor de ingresar el radio de un circulo para calcular su área:");
        try {
            radio = s.nextInt();
            if (radio > 0 ){
                area = radio * Math.PI;
            } else {
                System.out.println("El número no puede ser negativo");
                System.exit(1);
            }
        } catch (InputMismatchException e){
            System.err.println("Error al ingresar el numero!");
            e.printStackTrace();
            System.exit(1);
        }
        System.out.println("El circulo con radio " + radio + " tiene un area de: " + area);
    }
}