package A3;

import java.util.Scanner;

//Q3. A person is eligible to vote if his/her age is greater than or equal to 18 .
    // Define a method to find out if he/she is eligible to vote.
public class EligibleForVote {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the age: ");
        int age = input.nextInt();
        boolean vote = isEligible(age);
        System.out.println(vote);

    }

    static boolean isEligible (int age){
        if (age >= 18){
            System.out.println("Eligible to vote");
            return true;
        }
        return false;
    }
}
