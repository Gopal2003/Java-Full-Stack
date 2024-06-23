import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.List;

public class AbsentActivityMain {
    public static void main(String[] args) {
        ArrayList<AbsentActivity> aL = new ArrayList<>();
       aL.add(new AbsentActivity(22, "Jason", 5000.0));
       aL.add(new AbsentActivity(25, "Apple", 5000.0));
       aL.add(new AbsentActivity(29, "Ball", 5000.0));
       aL.add(new AbsentActivity(30, "Cat", 5000.0));
       aL.add(new AbsentActivity(32, "Dog", 5000.0));
       aL.add(new AbsentActivity(22, "Elephant", 5000.0));
       aL.add(new AbsentActivity(42, "Zebra", 5000.0));
       aL.add(new AbsentActivity(22, "Tiger", 5000.0));
       aL.add(new AbsentActivity(52, "Lion", 5000.0));
       aL.add(new AbsentActivity(22, "Mango", 5000.0));

       List<AbsentActivity> processedEmployee = aL.stream()
       .filter(emp -> emp.getAge() >= 30) // Here we Filtered Employees Based on their Age >= 30
       .peek(n -> System.out.println("Value 1:  " + n))
       .peek(emp -> emp.setSalary(emp.getSalary() + emp.getSalary() * 1/10)) // Increase Salary by 10%
       .peek(n -> System.out.println("Value 2: " + n))
       .sorted((e1,e2) -> e1.getName().compareTo(e2.getName())) // Sorting Employees by their Name.
       .peek(n -> System.out.println("Value 3: " + n))
       .collect(Collectors.toList());

       processedEmployee.forEach(System.out::println);
    }
}
