public class GCD {
    public static void main(String[] args) {
        int x = 12,y = 6;

        while(x != y)
        {
            if(x >y)
            {
                x = x-y;
            }
            else
            {
                y = y - x;
            }
        }

        System.out.println("GCD of 12 and 6 is : " + x);
    }
}
