import java.util.Scanner;
public class Revision {
    public static void main(String[] args) {
//        int ans = sum2();
//        System.out.println(ans);
//        sum();
//        int ans = sum3(20,30);
//        System.out.println(ans);
//        String personalised = myGreet("Kunal kushwaha");
//        System.out.println(personalised);
        int a=10;
        int b=20;
        swap(a,b);
        System.out.println(a+" "+b);
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
