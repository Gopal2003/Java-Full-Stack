public class AbsentActivity {
    int Age;
    String Name;
    Double Salary;
    public AbsentActivity(int age, String name, Double salary) {
        Age = age;
        Name = name;
        Salary = salary;
    }
    public int getAge() {
        return Age;
    }
    public void setAge(int age) {
        Age = age;
    }
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }
    public Double getSalary() {
        return Salary;
    }
    public void setSalary(Double salary) {
        Salary = salary;
    }
    @Override
    public String toString() {
        return "AbsentActivity [Age=" + Age + ", Name=" + Name + ", Salary=" + Salary + "]";
    }

    
    
}
