import java.util.*;

public class Mapp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String,Integer> studentGrades = new HashMap<>();

        //Adding Key/Values
        studentGrades.put("Manoj",85);
        studentGrades.put("Miki",73);
        studentGrades.put("Jacob",87);
        studentGrades.put("Sayan",95);

        //printing Student Grades
        // System.out.println(studentGrades);

        //using .romove() to Delete Element using KEY

        studentGrades.remove("Jacob");

        //Accessing Each Key/Value Pair Individually
        for(Map.Entry<String,Integer> pair : studentGrades.entrySet())
        {
            // System.out.printf("Student Name : %s , Student Grade : %s \n", pair.getKey(),pair.getValue());

        }

        //Alternative Method to access Key/Value Pair
        for(String key : studentGrades.keySet())
        {
            // System.out.println(key + " " + studentGrades.get(key));
        }
        
        //My Observations
        System.out.println(studentGrades.entrySet());
        System.out.println(studentGrades.keySet());
        
        for(String key : studentGrades.keySet())
        {
            System.out.println(key + " " + studentGrades.get(key));
        }

        for(Integer values: studentGrades.values())
        {
            System.out.println(values);
        }
    }
}
