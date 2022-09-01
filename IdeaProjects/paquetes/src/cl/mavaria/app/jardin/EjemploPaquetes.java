package cl.mavaria.app.jardin;

import cl.mavaria.app.hogar.*;

import static cl.mavaria.app.hogar.Persona.*;
import static cl.mavaria.app.hogar.ColorPelo.*;
public class EjemploPaquetes {
    public static void main(String[] args) {

        Persona p = new Persona();
        p.setNombre("Marco");
        p.setApellido("Avaria");
        p.setColorPelo(CAFE);
        System.out.println("p.nombre = " + p.getNombre());

        Perro perro = new Perro();
        perro.nombre = "tobby";
        perro.raza = "Bulldog";

        String jugando = perro.jugar(p);
        System.out.println("jugando = " + jugando);
        String saludo = saludar();
        System.out.println("saludo = " + saludo);
        String generoMujer = GENERO_FEMENINO;
        String generoHombre = GENERO_MASCULINO;

    }
}
