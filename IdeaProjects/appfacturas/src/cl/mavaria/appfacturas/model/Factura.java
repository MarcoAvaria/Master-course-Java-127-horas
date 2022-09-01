package cl.mavaria.appfacturas.model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Factura {

    private int folio;
    private String description;
    private Date fecha;
    private Cliente cliente;
    private ItemFactura[] items;
    private int indiceItems;
    public static final int MAX_ITEMS = 12;
    private static int ultimoFolio;

    public Factura(String description, Cliente cliente) {
        this.description = description;
        this.cliente = cliente;
        this.items = new ItemFactura[MAX_ITEMS];
        this.folio = ++ultimoFolio;
        this.fecha = new Date();
    }

    public int getFolio() {
        return folio;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ItemFactura[] getItems() {
        return items;
    }

    public void addItemFactura(ItemFactura item){
        if (indiceItems < MAX_ITEMS) {
            this.items[indiceItems++] = item;
        }
    }

    public float calcularTotal(){
        float total = 0.0f;
        for (int i = 0; i < indiceItems; i++){
            total += items[i].calcularImporte();
        }
        return total;
    }

    public String generarDetalle(){
        StringBuilder sb = new StringBuilder("Factura N°: ");
        sb.append(folio)
                .append("\nCliente: ")
                .append((this.cliente.getNombre()))
                .append("\t NIF: ")
                .append(this.cliente.getNif())
                .append("\nDescripción: ")
                .append(this.description)
                .append("\n");

        SimpleDateFormat df = new SimpleDateFormat("dd 'de' MMMM, yyyy");
        sb.append("Fecha Emisión: ")
                .append((df.format(this.fecha)))
                .append("\n")
                .append("\n#\tNombre\t$\tCant.\tTotal\n");

        for (int i = 0; i < indiceItems; i++){
            sb.append(this.items[i].toString())
                    .append("\n");
        }

        sb.append("\nGran Total: ")
                .append(this.calcularTotal());

        return sb.toString();
    }

    @Override
    public String toString() {
        return generarDetalle();
    }
}
