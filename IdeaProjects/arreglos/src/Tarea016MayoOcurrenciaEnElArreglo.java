import java.util.Scanner;

public class Tarea016MayoOcurrenciaEnElArreglo {
    public static void main(String[] args) {

        int[] arr = new int[10], repArr = new int[10];
        int pos = 0, numRep = 0, count = 0;
        Scanner s = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++){
            System.out.print("Ingrese un elemento: ");
            arr[i] = s.nextInt();
        }

        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr.length; j++){
                repArr[i] = ((arr[i] == arr[j] )? (repArr[i] + 1) : repArr[i]);
            }
        }

        for (int i = 0; i < repArr.length; i++){
            if (repArr[i] > numRep){
                numRep = repArr[i];
                pos = i;
            }
        }

        System.out.println("La mayor ocurrencia es: " + numRep);
        System.out.println("El elemento que más se repite es: " + arr[pos]);
    }
}