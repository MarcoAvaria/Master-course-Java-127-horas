package cl.mavaria.tarea0024;

public class Tigre extends Felino{

    private String especieTigre;

    public Tigre(String habitat, float altura, float peso, String nombreCientifico,
                 float tamanoGarras, Integer velocidad,
                 String especieTigre) {
        super(habitat, altura, peso, nombreCientifico, tamanoGarras, velocidad);
        this.especieTigre = especieTigre;
    }

    @Override
    public String comer() {
        return "El " + this.getClass().getSimpleName().toLowerCase() + " " +
                this.nombreCientifico + " de la especie " + this.especieTigre +
                ".\nEl " + this.getClass().getSimpleName().toLowerCase() + " " +
                this.nombreCientifico + " " + this.especieTigre + " caza su comida " +
                "con sus garras de " + this.tamanoGarras + " centímetros";
    }

    @Override
    public String dormir() {
        return "El " + this.getClass().getSimpleName().toLowerCase() + " " +
                this.nombreCientifico + " " + this.especieTigre + " suele dormir 5 horas";
    }

    @Override
    public String correr() {
        return "El " + this.getClass().getSimpleName().toLowerCase() + " " +
                this.nombreCientifico + " " + this.especieTigre + " corre a una velocidad de " +
                this.velocidad;
    }

    @Override
    public String comunicarse() {
        return "El " + this.getClass().getSimpleName().toLowerCase() + " " +
                this.nombreCientifico + " " + this.especieTigre + " se comunica con los suyos en " +
                this.habitat;
    }
}