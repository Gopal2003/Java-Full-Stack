import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Scanner;

public class AbsentActivity2Main {
    public static void main(String[] args) {
        List<AbsentActivity2> Sd = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        // Dummy Data.
        Sd.add(new AbsentActivity2(1, "1:56", 25.6));
        Sd.add(new AbsentActivity2(2, "2:56", 29.0));
        Sd.add(new AbsentActivity2(3, "3:56", 24.8));
        Sd.add(new AbsentActivity2(4, "4:56", 16.9));
        Sd.add(new AbsentActivity2(5, "5:56", 30.2));


        //Filtering Process.

        List<AbsentActivity2> sensoredData = Sd.stream()
        .filter(n -> n.getSensorID() == 2)
        .collect(Collectors.toList());

        sensoredData.forEach(System.out::println);

        double averageTemperature = sensoredData.stream()
        // .mapToDouble(AbsentActivity2::getTemperatureReading)
       . mapToDouble(data -> data.getTemperatureReading())
        .average()
        .orElse(0.0);
        
        System.out.println(averageTemperature);
    }
}
