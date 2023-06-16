import java.util.Scanner;
//See it one more time.
public class ArmstrongNo_Function {
    public static void main(String[] args) {
        //Print all 3 digits armstrong number.
//        Scanner input = new Scanner(System.in);
//        int n = input.nextInt();
//        System.out.println(isArmstrong(n));

// ALl 3 digit armstrong number.
        for (int i = 100; i < 1000 ; i++) {
            if (isArmstrong(i)){
                System.out.println(i);
            }
        }
    }

    static boolean isArmstrong (int n) {
        int temp = n;
        int rem = 0;
        int sum = 0;
        int cube = 0;
        while (n > 0){
            rem = n % 10;
            cube = (rem * rem * rem);
            sum = cube + sum;
            n = n/10;
        }
//        if (sum == temp){
//            return true;
//        } else {
//            return false;
//        }
        return sum == temp;
    }
}
