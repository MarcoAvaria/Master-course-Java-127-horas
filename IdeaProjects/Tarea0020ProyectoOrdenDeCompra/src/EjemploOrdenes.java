import java.util.Date;

public class EjemploOrdenes {
    public static void main(String[] args) {

        Producto producto1 = new Producto("Nestle", "Leche Milo", 1200);
        Producto producto2 = new Producto("Coca-Cola", "Sprite", 1500);
        Producto producto3 = new Producto("PepsiCo", "Quaker", 1350);
        Producto producto4 = new Producto("Nestle", "NesCafé", 750);
        Producto producto5 = new Producto("Carozzi", "Dulces Ambrosoli", 900);
        Producto producto6 = new Producto("Agrosuper", "Super Cerdo", 2900);
        Producto producto7 = new Producto("Watts", "Yogu yogu", 450);
        Producto producto8 = new Producto("PepsiCo", "7-Up", 1400);
        Producto producto9 = new Producto("Carozzi", "Trattoria", 950);
        Producto producto10 = new Producto("Coca-Cola", "Andina Valle", 1050);
        Producto producto11 = new Producto("Tresmontes lucchetti", "Miraflores", 1950);
        Producto producto12 = new Producto("Agrosuper", "Hamburgesa La Crianza", 850);

        Cliente cliente1 = new Cliente("Solid","Snake");
        Cliente cliente2 = new Cliente("Ippo","Makanaouchi");
        Cliente cliente3 = new Cliente("Hitohito","Tadano");

        OrdenCompra orden1 = new OrdenCompra("Compras de Snake");
        orden1.setCliente(cliente1);
        orden1.setFecha(new Date());
        OrdenCompra orden2 = new OrdenCompra("Compras de Makanaouchi");
        orden2.setCliente(cliente2);
        orden2.setFecha(new Date());
        OrdenCompra orden3 = new OrdenCompra("Compras de Tadano");
        orden3.setCliente(cliente3);
        orden3.setFecha(new Date());

        orden1.addProducto(producto1);
        orden1.addProducto(producto2);
        orden1.addProducto(producto3);
        orden1.addProducto(producto4);

        orden2.addProducto(producto5);
        orden2.addProducto(producto6);
        orden2.addProducto(producto7);
        orden2.addProducto(producto8);

        orden3.addProducto(producto9);
        orden3.addProducto(producto10);
        orden3.addProducto(producto11);
        orden3.addProducto(producto12);

        OrdenCompra[] ordenes = {orden1, orden2, orden3};

        for (OrdenCompra ord: ordenes) {
            System.out.println(ord.getDescripcion() + "\n" +
                    "\tId Client: " + ord.getIdentificador() + "\n" +
                    "\tNombre: " + ord.getCliente().getNombre() +
                    " " + ord.getCliente().getApellido() + "\n" +
                    "\tFecha: " + ord.getFecha() + "\n" +
                    "\tTotal valor compra: " + ord.getTotal() + "\n" +
                    "\tProductos: ");
            int num = 0;
            for (Producto prod : ord.getProductos()) {
                System.out.println("\tProducto: " + (++num) +
                        "\n\t\tFabricante: " + prod.getFabricante() +
                        "\n\t\tNombre producto: " + prod.getNombre() +
                        "\n\t\tPrecio: " + prod.getPrecio());
            }
            System.out.println();
        }
    }
}