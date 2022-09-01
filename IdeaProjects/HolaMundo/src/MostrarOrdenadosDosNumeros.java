import java.util.Scanner;

public class MostrarOrdenadosDosNumeros {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Favor de ingresar dos números\nIngrese el primer número: ");
        Integer n1 = s.nextInt();
        System.out.println("Ingrese el segundo número: ");
        Integer n2 = s.nextInt();
        Integer may = n1 > n2 ? n1 : n2;
        Integer men = n1 > n2 ? n2 : n1;
        System.out.println("Numeros de mayor a menor: " + may + " - " + men);
    }
}
