package A3;

import java.util.Scanner;
// Q. Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.
public class Maximum_Minimum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter the Second number: ");
        int num2 = input.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = input.nextInt();

        maximum(num1 , num2 , num3);
        minimum(num1 , num2 , num3);

    }

    static void maximum(int num1 , int num2, int num3 ){
        if (num1 > num2){
            if (num1 > num3){
                System.out.println("Maximum among these three numbers is: " + num1);
            }
        }
        else if (num2 > num3) {
            System.out.println("Maximum among these three numbers is: " + num2);
        } else {
            System.out.println("Maximum among these three numbers is: " + num3);
        }

    }

    static void minimum(int num1 , int num2, int num3 ){
        if (num1 > num2){
            if (num3 > num2){
                System.out.println("Minimum among these three numbers is: " + num2);
            }
        }
        else if (num1 > num3) {
            System.out.println("Minimum among these three numbers is: " + num3);
        } else {
            System.out.println("Minimum among these three numbers is: " + num1);
        }

    }


}
