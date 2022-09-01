public class HolaMundo {
    public static void main(String[] args){
        //System.out.println("Hola Mundo desde Java");

        String saludar = "Hola Mundo desde Java";
        System.out.println(saludar);
        System.out.println("saludar.toUpperCase() = " + saludar.toUpperCase());

        int numero = 10;

        boolean valor = true;
        int numero2= 4;
        if(valor){
            System.out.println("numero = " + numero);
            numero2 = 11;
        }

        System.out.println("numero2 = " + numero2);

        var numero3 = 15;
        //var numero3 = "15";

        String nombre;

        nombre = "Andrés";

        if(numero > 10){
            nombre = "Juan";
        }
        System.out.println("nombre = " + nombre);
    }
}
