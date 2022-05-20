public class Dispositivo {
    private String ip;
    private String tipoDeConexion;

    public Dispositivo(String ip, String tipoDeConexion) {
        this.ip = ip;
        this.tipoDeConexion = tipoDeConexion;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getTipoDeConexion() {
        return tipoDeConexion;
    }

    public void setTipoDeConexion(String tipoDeConexion) {
        this.tipoDeConexion = tipoDeConexion;
    }
}
