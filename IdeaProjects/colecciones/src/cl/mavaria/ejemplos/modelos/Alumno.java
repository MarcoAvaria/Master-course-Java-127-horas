package cl.mavaria.ejemplos.modelos;

import java.util.Comparator;
import java.util.Objects;

public class Alumno implements Comparable<Alumno> {
    private String nombre;
    private Integer nota;

    public Alumno() {
    }

    public Alumno(String nombre, int nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return nombre + ", nota= " + nota;
    }

    @Override
    public int compareTo(Alumno a) {
        /*if (this.nombre == null){
            return 0;
        }
        return this.nombre.compareTo(a.getNombre());*/
        /*if (this.nota == a.getNota()){
            return 0;
        }
        if (this.nota > a.getNota()){
            return 1;
        } else if (this.nota < a.getNota()) {
            return -1;
        }*/
        if (this.nota == null) {
            return 0;
        }
        return this.nota.compareTo(a.nota);


    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Alumno alumno = (Alumno) o;
        return Objects.equals(nombre, alumno.nombre) &&
                Objects.equals(nota, alumno.nota);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, nota);
    }
}
