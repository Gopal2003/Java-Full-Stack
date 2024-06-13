import java.util.*;
public class Question1{
    //Initializing the Necessary Properties of the class.
    static ArrayList<Integer> aL = new ArrayList<>();


    int Average()
    {
        int average = 0;
        int length = aL.size();

        for(int i = 0; i < length; i++)
        {
            average = average + aL.get(i);
        }

        average = average / length;
        return average;
    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int grade = 0,count = 0; // count to make sure that user doesn't exceed the mentioned size which is 20.

        System.out.println("Enter Integer grades. Enter -1 to stop the loop");
        grade = scanner.nextInt();
        while(grade != -1 && count < 20)
        {
            aL.add(grade);
            grade = scanner.nextInt();
            count++;
        }


        Question1 q1 = new Question1();

        System.out.println("The Average of all the Enteerd grade is: " + q1.Average());

    }
}