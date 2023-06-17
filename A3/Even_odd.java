package A3;

import java.util.Scanner;

// Q2. Define a program to find out whether a given number is even or odd.
public class Even_odd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        EvenOdd(num);

    }

    static void EvenOdd (int num){
        if (num % 2 == 0){
            System.out.println(num + " is even");
        } else {
            System.out.println(num + " is odd");
        }
    }
}
