class Student {
    int score = 0;

    @Override
    public String toString()
    {
        return "Student [score : " + score + "]";
    }
}

public class ObjectClarification {
    public static void main(String[] args) {
        Student ravi = new Student();
        Student gopal = new Student();
        Student agarwal = new Student();

        ravi.score = 10;
        gopal.score = 20;

        agarwal.score = ravi.score + gopal.score;

        System.out.println(ravi); // by default it calls the toString() method which prints the memory address of object if not override.
        System.out.println(gopal);
        System.out.println(agarwal);
    }
}
