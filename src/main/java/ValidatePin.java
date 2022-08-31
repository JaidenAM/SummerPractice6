import java.util.Scanner;

public class ValidatePin {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int pin = 2190;

        int uPin;
        System.out.println("Enter pin code");
        uPin = sc.nextInt();
        while (uPin != pin){
            pin = uPin;
            System.out.println("Enter correct pin");
            uPin = sc.nextInt();
        }
        System.out.println("Correct pin entered you are in your account");
    }
}
