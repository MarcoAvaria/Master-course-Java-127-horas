import java.util.Scanner;

public class Tarea017ImprimirHistrograma {
    public static void main(String[] args) {

        int[] frecArr = new int[6];
        Scanner s = new Scanner(System.in);
        int num = 0, countArr = 0;

        System.out.println("A continuación debe ingresar 12 números del 1 al 6 (considere ambas opciones)");
        while (countArr < 12){
            System.out.print("\tFavor ingresar número: ");
            num = s.nextInt();
            if (num >= 1 && num <= 6){
                frecArr[num-1] += 1;
                countArr++;
            }else System.out.println("Número incorrecto, ingresar un valor dentro del rango establecido");
        }
        for (int i = 0; i < frecArr.length; i++){
            System.out.print((i+1) + ":");
            for (int j = 0; j < frecArr[i]; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}