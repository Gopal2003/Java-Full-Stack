import java.util.*;

public class Fibo{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of values you want in fibonacci series");
        int value = scanner.nextInt();
        int arr[] = new int[value];
        arr = getFibonacciSeries(arr, value);
        System.out.println(Arrays.toString(arr));

    }

    public static int[] getFibonacciSeries(int []arr,int count)
    {
        if(count > 0)
        {
            arr[0] = 0;
        }
        if(count > 1)
        {
            arr[1] = 1;
        }

        for(int i = 2; i < count; i++)
        {
            int n = arr[i - 1] + arr[i - 2];// n = n - 1 + n - 2 
            arr[i] = n;
        }

        return arr;
    }
}