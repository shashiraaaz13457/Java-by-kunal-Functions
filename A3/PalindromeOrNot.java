package A3;

import java.util.Scanner;

// Q. Write a function to find if a number is a palindrome or not. Take number as parameter.
public class PalindromeOrNot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = input.nextInt();
        PalindromeOrNot(number);

    }

    static void PalindromeOrNot (int number){
        int temp = number;
        int rem = 0;
        int sum = 0;
        while(number > 0){
            rem = number % 10;
            // keep this concept in mind.This logic is used to put it beside the value.
            // ones tens hundred concept.
            sum = (sum * 10)+ rem;
            number = number/10;
        }
        if (sum == temp) {
            System.out.println("Palindrome number");
        } else System.out.println("Not a Palindrome number");

    }
}
