import java.util.ArrayList;
import java.util.List;

public class EjemploEjecutarProgramaSO {
    public static void main(String[] args) {

        boolean
        Runtime rt = Runtime.getRuntime();
        //ProcessBuilder proceso;
        List<String> lista = new ArrayList<String>();
        ProcessBuilder proceso = new ProcessBuilder(lista);
        Process p;
        try {
            if (System.getProperty("os.name").toLowerCase().startsWith("windows")) {
                lista.add("notepad"); // Funciona también con "notepad.exe"
                p = proceso.start();
                System.out.println("Paso por if \"windows\" !");
            } else if (System.getProperty("os.name").toLowerCase().startsWith("mac")) {
                lista.add("textedit");
                p = proceso.start();
                System.out.println("Paso por else if \"mac\"!");
            } else if (System.getProperty("os.name").toLowerCase().contains("nux") ||
                    System.getProperty("os.name").toLowerCase().contains("nix")) {
                lista.add("gedit");
                p = proceso.start();
                System.out.println("Paso por else if \"nux\" o \"nix\" !");
            } else {
                lista.add("gedit");
                p = proceso.start();
                System.out.println("Paso por else !");
            }
            p.waitFor();
        }catch (Exception e){
            System.err.println("El comando es desconocido: " + e.getMessage());
            e.printStackTrace();
            System.exit(1);
        }
        System.out.println("Se ha cerrado el editor");
        System.exit(0);
    }
}