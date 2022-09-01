import java.util.Date;

public class OrdenCompra {

    private Integer identificador;
    private String descripcion;
    private Date fecha;
    private Cliente cliente;
    private Producto[] productos;
    private int indiceProductos;

    private static int last_id;

    public OrdenCompra(String descripcion){
        this.descripcion = descripcion;
        this.identificador = ++last_id;
        this.productos = new Producto[4];
    }

    public Integer getIdentificador() {
        return identificador;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Producto[] getProductos() {
        return productos;
    }

    public static int getLast_id() {
        return last_id;
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

    public void addProducto(Producto producto){
        if (this.indiceProductos < this.productos.length){
            this.productos[indiceProductos++] = producto;
        }
    }

    public Integer getTotal(){
        Integer total = 0;
        for (Producto prod: this.productos){
            total += prod.getPrecio();
        }
        return total;
    }
}