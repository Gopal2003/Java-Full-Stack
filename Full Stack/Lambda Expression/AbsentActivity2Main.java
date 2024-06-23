import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AbsentActivity2Main {
    public static void main(String[] args) {
        List<AbsentActivity2> Sd = new ArrayList<>();

        // Dummy Data.
        Sd.add(new AbsentActivity2(1, "1:56", 0.00));
        Sd.add(new AbsentActivity2(2, "2:56", 0.00));
        Sd.add(new AbsentActivity2(3, "3:56", 0.00));
        Sd.add(new AbsentActivity2(4, "4:56", 0.00));
        Sd.add(new AbsentActivity2(5, "5:56", 0.00));


        //Filtering Process.

        // List<AbsentActivity2> sensoredData = Sd.stream();
        // .peek(n -> System.out.println(n))
        

    }
}
