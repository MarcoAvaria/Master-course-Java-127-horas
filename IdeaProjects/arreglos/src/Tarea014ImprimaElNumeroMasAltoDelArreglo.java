import java.util.Scanner;

public class Tarea014ImprimaElNumeroMasAltoDelArreglo {
    public static void main(String[] args) {

        int[] arr = new int[7];
        Scanner s = new Scanner(System.in);
        int cont = 0;
        int max = Integer.MIN_VALUE;

        while (cont < 7){
            System.out.print("Ingrese un siete números de 11 a 99 (considerando ambos como opciones): ");
            arr[cont] = s.nextInt();
            if (arr[cont] >= 11 && arr[cont] <= 99){
                max = (arr[cont] > max) ? arr[cont] : max;
                cont++;
            }else System.out.println("¡Error! Ingrese otro número dentro del rango");
        }
        System.out.println("El número más alto del arreglo es: " + max);
    }
}