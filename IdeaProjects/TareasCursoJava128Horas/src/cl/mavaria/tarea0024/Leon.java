package cl.mavaria.tarea0024;

public class Leon extends Felino{

    private int numeroManada;
    private float potenciaRugido;

    public Leon(String habitat, float altura, float peso, String nombreCientifico,
                float tamanoGarras, Integer velocidad,
                int numeroManada, float potenciaRugido) {
        super(habitat, altura, peso, nombreCientifico, tamanoGarras, velocidad);
        this.numeroManada = numeroManada;
        this.potenciaRugido = potenciaRugido;
    }


    @Override
    public String comer() {
        return "El " + this.getClass().getSimpleName().toLowerCase() + " " +
                this.nombreCientifico + " come con su numerosa manada de " + this.numeroManada +
                ".\nEl " + this.getClass().getSimpleName().toLowerCase() +
                " " + this.nombreCientifico + " caza su comida " +
                "con sus garras de " + this.tamanoGarras + " centímetros";
    }

    @Override
    public String dormir() {
        return "El " + this.getClass().getSimpleName().toLowerCase() + " " +
                this.nombreCientifico + " duerme junto a su manada de " +
                this.numeroManada + " leones";
    }

    @Override
    public String correr() {
        return "El " + this.getClass().getSimpleName().toLowerCase() + " " +
                this.nombreCientifico + "corre a una velocidad de " + this.velocidad;
    }

    @Override
    public String comunicarse() {
        return "El " + this.getClass().getSimpleName().toLowerCase() + " " +
                this.nombreCientifico + " se comunica con los suyos con un rugido de " +
                this.potenciaRugido + " decibeles";
    }
}