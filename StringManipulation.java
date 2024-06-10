import java.util.*;

public class StringManipulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String scores = "English 64 Maths 86 Science 92";

        int Score = 0,meanScore = Integer.MIN_VALUE;

        String[] splitted = scores.split(" ");
        for(String str : splitted)
        {
            try{
                int num = Integer.parseInt(str);
                Score = Score + num;
            }
            catch(NumberFormatException ne)
            {

            }
        }

        meanScore = Score / 3;

        System.out.println("Total Score is: " + Score);
        System.out.println("Mean of the total score is: " + meanScore);
        
    }
}
