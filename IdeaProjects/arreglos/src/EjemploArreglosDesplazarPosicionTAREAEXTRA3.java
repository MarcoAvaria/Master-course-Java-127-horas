import java.util.Scanner;

public class EjemploArreglosDesplazarPosicionTAREAEXTRA3 {
    public static void main(String[] args) {

        int[] a = new int[10];
        a[9] = 0;
        int pos = 0;
        Scanner s = new Scanner(System.in);
        for(int i = 0; i < a.length-1; i++){
            System.out.print("Ingrese algo, una palabra o un número: ");
            a[i] = s.nextInt();
        }
        System.out.println("\nArreglo antes...");
        for(int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }

        System.out.println("Elija un objeto a ingresar en el arreglo en dicha posición");
        int numNew = s.nextInt();
        while(pos < a.length-1 && numNew > a[pos]){
            pos++;
        }
        System.out.println("El valor de i es: " + pos);
        for (int j = a.length-2; j >= pos; j--){
            a[j+1] = a[j];
        }
        a[pos] = numNew;
        System.out.println("... Arreglo después");
        for(int j = 0; j < a.length; j++){
            System.out.println(a[j]);
        }
    }
}