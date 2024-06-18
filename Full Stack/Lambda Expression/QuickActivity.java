public class QuickActivity {
    
    @FunctionalInterface
    interface Average
    {
        int getAverage(int num1,int num2);
    }

    public static void main(String[] args) {
        Average obj = (num1,num2) -> ((num1+num2)/2);
            
        System.out.println("Average: " + obj.getAverage(51, 5));
    }
}
