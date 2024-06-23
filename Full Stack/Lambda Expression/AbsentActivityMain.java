import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.List;

public class AbsentActivityMain {
    public static void main(String[] args) {
        ArrayList<AbsentActivity> aL = new ArrayList<>();
       aL.add(new AbsentActivity(22, "Jason", 5000.0));
       aL.add(new AbsentActivity(25, "Jason", 5000.0));
       aL.add(new AbsentActivity(29, "Jason", 5000.0));
       aL.add(new AbsentActivity(30, "Jason", 5000.0));
       aL.add(new AbsentActivity(32, "Jason", 5000.0));
       aL.add(new AbsentActivity(22, "Jason", 5000.0));
       aL.add(new AbsentActivity(42, "Jason", 5000.0));
       aL.add(new AbsentActivity(22, "Jason", 5000.0));
       aL.add(new AbsentActivity(52, "Jason", 5000.0));
       aL.add(new AbsentActivity(22, "Jason", 5000.0));

       List<AbsentActivity> processedEmployee = aL.stream()
       .filter(emp -> emp.getAge() >= 30) // Here we Filtered Employees Based on their Age >= 30
       .peek(emp -> emp.setSalary(emp.getSalary() + emp.getSalary() * 1/10)) // Increase Salary by 10%
       .sorted((e1,e2) -> e1.getName().compareTo(e2.getName())) // Sorting Employees by their Name.
       .collect(Collectors.toList());

       processedEmployee.forEach(System.out::println);
    }
}
