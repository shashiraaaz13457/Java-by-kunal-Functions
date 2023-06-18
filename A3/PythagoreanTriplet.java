package A3;

import java.util.Scanner;

// Q. Write a function to check if a given triplet is a Pythagorean triplet or not. (A Pythagorean triplet is when the sum of the square of two numbers is equal to the square of the third number).
public class PythagoreanTriplet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int num1 = input.nextInt();

        System.out.println("Enter the second number: ");
        int num2 = input.nextInt();

        System.out.println("Enter the third number: ");
        int num3 = input.nextInt();

        PythagoreanTriplet(num1,num2,num3);


    }

    static void PythagoreanTriplet (int num1 , int num2 , int num3){
        int num1sq = num1 * num1;
        int num2sq = num2 * num2;
        int num3sq = num3 * num3;
        int sumsq12 = num1sq + num2sq;

        if(sumsq12 == num3sq){
            System.out.println("Pythogorean Triplet");
        }else System.out.println("Not a Pythorean Triplet");
    }

}
