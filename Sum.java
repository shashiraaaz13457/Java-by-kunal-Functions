import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
//        sum();//calling a funtion.
//        sum();
//        sum();
//        sum();
//        sum();
//          int ans = sum2();
//        System.out.println(ans);
        System.out.println(sum2());
    }
    //return the value
    static int sum2 (){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the numbers: ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();

        return(num1 +num2);
    }

    static void sum (){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the numbers: ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();

        System.out.println("Sum is : " + (num1 +num2));
    }

    /*
    access modifier return_type name (arguments) {
        //body
        return statement;
    }
     */
}
