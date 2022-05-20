import java.util.ArrayList;

public class BaseCompuesta extends Base{
    private ArrayList<BaseIndi> bases;
    private int NumAmbulacias;
    private float TimepoPromedio;

    public ArrayList<BaseIndi> getBases() {
        return bases;
    }

    public void setBases(ArrayList<BaseIndi> bases) {
        this.bases = bases;
    }

    public int getNumAmbulacias() {
        return NumAmbulacias;
    }

    public void setNumAmbulacias(int numAmbulacias) {
        NumAmbulacias = numAmbulacias;
    }

    public float getTimepoPromedio() {
        return TimepoPromedio;
    }

    public void setTimepoPromedio(float timepoPromedio) {
        TimepoPromedio = timepoPromedio;
    }

    public int ambulaciasTotales(ArrayList<BaseIndi>baseIndis){
        int cantTotal = 0;
        for (BaseIndi na:baseIndis) {
            int amb = na.getNumeroAmbulacias();
            cantTotal = cantTotal + amb;
        }
        return cantTotal;
    }

    public float promTiempos(ArrayList<BaseIndi>bases){
        float tiempoTotal = 0;
        float cantbases = 0;
        for (BaseIndi tiempoMedio:bases) {
            cantbases = cantbases + 1;
            float timep = tiempoMedio.getTiempoMedioDeAsistencia();
            tiempoTotal = tiempoTotal + timep;
        }
        float tiempoProm = tiempoTotal / cantbases;
        return tiempoProm;
    }
}
