public class EjemploMatricesTraspuesta {
    public static void main(String[] args) {

        boolean matrizCuadrada = true;

        int[][] matriz = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        ciclo1: for (int i = 0; i < matriz.length; i++) {
            if (!(matriz.length == matriz[i].length)) {
                matrizCuadrada = false;
                break ciclo1;
            }
        }

        if (matrizCuadrada == true) {
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; (j < matriz[0].length) & (j < i); j++) {
                    int temp = 0;
                    temp = matriz[j][i];
                    matriz[j][i] = matriz[i][j];
                    matriz[i][j] = temp;
                }
            }
        }

        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                System.out.print("[" + matriz[i][j] +"] ");
            }
            System.out.println();
        }
    }
}