public class EnvioEstandar extends Envio{
    private float tarifaLocal;
    private float tarifaLargaDistancia;

    @Override
    public float calcularTarifa(Paquete paquete) {
        return 0;
    }
}
