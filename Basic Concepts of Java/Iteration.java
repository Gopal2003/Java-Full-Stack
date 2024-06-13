public class Iteration {
    public static void main(String[] args) {

        //Declaraing Necessary Data Structure.
        int arr[][] = new int[][]{
            {5,6,7},
            {8,9,10},
            {13,14,15}
        };

        //Initializing the value that I need to find.
        int find = 91;

        //Using for-Each loop to iterate through the array and returning true if the "find" is present in 2D-array.
        for(int[] ar : arr)
        {
            for(int val : ar)
            {
                if(val == find)
                {
                    System.out.println("True");
                    return;
                }
            }
        }

        System.out.println("False");

    }
}
