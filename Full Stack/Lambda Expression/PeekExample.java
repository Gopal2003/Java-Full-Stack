import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PeekExample {
    public static void main(String[] args) {
        //Sample List of Integer
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8);

        //Processing the list with peek.

        List<Integer> processNumbers = numbers.stream()
        .peek(n -> System.out.println("Original " + n)) // Main purpose : Used for Debugging.
        .filter((n -> n % 2 == 0))
        .peek(n -> System.out.println("After Filter " + n))
        .map(n -> n * 2)
        .peek(n -> System.out.println("After map " + n))
        .collect(Collectors.toList());

        System.out.println(processNumbers);
    }
}
