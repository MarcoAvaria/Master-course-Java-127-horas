public class EjemploMatricesSimetrica {
    public static void main(String[] args) {
        boolean simetrica = true;

        int[][] matriz = {
                {1,2,3,4},
                {2,1,0,5},
                {3,0,1,6},
                {4,5,6,7}
        };

        ciclo1: for (int i = 0; i < matriz.length; i++){
            if (!(matriz.length == matriz[i].length)){
                simetrica = false;
                break ciclo1;
            }
        }

        ciclo2: if (simetrica == true){
            for (int i = 0; i < matriz.length; i++){
                for (int j = 0; (j < matriz[0].length) & (j < i); j++){
                    if (!(matriz[i][j] == matriz[j][i])){
                        simetrica = false;
                        break ciclo2;
                    }
                }
            }
        }

        if(simetrica){
            System.out.println("La matriz es simétrica !!!");
        }else System.out.println("La matriz no es simétrica\t:C");
    }
}