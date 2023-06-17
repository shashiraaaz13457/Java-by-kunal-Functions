package A3;

import java.util.Scanner;

// Q. Define a method to find out if a number is prime or not.
public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        isPrime(num);

    }
// make sure you add return so that it doesn't print it again and again.
    static void isPrime (int num){
        if(num <= 1){
            System.out.println("Error!! Not a prime number");
        }
        int i = 2;
        while (i * i < num){
            if (num % i == 0){
                System.out.println("Not a prime number");
                return;
            }
            i++;
        }
        System.out.println("It is a prime number");
    }
}
