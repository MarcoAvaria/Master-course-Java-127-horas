import java.util.Properties;

public class EjemploPropiedadesDeSistema {
    public static void main(String[] args) {

        String username = System.getProperty("user.name");
        System.out.println("username = " + username);

        String home = System.getProperty("user.home");
        System.out.println("home = " + home);

        String workspace = System.getProperty("user.dir");
        System.out.println("workspace = " + workspace);

        String java = System.getProperty("java.version");
        System.out.println("java = " + java);

        String lineSeparation = System.getProperty("line.separator");
        String lineSeparation2 = System.lineSeparator();
        System.out.println("lineSeparation:" + lineSeparation + "Una linea nueva");

        Properties p = System.getProperties();
        p.list(System.out);


    }
}
