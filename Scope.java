public class Scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println(a);
        System.out.println(b);

        //You can only access the num and marks inside the function scope only because of scoping.

//        System.out.println(num);
//        System.out.println(marks);
        
    }

    static void random (int marks){
        int num = 56;
        System.out.println(num);
        System.out.println(marks);
    }
}
