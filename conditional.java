
import java.util.Scanner;

public class conditional {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter Number : ");
        // int num = sc.nextInt();
        // if (num % 2 == 0) {
        //     System.out.println("Your Number is Even ");
        // } else {
        //     System.out.println("Your Number is Odd");
        // }
        //--->
        // System.out.println("Enter Your Income : ");
        // int inc = sc.nextInt();
        // int tax;
        // if (inc < 500000) {
        //     System.out.println("No Tax");
        // } else if (inc > 500000 && inc <= 1000000) {
        //     tax = (int) (inc * 0.2);
        //     System.out.println("Pay Tax :- " + tax);
        // } else {
        //     tax = (int) (inc * 0.3);
        //     System.out.println("Pay Tax :- " + tax);
        // }
        //loops------>

        // System.out.print("Enter n : ");
        // int n = sc.nextInt();
        // while (n > 0 ) {
        //     int lastDigit = n % 10 ;
        //     System.out.print(lastDigit + "  ");
        //     n /= 10 ;
        // }
//---->
        // System.out.print("Enter n : ");
        // int n = sc.nextInt();
        // int rev = 0;
        // while (n > 0) {
        //     int lastDigit = n % 10;
        //     rev = (rev * 10) + lastDigit;
        //     n /= 10;
        // }
        // System.out.println(rev);
        //---->
        // do {
        //     System.out.println("Enter n : ");
        //     int n = sc.nextInt();
        //     if (n % 10 == 0) {
        //         continue;
        //     }
        //     System.out.println(n);
        // } while (true);
        //---->
        // System.out.print("Enter n: ");
        // int n = sc.nextInt();

        // if (n <= 1) {
        //     System.out.println("Not Prime!");
        // } else if (n == 2) {
        //     System.out.println("Prime!");
        // } else {
        //     boolean isPrime = true;
        //     for (int i = 2; i <= Math.sqrt(n); i++) {
        //         if (n % i == 0) {
        //             isPrime = false;
        //             break;
        //         }
        //     }
        //     if (isPrime == true) {
        //         System.out.println("Prime!");
        //     } else {
        //         System.out.println("Not Prime!");
        //     }
        // }

        //---->

        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int fact = 1;
        for (int i=1;i<=n;i++) {
            fact *= i;
        }
        System.out.println(fact);

    }
}
