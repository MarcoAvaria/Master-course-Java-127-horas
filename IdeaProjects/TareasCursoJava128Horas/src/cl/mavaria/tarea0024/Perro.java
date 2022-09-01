package cl.mavaria.tarea0024;

public class Perro extends Canino{

    private int fuerzaMordida;

    public Perro(String habitat, float altura, float peso, String nombreCientifico,
                 String color, float tamanoColmillos,
                 int fuerzaMordida) {
        super(habitat, altura, peso, nombreCientifico, color, tamanoColmillos);
        this.fuerzaMordida = fuerzaMordida;
    }

    @Override
    public String comer() {
        return "El " + this.getClass().getSimpleName().toLowerCase() + " " +
                this.nombreCientifico + " mastica su comida con sus colmillos de " +
                this.tamanoColmillos + " centímetros y con una fuerza de mordida de " +
                this.fuerzaMordida + " psi";
    }

    @Override
    public String dormir() {
        return "El " + this.getClass().getSimpleName().toLowerCase() + " " +
                this.nombreCientifico + " de color " + this.color +
                " duerme con los suyos del mismo color " + this.color;
    }

    @Override
    public String correr() {
        return "El " + this.getClass().getSimpleName().toLowerCase() + " " +
                this.nombreCientifico + " de color " + this.color +
                " suele correr junto a su camada";
    }

    @Override
    public String comunicarse() {
        return "El " + this.getClass().getSimpleName().toLowerCase() + " " +
                this.nombreCientifico + " se comunica con los suyos en" + this.habitat;
    }
}