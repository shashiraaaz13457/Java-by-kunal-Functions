package A3;

import java.util.Scanner;

// Q. Write a function that returns the sum of first n natural numbers.
public class SumNaturalNo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = input.nextInt();
        NaturalNo(num);

    }

    static void NaturalNo(int num){
        int x = 1;
        int sum = 0;
        while (x <= num){
            sum = sum + x;
            x++;
        }
        System.out.println(sum);
    }
}
