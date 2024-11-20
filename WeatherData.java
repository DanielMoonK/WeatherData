import java.util.ArrayList;

public class WeatherData{
    private ArrayList<Double> temperatures;

    public WeatherData(ArrayList<Double> temps){
        temperatures = temps;
    }

    public String toString(){
        String tempList = "";
        for(int i=0; i<temperatures.size(); i++){
            tempList += temperatures.get(i) + " ";
        }
        return tempList;
    }

    public void cleanData(double lower, double upper){
        ArrayList<Double> newTemps = new ArrayList<>();
        for(int i=0; i<temperatures.size(); i++){
            if(temperatures.get(i) >= lower && temperatures.get(i) <= upper) newTemps.add(temperatures.get(i));
        }
        temperatures = newTemps;
    }

    public int longestHeatWave(double threshold){
        int longestLength = 0;
        int newLength = 0;
        for(int i=0; i<temperatures.size(); i++){
            if(temperatures.get(i)>threshold){
                newLength++;
                if(temperatures.size() != i){
                    if(temperatures.get(i+1) <= threshold && longestLength < newLength){
                        longestLength = newLength;
                        newLength = 0;
                    }
                }
                else{
                    if(longestLength < newLength) longestLength = newLength;
                }
            }
        }
        return longestLength;
    }
}