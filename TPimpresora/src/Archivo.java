import java.security.Timestamp;

public class Archivo {
    private float ingresoAlaCola;
    private String tipoDeArchivo;
    private float tamanio;
    private String nombre;
    private boolean color;
    private Dispositivo enviadoPor;



    public float getIngresoAlaCola() {
        return ingresoAlaCola;
    }

    public void setIngresoAlaCola(float ingresoAlaCola) {
        this.ingresoAlaCola = ingresoAlaCola;
    }

    public String getTipoDeArchivo() {
        return tipoDeArchivo;
    }

    public void setTipoDeArchivo(String tipoDeArchivo) {
        this.tipoDeArchivo = tipoDeArchivo;
    }

    public float getTamanio() {
        return tamanio;
    }

    public void setTamanio(float tamanio) {
        this.tamanio = tamanio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isColor() {
        return color;
    }

    public void setColor(boolean color) {
        this.color = color;
    }

    public Dispositivo getEnviadoPor() {
        return enviadoPor;
    }

    public void setEnviadoPor(Dispositivo enviadoPor) {
        this.enviadoPor = enviadoPor;
    }
}
