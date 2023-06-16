import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(2,3,45,56,87,8,89);
        //You can take any number of arguments.
        multiple(2,3,"Shashi","Kunal","Misha","Suman");
    }

    // You use int ...v) when you don't know how many values you are passing. v is the name you can use anything.
    static void fun (int ...v){
//internally (int ...v) it is taken as array of integers.
        System.out.println(Arrays.toString(v));
    }

    static void multiple(int a, int b, String ...v){
        System.out.println(Arrays.toString(v));
//        System.out.println(Arrays.toString(v));
//        System.out.println(a);
//        System.out.println(b);
    }
}
