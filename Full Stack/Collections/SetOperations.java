import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class SetOperations {
    
    //Implement the Intersection Operation.
    public static Set<String> intersection(Set<String> set1,Set<String> set2)
    {
        Set<String> intersectionSet = new HashSet<>(set1);

        //retailAll: deletes all uncommon members and keeps common members only.
        intersectionSet.retainAll(set2);
        return intersectionSet;
    }

    //Implementing the Union Operation
    public static Set<String> union(Set<String> set1,Set<String> set2)
    {
        Set<String> unionset = new HashSet<>(set1);

        //addAll : Combines all the values from both the sets.
        unionset.addAll(set2);
        return unionset;
    }

    //Implementing the Union Operation
    public static Set<String> diff(Set<String> set1,Set<String> set2)
    {
        Set<String> diffset = new HashSet<>(set1);

        //addAll : Combines all the values from both the sets.
        diffset.removeAll(set2);
        return diffset;
    }

    

    public static void main(String[] args) {
        
        //Let Us define some Sets Here

        Set<String> marketingTeam = new HashSet<>();
        Set<String> salesTeam = new HashSet<>();

        //let us add members in both Teams

        String[] marketingEmployees = {"armanta","windy","nicklaus","merry","sanya","zhining"};
        String[] salesEmployees     = {"sanya", "manoj", "miki", "armanta", "sonya", "parker"};
        
        //Collection.addAll() - Adds Arrays into Specified collection. Here, its Sets.

        Collections.addAll(marketingTeam,marketingEmployees);
        Collections.addAll(salesTeam,salesEmployees);

        System.out.println(marketingTeam);
        System.out.println(salesTeam);

        Set<String> intersectionResult = intersection(marketingTeam,salesTeam);
        System.out.print("The Intersection of Employees: ");
        System.out.println(intersectionResult);

        Set<String> unionResult = union(marketingTeam,salesTeam);
        System.out.print("The Union of Employees: ");
        System.out.println(unionResult);
        
        Set<String> diffResult = union(marketingTeam,salesTeam);
        System.out.print("The Difference of Employees: ");
        System.out.println(diffResult);
    }
}
