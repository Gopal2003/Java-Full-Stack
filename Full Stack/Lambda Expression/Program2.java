public class Program2 {
    
    // @FunctionalInterface
    interface Physics{
        double getFoce(double mass,double acc);
        static void getMass(int mass)
        {
            System.out.println("HEHEHE");
        }
    }

    public static void main(String[] args)
    {
        Physics obj = (m,a) -> (m * a);
        System.out.println(obj.getFoce(19000, 9.8));
        Physics.getMass(1);

    }
}
