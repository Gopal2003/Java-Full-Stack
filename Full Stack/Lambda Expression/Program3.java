import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program3 {
    public static void main(String[] args) {
        List<String> products = new ArrayList<>();

        String[] prods = {"iPad","macbook","iwatch","airPods","iPhone"};

        //Adding Array into the List
        Collections.addAll(products,prods);
        
        //Using Lambda Expression to Iterate through a List using .forEach() Method
        products.forEach(items -> System.out.println("Products: " + items));

        //Normal Method
        for(String items : products)
        {
            System.out.println(items);
        }
     }
}
