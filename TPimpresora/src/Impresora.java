import java.util.ArrayList;

public class Impresora {
    private String ip;
    private ArrayList<Archivo> colaDeImpresion;
    private ArrayList<Dispositivo> dispositivosConectados;
    private Impresora instance;

    private Impresora() {
    }

    private Impresora(String ip, ArrayList<Archivo> colaDeImpresion, ArrayList<Dispositivo> dispositivosConectados) {
        this.ip = ip;
        this.colaDeImpresion = colaDeImpresion;
        this.dispositivosConectados = dispositivosConectados;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public ArrayList<Archivo> getColaDeImpresion() {
        return colaDeImpresion;
    }

    public void setColaDeImpresion(ArrayList<Archivo> colaDeImpresion) {
        this.colaDeImpresion = colaDeImpresion;
    }

    public ArrayList<Dispositivo> getDispositivosConectados() {
        return dispositivosConectados;
    }
    public Impresora getInstance(){
        return instance;
    }

    public void setDispositivosConectados(ArrayList<Dispositivo> dispositivosConectados) {
        this.dispositivosConectados = dispositivosConectados;
    }

    public void conectarDispositivo(Dispositivo dispositivo){
        this.dispositivosConectados.add(dispositivo);
    }

    public void ordenarArchivos(ArrayList<Archivo>colaDeImpresion){
        for (Archivo aux : colaDeImpresion) {
            float tiempArchAc = aux.getIngresoAlaCola();
            float tiempArchSig = 0;

                
        }
    }

    public Impresora getInstance(Impresora impresora){
      boolean hayInstancia;
        if(impresora.getInstance()!=null){
            hayInstancia = true;
            return impresora;
        }
        else{
            hayInstancia = false;
            Impresora impresora1 = new Impresora();
            return impresora1;
        }
    }

}
