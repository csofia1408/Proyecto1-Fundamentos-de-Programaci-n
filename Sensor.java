import java.util.ArrayList;
public class Sensor {
    public static Sensor[] sensores = new Sensor[8];
    public int tamano = 8;
    public static int posAnadir = 0;
    private String tipo;
    private double valor;
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    Sensor(){
    }
    Sensor(String t, double v){
        Sensor temp = new Sensor();
        this.sensores[this.posAnadir] = temp;
        this.sensores[this.posAnadir].tipo = t;
        this.sensores[this.posAnadir].valor = v;
        this.posAnadir += 1;
    }
    public String toString(){
        return "Este sensor es de tipo: " + this.tipo + " y tiene un valor de: " + this.valor;
    }
    public static String toStringSensores(){
        String texto = "";
        for (int i = 0; i < posAnadir; i++) {
            texto = texto + "Este sensor es de tipo: " + sensores[i].tipo + " y tiene un valor: " + sensores[i].valor +"\n";
        }
        return  texto;
    }
    public static ArrayList<Sensor> filtrarSensores(String tipoAFiltrar){
        ArrayList<Sensor> sensoresTemperatura = new ArrayList<Sensor>();
        for(int i = 0; i < posAnadir; i++){
            if((sensores[i].getTipo()).equals(tipoAFiltrar)){
                sensoresTemperatura.add(sensores[i]);
            }
        }
        return sensoresTemperatura;
    }
    public static ArrayList<Sensor> ordenarMenorMayor(ArrayList<Sensor> sensoresTemperatura){
        Sensor val;
        int n = sensoresTemperatura.size();
        for(int i=1; i<n; i++) {
            for(int j=0; j<n-i; j++){
                if(sensoresTemperatura.get(j).getValor()>sensoresTemperatura.get(j+1).getValor() ) {
                    val = sensoresTemperatura.get(j);
                    sensoresTemperatura.set(j,sensoresTemperatura.get(j+1)) ;
                    sensoresTemperatura.set(j+1,val);
                }
            }
        }
        return sensoresTemperatura;
    }
    public void anadirSensor(String tipo, double valor){
        if(posAnadir < 8){
            new Sensor(tipo,valor);
        }else{
            System.out.println("Ya haz alcanzado el máximo de sensores posibles :(");
        }
    }
    public static int cantidadSensores(){
        return posAnadir;
    }
}
