import java.util.*;
public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a Number to Find Whether it is Even of Odd");
        int value = scanner.nextInt();

        if(value % 2 == 0)
        {
            System.out.println("The Entered Number is a Even Number");
        }
        else
        {
            System.out.println("The Entered Number is a Odd Number");
        }
    }
}
