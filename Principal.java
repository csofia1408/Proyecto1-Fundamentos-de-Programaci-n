import java.util.Scanner;
import java.util.ArrayList;
public class Principal{
    
    Vehiculo v = new Vehiculo();
    Sensor s = new Sensor();
    
    public static void main(String[] args) {
        Principal p = new Principal();
        p.mostrarMenu();
    }
    public void mostrarMenu(){
        boolean a = true;
        while(a){
            
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            
            if(num == 0){
                break;
            }
            if(num == 1){
                int modelo = sc.nextInt();
                String marca = sc.next();
                double valorComercial = sc.nextDouble();
                String color = sc.next();
                v.anadirVehiculo(modelo, marca, valorComercial, color);
            }
            if(num == 2){
                System.out.println(v.toStringVehiculos());
            }
            if(num == 3){
                System.out.println(v.cantidadVehiculos());
            }
            if(num == 4){
                ArrayList<Vehiculo> filtrarVehiculos = Vehiculo.filtrarVehiculos("verde");
                for (int i = 0; i < filtrarVehiculos.size(); i++) {
                    System.out.println(filtrarVehiculos.get(i).toString());
                }
            }
            if(num == 5){
                String tipo = sc.next();
                double valor = sc.nextDouble();
                s.anadirSensor(tipo, valor);
            }
            if(num == 6){
                System.out.println(s.toStringSensores());
            }
            if(num == 7){
                System.out.println(s.cantidadSensores());
            }
            if(num == 8){
                ArrayList<Sensor>sensoresFiltrados = Sensor.filtrarSensores("temperatura");
                for (int i = 0; i < sensoresFiltrados.size(); i++) {
                    System.out.println(sensoresFiltrados.get(i).toString());
                }
            }
            
            if(num == 666){
                ArrayList<Sensor> sensoresTemperatura = Sensor.filtrarSensores("temperatura");
                sensoresTemperatura = Sensor.ordenarMenorMayor(sensoresTemperatura);
                for (int i = 0; i < sensoresTemperatura.size(); i++) {
                    System.out.println(sensoresTemperatura.get(i).toString());
                }
            }
        }
    }
}