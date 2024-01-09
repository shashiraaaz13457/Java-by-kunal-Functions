import java.util.Arrays;
import java.util.Scanner;
public class Revision {
    static int x = 50;  //This will be shadowed at line
    public static void main(String[] args) {
//        int ans = sum2();
//        System.out.println(ans);
//        sum();
//        int ans = sum3(20,30);
//        System.out.println(ans);
//        String personalised = myGreet("Kunal kushwaha");
//        System.out.println(personalised);
//        int a=10;
//        int b=20;
//        swap(a,b);
//        System.out.println(a+" "+b);

        //    Shadowing..
//        System.out.println(x); // 50
//        int x = 40;
//        System.out.println(x); //40

        //Variable length arguments
//        fun(2,3,4,5,6,7,8,9,10); //You can take as many arguments as you want and it stored it in the form of Array.
//        multipleargs(2,3,"Kunal","Shashi");

        //Prime number

//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        boolean ans = isPrime(n);
//        System.out.println(ans);


        //Print all the three armstrong numbers.
        Scanner input = new Scanner(System.in);
//        int n = input.nextInt();
        for (int i = 100; i < 1000; i++) {
            if (ArmstrongNo(i)){
                System.out.print(i + " ");
            }
        }

    }

    static boolean ArmstrongNo(int n){
        int original = n;
        int rem = 0;
        int sum = 0;
        while(n>0){
            rem = n%10;
            sum = (rem*rem*rem)+sum;
            n = n/10;

        }
        return sum == original;

    }

    static boolean isPrime(int n){
        if (n <= 1){
            return false;
        }
        int c = 2;
        while (c*c <= n){
            if (n%c == 0){
                return false;
            }
            c++;
        }
        if (c*c > n){
            return true;
        } else {
            return false;
        }

    }

    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
    static void multipleargs(int a,int b,String ...v){

    }

    static void swap(int a, int b){

        //swap code
        int temp = a;
        a = b ;
        b = temp;
        System.out.println(a+" "+b);

    }

    static String myGreet(String name){
        String message = "Hello "+ name;
        return message;
    }

//    pass the value of numbers when you are calling the method in main()
    static int sum3(int a,int b){
        int sum = a + b;
        return sum;
    }
    //return the value
    static int sum2(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int num1 = in.nextInt();
        System.out.println("Enter number 2: ");
        int num2 = in.nextInt();
        int sum = num1+num2;
        return sum;
    }

    static void sum(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int num1 = in.nextInt();
        System.out.println("Enter number 1: ");
        int num2 = in.nextInt();
        int sum = num1+num2;
        System.out.println("Sum is : " + sum);
    }


}
