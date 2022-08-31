import java.util.Scanner;

public class DisplayMultiples {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number :  ");
        int num = sc.nextInt();

        for(int i = 12; i > 0; i--) {
            System.out.print(i +" " + num);
        }
    }
}
