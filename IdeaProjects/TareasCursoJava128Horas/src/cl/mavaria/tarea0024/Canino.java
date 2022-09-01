package cl.mavaria.tarea0024;

abstract public class Canino extends Mamifero{

    protected String color;
    protected float tamanoColmillos;

    public Canino(String habitat, float altura, float peso, String nombreCientifico,
                  String color, float tamanoColmillos) {
        super(habitat, altura, peso, nombreCientifico);
        this.color = color;
        this.tamanoColmillos = tamanoColmillos;
    }

    public String getColor() {
        return color;
    }

    public float getTamanoColmillos() {
        return tamanoColmillos;
    }
}