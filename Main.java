import java.util.ArrayList;

public class Main{
    public static void main(String[] args){
        ArrayList<Double> mon = new ArrayList<>();
        mon.add(99.1);
        mon.add(142.0);
        mon.add(85.0);
        mon.add(85.1);
        mon.add(84.6);
        mon.add(94.3);
        mon.add(124.9);
        mon.add(98.0);
        mon.add(101.0);
        mon.add(102.5);
        
        WeatherData monday = new WeatherData(mon);
        System.out.println(monday);
        monday.cleanData(85.0, 120.0);
        System.out.println(monday);
    }
}