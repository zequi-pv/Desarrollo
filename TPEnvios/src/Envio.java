public abstract class Envio {
    private int id;
    private String nombreEmpresa;
    private String transportista;
    private float distanciaDeEnvio;


    public abstract float calcularTarifa(Paquete paquete);
}
