package A3;

import java.util.Scanner;

// Q. Write a program to print the factorial of a number by defining a method named 'Factorial'.
public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        Factorial(num);
    }

    static void Factorial (int num){
        if (num < 0){
            System.out.println("Invalid number");
//            return;
        }
        int value = 1;
        int x = 1;
        while(x <= num){
            value = value * x;
            x++;

        }
//        for (int i = 1; i <= num ; i++) {
//            value = value * i;
//        }
        System.out.println(value);
        //It is giving 1 even if you enter num 0 , Because you have already given the value = 1;
    }
}
