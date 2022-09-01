package cl.mavaria.poointerfaces.imprenta;

import cl.mavaria.poointerfaces.imprenta.modelo.*;
import static cl.mavaria.poointerfaces.imprenta.modelo.Genero.*;
import static cl.mavaria.poointerfaces.imprenta.modelo.Imprimible.*;

public class EjemploImprenta {
    public static void main(String[] args) {

        Curriculum cv = new Curriculum(new Persona("John"," Doe"),
                "Ing. de sistemas","Resumen laboral...");
        cv.addExperiencia("Java")
                .addExperiencia("Oracle DBA")
                .addExperiencia("Spring Framework")
                .addExperiencia("Desarrollador fullstack")
                .addExperiencia("Angular");

        Libro libro = new Libro(new Persona("Erick","Gamma"),
                "Patrón de diseño: Elem. Reusables POO",
                PROGRAMACION);
        libro.addPagina(new Pagina("Patrón Singleton"))
                .addPagina(new Pagina("Patrón Observador"))
                .addPagina(new Pagina("Patrón Factory"))
                .addPagina(new Pagina("Patrón Composite"))
                .addPagina(new Pagina("Patrón Facade"));

        Informe informe = new Informe(new Persona("Martin","Fowler"),
                new Persona("James","Gosling"),"Estudio sobre microservicios");
        imprimir(cv);
        imprimir(informe);
        imprimir(libro);

        imprimir(new Imprimible() {
            @Override
            public String imprimir() {
                return "Hola que tal, imprimiendo un objeto genérico de una clase anónima ";
            }
        };

        System.out.println(TEXTO_DEFECTO);
    }
}
