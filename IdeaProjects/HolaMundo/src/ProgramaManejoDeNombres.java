import java.util.Scanner;

public class ProgramaManejoDeNombres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner((System.in));
        System.out.println("Ingrese nombre de sus tres integrantes de su familia:");
        System.out.println("Primer integrante:");
        String integrante1 = scanner.nextLine();
        System.out.println("Segundo integrante:");
        String integrante2 = scanner.nextLine();
        System.out.println("Tercer integrante:");
        String integrante3 = scanner.nextLine();

        String clave1 = "", clave2 = "", clave3 = "", temporal = "";

        StringBuilder sb = new StringBuilder(temporal);

        sb = new StringBuilder(clave1);
        sb.append(integrante1.substring(1,2).toUpperCase()).append(".");
        sb.append(integrante1.substring(integrante1.length()-2));

        System.out.print(sb + "_");

        sb = new StringBuilder(clave2);
        sb.append(integrante2.substring(1,2).toUpperCase()).append(".");
        sb.append(integrante2.substring(integrante2.length()-2));

        System.out.print(sb + "_");

        sb = new StringBuilder(clave3);
        sb.append(integrante3.substring(1,2).toUpperCase()).append(".");
        sb.append(integrante3.substring(integrante3.length()-2));

        System.out.print(sb);
    }
}
