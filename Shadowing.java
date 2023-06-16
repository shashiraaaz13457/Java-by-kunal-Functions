public class Shadowing {
    static  int x = 100; //we use static so that object is independent.
//    The variable with the higher level scope is hidden.(this will be shadowed at line 7)
    public static void main(String[] args) {
        System.out.println(x); //100
        int x = 40;
        System.out.println(x); //40
        //Lower level is overidding the upper level.
        fun();
    }

    static void fun () {
        System.out.println(x);
    }
}
