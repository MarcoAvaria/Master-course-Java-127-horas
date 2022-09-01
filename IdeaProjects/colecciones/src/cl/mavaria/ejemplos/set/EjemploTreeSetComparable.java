package cl.mavaria.ejemplos.set;

import cl.mavaria.ejemplos.modelos.Alumno;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class EjemploTreeSetComparable {
    public static void main(String[] args) {
        //Set<Alumno> sa = new TreeSet<>(Comparator.comparing(Alumno::getNombre));
        //Set<Alumno> sa = new TreeSet<>((a,b)-> a.getNombre().compareTo(b.getNombre())); //Es lo mismo que arriba
        Set<Alumno> sa = new TreeSet<>((a,b)-> a.getNota().compareTo(b.getNota()));
        sa.add(new Alumno("Pato", 5));
        sa.add(new Alumno("Cata", 6));
        sa.add(new Alumno("Lucy", 4));
        sa.add(new Alumno("Jano", 7));
        sa.add(new Alumno("Andres", 3));
        sa.add(new Alumno("Zeus", 2));
        sa.add(new Alumno("Lucas", 2));

        System.out.println(sa);
    }
}
