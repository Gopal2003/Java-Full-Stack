public class Program1 {
    static int counter = 0; // These variables are shared variables. Effect using one object will also effect other objects.

    void increment()
    {
        counter++;
    }

    void display()
    {
        System.out.println(counter);
    }


    public static void main(String[] args)
    {
        Program1 p1 = new Program1();
        Program1 p2 = new Program1();

        // p1.increment();
        p2.increment();
        p1.display();
        // p2.display(); //! - Each Object will have its own set of properties. Hence, effect on properties of one object will not effect other.
    }
}
