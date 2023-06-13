import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Q. Take input of 2 numbers and print the sum.

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the numbers: ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();

        System.out.println("Sum is : " + (num1 +num2));
    }
}