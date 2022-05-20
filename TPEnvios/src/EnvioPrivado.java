public class EnvioPrivado extends Envio{
    private float datoOpcional;
    private float datoOpcionalX;

    @Override
    public float calcularTarifa(Paquete paquete) {
        float tarifaTotal;
        tarifaTotal = paquete.getPeso() * paquete.getPrecio() * datoOpcional;
        return tarifaTotal;
    }

}
