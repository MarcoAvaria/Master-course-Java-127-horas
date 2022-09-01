import javax.swing.*;

public class ObtenerElNombreMasLargo {
    public static void main(String[] args) {

        System.out.println("Favor ingresar el nombre y apellido de 3 personas\n\tSe debe colocar primero " +
                "el nombre y luego el apellido, en ese orden");
        String p1 = JOptionPane.showInputDialog("\nIngrese el nombre y apellido de la primera persona");
        String p2 = JOptionPane.showInputDialog("\nIngrese el nombre y apellido de la segunda persona");
        String p3 = JOptionPane.showInputDialog("\nIngrese el nombre y apellido de la tercera persona");
        String nombrelargo = (p1.split(" ")[0].length() > p2.split(" ")[0].length()? p1 : p2);
        nombrelargo = (nombrelargo.split(" ")[0].length() > p3.split(" ")[0].length() ? nombrelargo : p3);
        System.out.println(nombrelargo + " tiene el nombre más largo");
    }
}
