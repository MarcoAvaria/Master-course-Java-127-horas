import java.util.Scanner;

public class Tarea013OrdenarElArregloDeLaFormaUltimoPrimeroEtc {
    public static void main(String[] args) {

        int[] arr = new int[10], arr2 = new int[arr.length];
        Scanner s = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++){
            System.out.print("Favor de ingresar un número: ");
            arr[i] = s.nextInt();
        }

        System.out.println();
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }

        int cont = 0;
        for (int i = 0; i < (arr.length/2); i++){
            arr2[cont] = arr[arr.length-i-1];
            cont++;
            arr2[cont] = arr[i];
            cont++;
        }

        System.out.println();
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr2[i]);
        }
    }
}