import java.util.Scanner;

public class Tarea015SistemaEstadisticoDeUnArreglo {
    public static void main(String[] args) {

        double[] arr = new double[7];
        Scanner s = new Scanner(System.in);
        double promPos = 0, promNeg = 0;
        int cont = 0, countZero = 0, numPos = 0, numNeg = 0;
        System.out.println("Ingrese siete números: ");
        for (int i = 0; i < arr.length; i++){
            System.out.print("\tIngrese un número: ");
            arr[i] = s.nextDouble();
            if (arr[i] > 0){
                promPos += arr[i];
                numPos++;
            } else if (arr[i] < 0) {
                promNeg += arr[i];
                numNeg++;
            } else if (arr[i] == 0) {
                countZero++;
            }
        }
        promPos /= numPos;
        promNeg /= numNeg;
        System.out.println("El promedio de la suma de los números positivos es: " + promPos);
        System.out.println("El promedio de la suma de los números negativos es: " + promNeg);
        System.out.println("La cantidad de ceros es: " + countZero);
    }
}