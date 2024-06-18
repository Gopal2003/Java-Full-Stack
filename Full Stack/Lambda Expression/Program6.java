import java.util.stream.Stream;

public class Program6{
    public static void main(String[] args) {
        
        //Lab 1: This Program Explains how to createa Stream from an Array.
        String[] arr = {"red","green","blue","orange","purple"};
        Stream<String> arrStream = Stream.of(arr);

        //Printing All Elements
        arrStream.forEach(System.out::println);

        // Lab 2 : Creating a Stream using Stream.generate() Method

        Stream<String> mystream = Stream.generate(() -> "Hooray").limit(5);

        //Printing All ELements
        mystream.forEach(System.out::println);
     }
}