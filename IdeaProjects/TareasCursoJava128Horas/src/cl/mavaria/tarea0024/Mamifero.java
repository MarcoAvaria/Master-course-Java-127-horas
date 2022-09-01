package cl.mavaria.tarea0024;

abstract public class Mamifero {

    protected String habitat;
    protected float altura;
    protected float peso;
    protected String nombreCientifico;

    public Mamifero(String habitat, float altura, float peso, String nombreCientifico) {
        this.habitat = habitat;
        this.altura = altura;
        this.peso = peso;
        this.nombreCientifico = nombreCientifico;
    }

    public String getHabitat() {
        return habitat;
    }

    public float getAltura() {
        return altura;
    }

    public float getPeso() {
        return peso;
    }

    public String getNombreCientifico() {
        return nombreCientifico;
    }

    abstract public String comer();
    abstract public String dormir();
    abstract public String correr();
    abstract public String comunicarse();

    @Override
    public String toString() {
        return "========================================\n" +
                comer() + "\n" + dormir() + "\n" + correr() + "\n" + comunicarse() + "\n" +
                "========================================\n";
    }
}