import java.util.Scanner;

public class Tarea009MultiplicarDosNumeros {
    public static void main(String[] args) {

        int resultado = 0;
        boolean negativo = false;
        Scanner s = new Scanner(System.in);
        System.out.println("Favor de ingresar un entero:");
        int a = s.nextInt();
        System.out.println("Favor de ingresar otro entero:");
        int b = s.nextInt();

        if (a > 0 && b > 0){
            a = a;
            b = b;
        } else if (a < 0 && b < 0) {
            a = -a;
            b = -b;
        } else if ((a > 0 && b < 0) || (a < 0 && b > 0)) {
            a = Math.abs(a);
            b = Math.abs(b);
            negativo = true;
        } else if (a == 0 || b == 0) {
            System.out.println("El resultado de la multiplicación de " + a + " por " + b + " es cero");
            System.exit(0);
        }
        if (a > b){
            for(int i = 0; i < b; i++){
                resultado += a;
            }
        }else{
            for(int i = 0; i < a; i++){
                resultado += b;
            }
        }
        if(negativo){
            resultado = -resultado;
        }
        System.out.println("El resultado de la multiplicación de " + a + " por " + b + " es: " + resultado);
    }
}
