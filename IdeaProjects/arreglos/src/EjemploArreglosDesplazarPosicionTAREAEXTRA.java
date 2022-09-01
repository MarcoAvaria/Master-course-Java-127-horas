import java.util.Scanner;

public class EjemploArreglosDesplazarPosicionTAREAEXTRA {
    public static void main(String[] args) {

        Object[] a = new Object[10];
        Scanner s = new Scanner(System.in);
        for(int i = 0; i < a.length; i++){
            System.out.print("Ingrese algo, una palabra o un número: ");
            a[i] = s.next();
        }
        System.out.println("Arreglo antes...");
        for(int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }
        System.out.println();
        Object aux = a[a.length-1];
        for (int i = a.length-2; i >= 0; i--){
            a[i+1] = a[i];
        }
        a[0] = aux;
        System.out.println("... Arreglo después");
        for(int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }
    }
}
