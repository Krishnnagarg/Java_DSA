//Function , Constructor Practice 

import java.util.Scanner;

public class mainn {

    public static void myMethod(String fname , int age ) {
        System.out.println(" Hello " + fname + " your age is : " + age);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        myMethod("Krishna", 21);
        myMethod("Rakhi", 21);

    }
}
