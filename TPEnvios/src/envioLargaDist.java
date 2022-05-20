public class envioLargaDist extends EnvioEstandar{
    private static float PRECIO = 1000;

    @Override
    public float calcularTarifa(Paquete paquete) {
        float tarifaTotal = 0;
        tarifaTotal = paquete.getPeso() * paquete.getPrecio() * PRECIO;
        return tarifaTotal;
    }

}
