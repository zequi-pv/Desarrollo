import java.util.ArrayList;
public class Cliente {
    private String nombre;
    private String direccionDeEnvio;
    private String direccionDeCobro;
    private String email;
    private boolean esPreferencial;
    private ArrayList<Tarjeta> tarjetas;
    private ArrayList<Carrito> carritos;

    public Cliente(String nombre, String direccionDeEnvio, String direccionDeCobro, String email, boolean esPreferencial, ArrayList<Tarjeta> tarjetas, ArrayList<Carrito> carritos) {
        this.nombre = nombre;
        this.direccionDeEnvio = direccionDeEnvio;
        this.direccionDeCobro = direccionDeCobro;
        this.email = email;
        this.esPreferencial = esPreferencial;
        this.tarjetas = tarjetas;
        this.carritos = carritos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccionDeEnvio() {
        return direccionDeEnvio;
    }

    public void setDireccionDeEnvio(String direccionDeEnvio) {
        this.direccionDeEnvio = direccionDeEnvio;
    }

    public String getDireccionDeCobro() {
        return direccionDeCobro;
    }

    public void setDireccionDeCobro(String direccionDeCobro) {
        this.direccionDeCobro = direccionDeCobro;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isEsPreferencial() {
        return esPreferencial;
    }

    public void setEsPreferencial(boolean esPreferencial) {
        this.esPreferencial = esPreferencial;
    }

    public ArrayList<Tarjeta> getTarjetas() {
        return tarjetas;
    }

    public void setTarjetas(ArrayList<Tarjeta> tarjetas) {
        this.tarjetas = tarjetas;
    }

    public ArrayList<Carrito> getCarritos() {
        return carritos;
    }

    public void setCarritos(ArrayList<Carrito> carritos) {
        this.carritos = carritos;
    }
}
