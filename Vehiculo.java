import java.util.ArrayList;
public class Vehiculo{
    public static Vehiculo[] vehiculos = new Vehiculo[10];
    public static int tamano = 10;
    public static int posAnadir = 0;
    private int modelo;
    private String marca;
    private double valorComercial;
    private String color;
    public Vehiculo(){

    }
    public Vehiculo(int mo,String ma,double va){
        this(mo,ma,va,"verde");
    }
    public Vehiculo(int mo,String ma,double va,String co){
        Vehiculo v2 = new Vehiculo();
        this. vehiculos[posAnadir]= v2;
        this.vehiculos[posAnadir].modelo = mo;
        this.vehiculos[posAnadir].marca = ma;
        this.vehiculos[posAnadir].valorComercial = va;
        this.vehiculos[posAnadir].color = co;
        posAnadir = posAnadir+1;
    }
    public int getmodelo(){
        return this.modelo;
    }
    public String getmarca(){
        return this.marca;
    }
    public double getvalorComercial(){
        return this.valorComercial;
    }
    public String getcolor(){
        return this.color;
    }
    public void setmodelo(int mo){
        this.modelo = mo;
    }
    public void setmarca(String ma){
        this.marca = ma;
    }
    public void setvalorComercial(double va){
        this.valorComercial = va;
    }
    public void setcolor(String co){
        this.color = co;
    }
    public static String toStringVehiculos(){
        String texto = "";
        for(int i = 0; i < posAnadir; i++){
            texto = texto + "Modelo: " + vehiculos[i].modelo + ", marca: " + vehiculos[i].marca + ", valor comercial: " + vehiculos[i].valorComercial + ", color: " + vehiculos[i].color + "\n";
        }
        return texto;
    }
    public static int cantidadVehiculos(){
        int cantidadvehiculos = posAnadir;
        return cantidadvehiculos;
    }
    public String toString(){
        return "Este auto es de modelo: " + this.modelo + ", de la marca: " +  this.marca +  ", de color: " + this.color + ", con un valor comercial de: $" + this.valorComercial;
    }
    public static ArrayList<Vehiculo> filtrarVehiculos(String tipoAFiltrar){
        ArrayList<Vehiculo> vehiculosFiltrados = new ArrayList<Vehiculo>();
        for(int i = 0; i < posAnadir; i++){
            if((vehiculos[i].getcolor()).equals(tipoAFiltrar)){
                vehiculosFiltrados.add(vehiculos[i]);
            }
        }
        return vehiculosFiltrados;
    }
    public void anadirVehiculo(int modelo, String marca, double valor, String color){
        if(posAnadir < 10){
            new Vehiculo(modelo, marca, valor, color);
        }else{
            System.out.println("Ya haz alcanzado el máximo de vehículos posibles :(");
        }
    }
}