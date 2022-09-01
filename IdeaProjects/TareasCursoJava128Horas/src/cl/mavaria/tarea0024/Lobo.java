package cl.mavaria.tarea0024;

public class Lobo extends Canino{

    private int numeroCamada;
    private String especieLobo;

    public Lobo(String habitat, float altura, float peso, String nombreCientifico,
                String color, float tamanoColmillos,
                int numeroCamada, String especieLobo) {
        super(habitat, altura, peso, nombreCientifico, color, tamanoColmillos);
        this.numeroCamada = numeroCamada;
        this.especieLobo = especieLobo;
    }

    @Override
    public String comer() {
        return "El " + this.getClass().getSimpleName().toLowerCase() + " " +
                this.nombreCientifico + " come con su numerosa camada de " +
                this.numeroCamada + ".\nEl " + this.getClass().getSimpleName().toLowerCase() + " " +
                this.nombreCientifico + " come su comida " +
                "con sus colmillos de " + this.tamanoColmillos + " centímetros";
    }

    @Override
    public String dormir() {
        return "El " + this.getClass().getSimpleName().toLowerCase() + " " +
                this.nombreCientifico + " " + this.especieLobo + " duerme con su camada de " +
                this.numeroCamada + " " + this.getClass().getSimpleName() + "s";
    }

    @Override
    public String correr() {
        return "El " + this.getClass().getSimpleName().toLowerCase() + " " +
                this.nombreCientifico + " " + this.especieLobo + "suele correr junto a su camada";
    }

    @Override
    public String comunicarse() {
        return "El " + this.getClass().getSimpleName().toLowerCase() + " " +
                this.nombreCientifico + " de la especie " + this.especieLobo +
                "se comunica con su camada de " + this.numeroCamada + " en " + this.habitat;
    }
}