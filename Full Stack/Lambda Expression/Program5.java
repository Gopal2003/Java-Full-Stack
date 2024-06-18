import java.util.*;
import java.util.stream.Stream;

public class Program5 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("One","Two","Three","Four");

        //Convert the List Into a Stream.

        Stream<String> myStream = list.stream();

        //for eg. printing all elements
        for(String item : list)
        {
            //This is regular method of printing or Accessing Element.
        }

        //using stream
        myStream.forEach(System.out::println);
    }
}
