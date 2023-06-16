public class Overloading {
    // Function Overloading
//    Function overloading at compile time decides which function to run.
    // Function Overridding at run time decides which function to run.(oops)
    public static void main(String[] args) {
        fun(67);
        fun("Shashi Raj");
        int ans = sum(3,4,5);
        System.out.println(ans);
    }
    static void fun(int a){
        System.out.println(a);
    }

    static void fun(String name){
        System.out.println(name);
    }

    static int sum (int a , int b, int c){
        return a+b+c;
    }
}
