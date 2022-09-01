import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tarea008SistemaDeNotasDeAlumnos {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        List<Double> notasMa = new ArrayList<Double>(), notasMe = new ArrayList<Double>();
        double notas1 = 0, temp = 0, sumanotas = 0, promedioMa = 0, promedioMe = 0;
        for (int i = 0; i<20; i++){
            System.out.println("Ingresar promedio " + (i+1) + "°: ");
            temp = s.nextDouble();
            if (temp == 0){
                System.out.println(" ERROR ERROR ERROR!!!\n\tEl valor ingresado no puede ser 0" +
                        ", se cerrará el programa");
                System.exit(0);
            } else if(temp > 5.0){
                notasMa.add(temp);
            } else if (temp < 4.0) {
                notasMe.add(temp);
                if (temp == 1.0){
                    notas1++;
                }
            }
            sumanotas += temp;
        }
        if (!notasMa.isEmpty()){
            for (int i = 0; i < notasMa.size(); i++){
                promedioMa += notasMa.get(i);
            }
            promedioMa /= notasMa.size();
            System.out.println("El promedio de las notas mayores a 5 es: " + promedioMa);
        }else {
            System.out.println("No hay un promedio de notas mayores a 5 porque no hay notas mayores que 5");
        }
        if (!notasMe.isEmpty()){
            for (int i = 0; i < notasMe.size(); i++){
                promedioMe += notasMe.get(i);
            }
            promedioMe /= notasMe.size();
            System.out.println("El promedio de las notas menores a 4 es: " + promedioMe);
        }else {
            System.out.println("No hay un promedio de notas menores a 4 porque no hay notas menores que 4");
        }
        System.out.println("La cantidad de notas 1.0 es: " + notas1);
        System.out.println("El promedio total de las notas es: " + (sumanotas/20) );
    }
}