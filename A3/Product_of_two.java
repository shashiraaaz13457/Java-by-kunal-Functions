package A3;

import java.util.Scanner;

public class Product_of_two {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter the Second number: ");
        int num2 = input.nextInt();
        int multiply = Product(num1,num2);
        System.out.println(multiply);
    }

    static int Product(int num1, int num2) {
        return num1 * num2 ;
    }
}
