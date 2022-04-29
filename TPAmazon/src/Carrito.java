import java.util.HashMap;

public class Carrito {
    private HashMap<Producto,Integer> listaDeProductos;
    private Cliente cliente;

    public Carrito(HashMap<Producto, Integer> listaDeProductos, Cliente cliente) {
        this.listaDeProductos = listaDeProductos;
        this.cliente = cliente;
    }

    public HashMap<Producto, Integer> getListaDeProductos() {
        return listaDeProductos;
    }

    public void setListaDeProductos(HashMap<Producto, Integer> listaDeProductos) {
        this.listaDeProductos = listaDeProductos;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
