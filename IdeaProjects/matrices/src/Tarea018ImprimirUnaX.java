import java.util.Scanner;

public class Tarea018ImprimirUnaX {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int num = 0;
        do{
            System.out.println("Favor ingresar una dimensión para la matriz cuadrada mayor a cero: ");
            num = s.nextInt();
            if (num == 0){
                System.out.println("ERROR");
                System.exit(1);
            } else if (num < 0) {
                System.out.println("El número ingresado debe ser un entero mayor a 0");
            }
        }while (num < 0);

        char[][] matriz = new char[num][num];

        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                if (i == j || j == (matriz[i].length-i-1)){
                    matriz[i][j] = 'X';
                }else matriz[i][j] = '_';
            }
        }
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                System.out.print(matriz[i][j]);
            }
            System.out.println();
        }
    }
}