public class envioCortaDist extends EnvioEstandar{
    private static float PRECIO = 500;

    @Override
    public float calcularTarifa(Paquete paquete) {
        float tarifaTotal;
        tarifaTotal = paquete.getPeso() * paquete.getPrecio() * PRECIO;
        return tarifaTotal;
    }

}
