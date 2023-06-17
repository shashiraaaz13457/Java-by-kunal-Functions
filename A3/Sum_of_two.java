package A3;

import java.util.Scanner;

public class Sum_of_two {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter the Second number: ");
        int num2 = input.nextInt();
        int add = sum(num1,num2);
        System.out.println(add);
    }

    static int sum(int num1, int num2) {
        return num1 + num2 ;
    }
}
