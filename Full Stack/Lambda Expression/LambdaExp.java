
@FunctionalInterface
interface  mySampleInterfase{
    void greet();
    
}
public class LambdaExp{
    public static void main(String[] args) {
        
        //!- Here is How we Write a Lambda Expression That gives Definition to
        //!- Greet Method.

        mySampleInterfase obj = () -> {
            System.out.println("Good Morning Engineers!");
        };

        //Calling the Greet Method Which Calls the Lambda Expression Indirectly.
        obj.greet();
    }
}