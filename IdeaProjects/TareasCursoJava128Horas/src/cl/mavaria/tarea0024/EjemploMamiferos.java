package cl.mavaria.tarea0024;

public class EjemploMamiferos {
    public static void main(String[] args) {
        Mamifero[] mamiferos = new Mamifero[7];
        //Canis lupus familiaris
        mamiferos[0] = new Leon("la sabana", 2.1f, 200.0f, "panthera leo",
                13.0f, 70, 12, 140.0f);
        mamiferos[1] = new Tigre("los bosques tropicales", 2.3f, 220.0f,
                "panthera tigris", 15.0f, 90,
                " tigris (tigre de bengala)");
        mamiferos[2] = new Guepardo("el sudoeste de África", 130f, 50f,
                "acinonyx jubatus", 8f, 120);
        mamiferos[3] = new Lobo("las montañas", 60f, 60,
                "canis lupus", "blanco", 12f,
                14, "albus (siberiano)");
        mamiferos[4] = new Perro("los bosques de la África subsahariana",
                45,35, "canis lupus familiaris","negro", 6,
                65);
        mamiferos[5] = new Leon("el este de Sudáfrica",2.0f,195.0f,
                "panthera leo krugeri",14.0f, 75, 14, 130.f);
        mamiferos[6] = new Tigre("los bosques del sureste de Rusia", 2.5f, 250.0f,
                "panthera tigris", 18.0f, 80,
                "altaica (tigre siberiano)");

        for (Mamifero m:mamiferos){
            System.out.println(m);
        }
    }
}