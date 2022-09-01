package cl.mavaria.ejemplo;

import cl.mavaria.pooherencia.*;

public class EjemploHerenciaConstructores {
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
        System.out.println("Imprimiendo datos en común del tipo persona: ");
        System.out.println("nombre: " + persona.getNombre()
                + "apellido: " + persona.getApellido()
                + "edad: " + persona.getEdad()
                + "email: " + persona.getEmail());
        if(persona instanceof Alumno){
            System.out.println("Imprimiendo los datos del tipo Alumno:");
            System.out.println("Institución: " + ((Alumno) persona).getInstitucion());
            System.out.println("Nota matemáticas: " + ((Alumno) persona).getNotaMatematicas());
            System.out.println("Nota historia: " + ((Alumno) persona).getNotaHistoria());
            System.out.println("Nota castellano: " + ((Alumno) persona).getNotaCastellano());
            if(persona instanceof AlumnoInternacional){
                System.out.println("Imprimiendo los datos del tipo AlumnoInternacional: ");
                System.out.println("Nota idiomas: " + ((AlumnoInternacional) persona).getNotaIdiomas());
                System.out.println("País: " + ((AlumnoInternacional) persona).getPais());
            }
            System.out.println("===================== sobre escritura promedio ======================");
            System.out.println("Persona: " + ((Alumno) persona).calcularPromedio());
            System.out.println("===================== sobre escritura promedio ======================");
        }

        if(persona instanceof Profesor){
            System.out.println("Imprimiendo los datos del tipo Profesor: ");
            System.out.println("Asignatura: " + ((Profesor) persona).getAsignatura());
        }
        System.out.println("===================== sobre escritura saludar ======================");
        System.out.println(persona.saludar());
        System.out.println("===========================================");

    }
}
