import java.util.Scanner;

public class EjemploArreglosBuscarString {
    public static void main(String[] args) {

        String[] a = new String[4];

        Scanner s = new Scanner(System.in);

        for(int i = 0; i < a.length; i++){
            System.out.print("Ingrese un palabra: ");
            a[i] = s.next();
        }

        System.out.println("\r\nIngrese una palabra a buscar");
        String palabra = s.next();
        int i = 0;
        for (;i < a.length && !a[i].equalsIgnoreCase(palabra);i++){}

        if(i == a.length){
            System.out.println("Palabra no encontrada");
        } else if (a[i].compareToIgnoreCase(palabra) == 0) {
            System.out.println("Encontrado en la posición: " + i);
        }
    }
}
