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
        System.out.println("");

        ArrayList<Double> tue = new ArrayList<>();
        tue.add(100.5);
        tue.add(98.5);
        tue.add(102.0);
        tue.add(103.9);
        tue.add(87.5);
        tue.add(105.2);
        tue.add(90.3);
        tue.add(94.8);
        tue.add(109.1);
        tue.add(102.1);
        tue.add(107.4);
        tue.add(93.2);

        WeatherData tuesday = new WeatherData(tue);
        System.out.println(tuesday);
        System.out.println(tuesday.longestHeatWave(100.5));
        System.out.println(tuesday.longestHeatWave(95.2));
    }
}