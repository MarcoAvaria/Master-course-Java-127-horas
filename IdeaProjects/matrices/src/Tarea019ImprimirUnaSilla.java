import java.util.Scanner;

public class Tarea019ImprimirUnaSilla {
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

        int[][] matriz = new int[num][num];

        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                if (j == 0 || i == num/2 || i > num/2 && j == matriz[i].length-1){
                    matriz[i][j] = 1;
                }else matriz[i][j] = 0;
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