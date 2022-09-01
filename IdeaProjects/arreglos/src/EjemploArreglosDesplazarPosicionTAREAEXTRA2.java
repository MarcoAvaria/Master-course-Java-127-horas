import java.util.Scanner;

public class EjemploArreglosDesplazarPosicionTAREAEXTRA2 {
    public static void main(String[] args) {

        Object[] a = new Object[10];
        a[9] = (Object)0;
        Scanner s = new Scanner(System.in);
        for(int i = 0; i < a.length-1; i++){
            System.out.print("Ingrese algo, una palabra o un número: ");
            a[i] = s.next();
        }
        System.out.println("\nArreglo antes...");
        for(int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }
        System.out.println("Seleccione una posición del arreglo");
        int pos = s.nextInt();
        System.out.println("Elija un objeto a ingresar en el arreglo en dicha posición");
        Object objeto = s.next();

        for (int i = a.length-2; i >= pos; i--){
            a[i+1] = a[i];
        }
        a[pos] = objeto;
        System.out.println("... Arreglo después");
        for(int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }
    }
}