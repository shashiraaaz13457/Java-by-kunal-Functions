public class Scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        String name = "kunal";

        System.out.println(a);
        System.out.println(b);

        //You can only access the num and marks inside the function scope only because of scoping.

//        System.out.println(num);
//        System.out.println(marks);

        //block scope
        //Values that are initailised in this block cannot be access outside the block.(c)

        {
            a = 78;  //already initailised outside the block of same method, hence you cannot initialise it again but you can change.
            int c = 99;
            name = "Shashi";
            System.out.println(name);
            System.out.println(a); //It also changing the original value.

            // Scoping in for loops
            for (int i = 0; i < 4 ; i++) {
                System.out.println(i);
            }
//            System.out.println(i); you cannot use it outside the scope.
        }
        System.out.println(a);
        System.out.println(name);

//        cannot be accesed outside.
//        System.out.println(c);

    }

    static void random (int marks){
        int num = 56;
        System.out.println(num);
        System.out.println(marks);
    }
}
