import java.util.Scanner;

public class Tarea007CalcularNumeroMenor {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = 0;
        System.out.println("Favor de ingresar la cantidad de numeros a comparar (minimo 10)");
        n = s.nextInt();
        while (n < 10){
            System.out.println("Intente ingresar una cantidad mayor o igual a 10");
            n = s.nextInt();
        }
        int min = 2147483647, temp;
        System.out.println("Ingrese " + n + " numeros enteros para comparar" );
        System.out.println("\tEl valor de cada número debe estar entre los valores\n\t'-2147483648'" +
                " y '2147483647' considerando ambos números");
        for (int i = 0; i < n; i++){
            System.out.println("Numero " + (i+1) + "°: ");
            temp = s.nextInt();
            min = temp < min ? temp : min ;
        }
        if (min < 10){
            System.out.println("El número menor es menor que 10!");
        }else {
            System.out.println("El número menor es igual o mayor que 10!");
        }
        System.out.println("Valor mínimo = " + min);
    }
}
