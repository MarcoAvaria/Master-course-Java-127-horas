package cl.mavaria.tarea0021.clasesPersonas;

public class Cliente extends Persona {
    private int clienteId;

    public int getClienteId() {
        return clienteId;
    }

    public Cliente(String nombre, String apellido, String numeroFiscal, String direccion, int clienteId) {
        super(nombre, apellido, numeroFiscal, direccion);
        this.clienteId = clienteId;
    }

    @Override
    public String toString() {
        return super.toString() + "\nDatos clase Cliente: " +
                "\n\tclienteId= " + clienteId;
    }
}