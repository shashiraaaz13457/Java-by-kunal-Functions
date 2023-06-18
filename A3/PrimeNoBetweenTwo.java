package A3;
// Q. Write a function that returns all prime numbers between two given numbers.

import java.util.Scanner;

public class PrimeNoBetweenTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int num1 = input.nextInt();

        System.out.println("Enter the second number:");
        int num2 = input.nextInt();

        for (int i = num1; i < num2 ; i++) {
            if (PrimeNo(i)){
                System.out.println(i);
            }
        }


    }

    static boolean PrimeNo(int n){
        if (n <= 1){
            return false;
        }
        int x = 2;
        while (x * x <= n ){
            if (n % x == 0){
                return false;
            }
            x++;
        }
//        System.out.println("Prime number");
        return true;
    }
}
