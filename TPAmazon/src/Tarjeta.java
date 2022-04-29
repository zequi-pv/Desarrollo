public class Tarjeta {
    private int numero;
    private String fechaVto;
    private boolean verificada;

    public Tarjeta(int numero, String fechaVto, boolean verificada) {
        this.numero = numero;
        this.fechaVto = fechaVto;
        this.verificada = verificada;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getFechaVto() {
        return fechaVto;
    }

    public void setFechaVto(String fechaVto) {
        this.fechaVto = fechaVto;
    }

    public boolean isVerificada() {
        return verificada;
    }

    public void setVerificada(boolean verificada) {
        this.verificada = verificada;
    }
}
