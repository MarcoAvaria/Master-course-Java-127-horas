package cl.mavaria.pooherencia;

public class Alumno extends Persona {
    private String institucion;
    private double notaMatematicas;
    private double notaCastellano;
    private double notaHistoria;

    public Alumno(){
        //super(nombre);
        System.out.println("Alumno: inicializando constructor...");
    }

    public Alumno(String nombre, String apellido){
        super(nombre, apellido);
    }

    public Alumno(String nombre, String apellido, int edad){
        super(nombre, apellido, edad);
    }

    public Alumno(String nombre, String apellido, int edad, String institucion){
        super(nombre, apellido, edad);
        this.institucion = institucion;
    }

    public Alumno(String nombre, String apellido, int edad,
                  String institucion, double notaMatematicas, double notaCastellano,
                  double notaHistoria){
        this(nombre, apellido, edad, institucion);
        this.notaMatematicas = notaMatematicas;
        this.notaCastellano = notaCastellano;
        this.notaHistoria = notaHistoria;
    }

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public double getNotaMatematicas() {
        return notaMatematicas;
    }

    public void setNotaMatematicas(double notaMatematicas) {
        this.notaMatematicas = notaMatematicas;
    }

    public double getNotaCastellano() {
        return notaCastellano;
    }

    public void setNotaCastellano(double notaCastellano) {
        this.notaCastellano = notaCastellano;
    }

    public double getNotaHistoria() {
        return notaHistoria;
    }

    public void setNotaHistoria(double notaHistoria) {
        this.notaHistoria = notaHistoria;
    }

    @Override
    public String saludar(){
        String saludar = super.saludar();
        return saludar + " soy un alumno y mi nombre es " + getNombre();
    }

    public double calcularPromedio(){
        //System.out.println("Calcular promedio: " + Alumno.class.getCanonicalName());
        return (notaHistoria + notaCastellano + notaMatematicas)/3;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\ninstitucion='" + institucion + '\'' +
                ", notaMatematicas=" + notaMatematicas +
                ", notaCastellano=" + notaCastellano +
                ", notaHistoria=" + notaHistoria +
                ", promedio= " + this.calcularPromedio();
    }
}
