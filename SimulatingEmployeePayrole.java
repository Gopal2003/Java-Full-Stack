import java.util.*;

public class SimulatingEmployeePayrole {
    public static void main(String[] args) {

        float basicPay = 0.0f, HRA = 0.0f, DA = 0.0f,GrossPay = 0.0f;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please Enter the basicPay Amount: ");
        basicPay = scanner.nextFloat();

        if (basicPay >= 5000) {
            HRA = (basicPay / 12) * 100;
            DA = (basicPay / 14) * 100;
        } else if (basicPay < 5000) {

            HRA = (basicPay / 16) * 100;
            DA = (basicPay / 18) * 100;

        }

        GrossPay = basicPay + HRA + DA;

        System.out.println("The GrossPay Amount is: " + GrossPay);

    }
}
