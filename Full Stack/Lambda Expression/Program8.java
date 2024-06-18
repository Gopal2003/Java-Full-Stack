import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Program8 {
    public static void main(String[] args) {
        //This program Explains usage of Map MEthod to compute a Given Collection of Objects.

        ArrayList<Integer> numbers = new ArrayList<>();
        
        int [] arr = {1,2,3,4,5,6,7,8,9};

        IntStream streamArr = Arrays.stream(arr);
        
        //using map to compute square of Each eLement.

        List<Integer> result = streamArr.map(N -> N * N).boxed().collect(Collectors.toList());
        result.forEach(System.out::println);
    }
}
