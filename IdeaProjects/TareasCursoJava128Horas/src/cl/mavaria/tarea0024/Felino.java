package cl.mavaria.tarea0024;

abstract public class Felino extends Mamifero {

    protected float tamanoGarras;
    protected Integer velocidad;

    public Felino(String habitat, float altura, float peso, String nombreCientifico,
                  float tamanoGarras, Integer velocidad) {
        super(habitat, altura, peso, nombreCientifico);
        this.tamanoGarras = tamanoGarras;
        this.velocidad = velocidad;
    }

    public float getTamanoGarras() {
        return tamanoGarras;
    }

    public Integer getVelocidad() {
        return velocidad;
    }
}