import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Producto producto1 = new Producto("Electronica","PS5",500,3,"Pepito");
        Producto producto2 = new Producto("Comida","Pizza",10,300,"Geronimo");
        Producto producto3 = new Producto("Libreria","Cuadernillo",25,100,"Camila");
        HashMap<Producto,Integer> productos = new HashMap<>();
        productos.put(producto1,1);
        productos.put(producto2,100);
        productos.put(producto3,5);
        Tarjeta tarjeta = new Tarjeta(1234,"06/32",true);
        ArrayList<Tarjeta> tarjetas = new ArrayList<>();
        tarjetas.add(tarjeta);
        ArrayList<Carrito> carritos = new ArrayList<>();
        Cliente cliente = new Cliente("Carlos","Constituyentes 5800","007","carlos@gmail.com",true,tarjetas,carritos);
        Carrito carrito = new Carrito(productos,cliente);
        carritos.add(carrito);
        Compra compra = new Compra(productos,cliente,tarjeta,"Constituyentes 5800",0);
        compra.crearCompra(carrito,tarjeta);
    }
}