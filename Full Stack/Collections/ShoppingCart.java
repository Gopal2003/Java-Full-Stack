import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
    
    
    Map<String,Integer> cart = new HashMap<>();
    Map<String,Integer> stock = new HashMap<>();
    Map<String,Double> price = new HashMap<>();

    void addStock()
    {
        stock.put("orange",42);
        stock.put("apple",0);
        stock.put("guava",64);
        stock.put("peach",55);
    }

    void addPrice()
    {
        price.put("orange",4.0);
        price.put("apple",2.0);
        price.put("guava",1.5);
        price.put("peach",2.0);
    }

    void addItemnsInCart(int orangeCount,int appleCount,int guavaCount,int peachCount)
    {
        cart.put("orange",orangeCount);
        cart.put("apple",appleCount);
        cart.put("guava",guavaCount);
        cart.put("peach",peachCount);
    }

    double totalBill()
    {
        double sum = 0;
        for(String name : cart.keySet())
        {
            if(cart.get(name) > 0)
            {
                sum = sum + cart.get(name) * price.get(name);
                stock.put(name,stock.get(name) - 1);
            }
        }

        return sum;
    }
    
    public static void main(String[] args) {
        
        ShoppingCart C1 = new ShoppingCart();

        C1.addStock();
        C1.addPrice();


        for(String name : C1.stock.keySet())
        {
            if(C1.stock.get(name) == 0)
            {
                System.out.println(name + " is out of Stock!");
            }
        }

        C1.addItemnsInCart(11, 0, 12, 1);

        System.out.println("Total Bill " + C1.totalBill());


    }
}
