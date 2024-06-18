import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Program7 {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
    
        //Stream<int[]> arrStream1 = Stream.of(arr);
        IntStream arrStream2 = Arrays.stream(arr);
    
        //Filter Even Elements
    
        List<Integer> result = arrStream2.filter(element -> element % 2 == 0).boxed().collect(Collectors.toList());
    
        /* 
    
        Filter : It i used to filter elements based on specified condition.
        boxed() : this is used to convert IntStream into Stream<Integer>
        Collect() : this is used to gather the result into a List.
    
        */
    
        //Printing All Elements.
    
        // result.stream().forEach(System.out::println);
    
        result.stream().forEach(System.out::println);
    }
    


}
