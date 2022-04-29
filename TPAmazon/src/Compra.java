import java.util.HashMap;
import java.util.Map;

public class Compra {
    private HashMap<Producto,Integer> productos;
    private Cliente cliente;
    private Tarjeta tarjeta;
    private String direccion;
    private float precioTotal;

    public Compra() {
    }

    public Compra(HashMap<Producto, Integer> productos, Cliente cliente, Tarjeta tarjeta, String direccion, float precioTotal) {
        this.productos = productos;
        this.cliente = cliente;
        this.tarjeta = tarjeta;
        this.direccion = direccion;
        this.precioTotal = precioTotal;
    }

    public HashMap<Producto, Integer> getProductos() {
        return productos;
    }

    public void setProductos(HashMap<Producto, Integer> productos) {
        this.productos = productos;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Tarjeta getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(Tarjeta tarjeta) {
        this.tarjeta = tarjeta;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public float getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(float precioTotal) {
        this.precioTotal = precioTotal;
    }

    public boolean crearCompra(Carrito carrito, Tarjeta tarjeta){
        float precio = 0;
        for (Tarjeta tarjetaAux:carrito.getCliente().getTarjetas()) {
            if(tarjeta == tarjetaAux){
                this.productos = carrito.getListaDeProductos();
                for(Map.Entry<Producto,Integer> entry : productos.entrySet()){
                    precio = entry.getKey().getPrecio() * entry.getValue();
                }
                setPrecioTotal(precio);
                System.out.println(precioTotal);
                return true;
            }
        }
        return false;
    }

}
