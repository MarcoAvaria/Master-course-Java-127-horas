package cl.mavaria.ejemplo;

import cl.mavaria.pooherencia.Alumno;
import cl.mavaria.pooherencia.AlumnoInternacional;
import cl.mavaria.pooherencia.Persona;
import cl.mavaria.pooherencia.Profesor;

public class EjemploHerenciaToString {
    public static void main(String[] args) {

        System.out.println("======= Creando la instancia de la clase Alumno =======");
        Alumno alumno = new Alumno("Marco", "Avaria", 28, "Instituto Nacional");
        alumno.setNotaCastellano(5.5);
        alumno.setNotaHistoria(6.3);
        alumno.setNotaMatematicas(4.9);
        alumno.setEmail("marco@correo.com");

        System.out.println("======= Creando la instancia de la clase AlumnoInternacional =======");
        AlumnoInternacional alumnoInt = new AlumnoInternacional("Peter","Gosling","Australia");
        alumnoInt.setEdad(15);
        alumnoInt.setInstitucion("Instituto Nacional");
        alumnoInt.setNotaIdiomas(6.8);
        alumnoInt.setNotaCastellano(6.2);
        alumnoInt.setNotaHistoria(5.8);
        alumnoInt.setNotaMatematicas(6.5);
        alumnoInt.setEmail("peter@correo.com");

        System.out.println("======= Creando la instancia de la clase Profesor =======");
        Profesor profesor = new Profesor("Luci", "Pérez","Matemáticas");
        profesor.setEdad(37);
        profesor.setEmail("profesora.luci@colegio.com");

        System.out.println("======= - =======");

        imprimir(alumno);
        imprimir(alumnoInt);
        imprimir(profesor);
    }

    public static void imprimir(Persona persona){
        System.out.println("=========================");
        System.out.println(persona);
    }
}
