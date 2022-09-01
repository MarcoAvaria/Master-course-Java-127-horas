public class EjemploStringMetodos {
    public static void main(String[] args) {

        String nombre = "Marco";

        System.out.println("nombre.length() = " + nombre.length());
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase());
        System.out.println("nombre.equals(\"Marco\") = " + nombre.equals("Marco"));
        System.out.println("nombre.equals(\"Marco\") = " + nombre.equals("marco"));
        System.out.println("nombre.equalsIgnoreCase(\"MaRCo\") = " + nombre.equalsIgnoreCase("MaRCo"));
        System.out.println("nombre.compareTo(\"Marco\") = " + nombre.compareTo("Marco"));
        System.out.println("nombre.compareTo(\"Mario\") = " + nombre.compareTo("Mario"));
        System.out.println("nombre.charAt(0) = " + nombre.charAt(0));
        System.out.println("nombre.charAt(nombre.length()-1) = " + nombre.charAt(nombre.length()-1));

        System.out.println("nombre.substring(2) = " + nombre.substring(2));
        System.out.println("nombre.substring(0,3) = " + nombre.substring(0,3));
        System.out.println("nombre.substring(nombre.length()-1) = " + nombre.substring(nombre.length()-1));

        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas.replace(\"a\",\".\") = " + trabalenguas.replace("a","."));
        System.out.println("trabalenguas = " + trabalenguas);
        System.out.println("trabalenguas.indexOf('a') = " + trabalenguas.indexOf('a'));
        System.out.println("trabalenguas.lastIndexOf('a') = " + trabalenguas.lastIndexOf('a'));
        System.out.println("trabalenguas.indexOf('Z') = " + trabalenguas.indexOf('Z'));
        System.out.println("trabalenguas.contains(\"lenguas\") = " + trabalenguas.contains("lenguas")); //No soporta Char
        System.out.println("trabalenguas.startsWith(\"trab\") = " + trabalenguas.startsWith("trab"));
        System.out.println("trabalenguas.endsWith(\"uas\") = " + trabalenguas.endsWith("uas"));
        System.out.println("   trabalenguas   ");
        System.out.println("   trabalenguas   ".trim());
    }
}
