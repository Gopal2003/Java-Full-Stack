// package Collections;
import java.util.*;
public class Sett {
    public static void main(String[] args)
    {
        //Declaring the Set
        Set<String> guestList = new HashSet<>();
        // Set<String> guestList = new LinkedHashSet<>(); // 

        //Adding the GuestList to the Set.
        guestList.add("Gopal");
        guestList.add("Ramesh");
        guestList.add("Suresh");

        //Adding Duplicate Elements
        guestList.add("Suresh");
        guestList.add("Ramesh");

        //Displaying the guestList.
        System.out.println("Guest List: " + guestList);
        
        //Removing a Guest From the Set.
        guestList.remove("Suresh");
        
        //Displaying the guestList.
        System.out.println("Guest List: " + guestList);


    }
}
