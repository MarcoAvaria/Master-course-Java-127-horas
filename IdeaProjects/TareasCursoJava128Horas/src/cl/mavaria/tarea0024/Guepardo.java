package cl.mavaria.tarea0024;

public class Guepardo extends Felino{

    public Guepardo(String habitat, float altura, float peso, String nombreCientifico,
                    float tamanoGarras, Integer velocidad) {
        super(habitat, altura, peso, nombreCientifico, tamanoGarras, velocidad);
    }

    @Override
    public String comer() {
        return "El " + this.getClass().getSimpleName().toLowerCase() + " " +
                this.nombreCientifico + " caza su comida " +
                "con sus garras de " + this.tamanoGarras + " centímetros";
    }

    @Override
    public String dormir() {
        return "El " + this.getClass().getSimpleName().toLowerCase() + " " +
                this.nombreCientifico + " suele dormir 10 horas";
    }

    @Override
    public String correr() {
        return "El " + this.getClass().getSimpleName().toLowerCase() + " " +
                this.nombreCientifico + " corre a una velocidad de " + this.velocidad;
    }

    @Override
    public String comunicarse() {
        return "El " + this.getClass().getSimpleName().toLowerCase() + " " +
                this.nombreCientifico + " suele comunicarse con los suyos en su propio habitat: " +
                this.habitat;
    }
}