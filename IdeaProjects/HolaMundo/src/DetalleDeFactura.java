import java.util.Scanner;

public class DetalleDeFactura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la factura:");
        String nombreFactura = scanner.nextLine();
        System.out.println("Ingrese el precio del primer producto:");
        Double primerPrecio = scanner.nextDouble();
        System.out.println("Ingrese el precio del segundo producto:");
        Double segundoPrecio = scanner.nextDouble();

        Double total = (primerPrecio + segundoPrecio);
        String mensaje = "La factura " + nombreFactura + "tiene un total bruto de " + total;
        mensaje += ", con un impuesto de " + total * 0.19 + " y el monto después del impuesto es de " + total * 1.19;
        System.out.println( mensaje);
    }
}
