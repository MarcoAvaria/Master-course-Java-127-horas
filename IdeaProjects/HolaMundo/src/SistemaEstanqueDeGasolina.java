import java.util.Scanner;

public class SistemaEstanqueDeGasolina {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese la medida actual de litros del estanque de gasolina");
        Double lit = s.nextDouble();
        if (lit >= 70){System.out.println("Estanque lleno");}
        else if (lit >= 60 && lit <70) {System.out.println("Estanque casi lleno");}
        else if (lit >= 40 && lit <60) {System.out.println("Estanque 3/4");}
        else if (lit >= 35 && lit <40) {System.out.println("Medio Estanque");}
        else if (lit >= 20 && lit <35) {System.out.println("Suficiente");}
        else if (lit >= 1 && lit <20) {System.out.println("Insuficiente");}
    }
}
