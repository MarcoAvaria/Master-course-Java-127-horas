package cl.mavaria.tarea0021.ejemplo;

import cl.mavaria.tarea0021.clasesPersonas.Gerente;

public class Main {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Marco", "Avaria", "12345",
                "Calle Norte", 2000000.0, 123, 50000000.0);
        System.out.println(gerente);
    }
}