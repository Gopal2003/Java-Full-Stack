import java.util.*;
public class PoundToKg{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float Pound = 0.0f;
        float KiloGram = 0.0f;

        System.out.println("Enter the Weight of Pound: ");
        Pound = scanner.nextFloat();
        KiloGram = Pound * 0.453592f;

        System.out.println("The Weight in KG is: " + KiloGram);
    }
}