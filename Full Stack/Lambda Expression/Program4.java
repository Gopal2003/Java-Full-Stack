public class Program4{

    @FunctionalInterface
    interface CheckEven{
        boolean isEven(int number);
    }

    public static void main(String[] args)
    {
        CheckEven obj = (num) -> (num % 2 == 0);

        System.out.println("10 is Even number: " + obj.isEven(10));
        System.out.println("11 is Even number: " + obj.isEven(11));
    }
}