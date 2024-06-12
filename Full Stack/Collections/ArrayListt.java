import java.util.*;
public class ArrayListt{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> items = new ArrayList<>();

        System.out.println("Enter the List of Items: ");
        for(int i = 0; i < 6; i++)
        {
            String item = scanner.nextLine();

            if(!items.contains(item))
            {
                items.add(item);
            }
        }

        System.out.println("The list of unique elements: " + items);
    }
}