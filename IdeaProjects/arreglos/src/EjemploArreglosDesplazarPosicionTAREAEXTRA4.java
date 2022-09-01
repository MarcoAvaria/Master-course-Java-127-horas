import java.util.Scanner;

public class EjemploArreglosDesplazarPosicionTAREAEXTRA4 {
    public static void main(String[] args) {

        int[] a = new int[10], b = new int[a.length-1];

        Scanner s = new Scanner(System.in);
        for(int i = 0; i < a.length; i++){
            System.out.print("Ingrese algo, una palabra o un número: ");
            a[i] = s.nextInt();
        }

        System.out.println("\nArreglo antes...");
        for(int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }

        System.out.println("Elija una posición a eliminar, entre 0 y 9");
        int numNew = s.nextInt();

        System.out.println("El valor de i es: " + numNew);
        for (int i = numNew; i < a.length-1; i++){
            a[i] = a[i+1];
        }
        System.arraycopy(a, 0, b, 0, b.length);

        System.out.println("... Arreglo después");
        for(int i = 0; i < b.length; i++){
            System.out.println(b[i]);
        }
    }
}