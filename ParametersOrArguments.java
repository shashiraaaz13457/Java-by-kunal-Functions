import java.util.Scanner;

public class ParametersOrArguments {
//    Acha tareeka h(hm hm good).
    public static void main(String[] args) {

//        Input method

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int f = in.nextInt();
        int g = in.nextInt();
        int ans = sum(f,g);
        System.out.println(ans);
//        a->f
//        b->g
//        name doesn't need to be same.

//        normal method
//        int ans = sum(30,40);
//        System.out.println(ans);
    }

    static int sum (int a ,int b){
//        int sum = a + b;
//        return sum;
        return a + b;
    }
}
