import java.util.*;
public class CountEvenOdd {
    public static void main(String[] args)
    {
        int arr[] = new int[]{1,2,3,4,5,6};
        int ecount = 0,oCount = 0;
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] % 2 == 0)
            {
                ecount ++;
            }
            else
            {
                oCount++;
            }
        }

        System.out.println(ecount);
        System.out.println(oCount);
    }
}
