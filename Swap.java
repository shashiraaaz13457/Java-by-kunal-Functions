public class Swap {
//    Swapping question different methods.
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

//     swap numbers code
//        int temp = a;
//        a = b;
//        b = temp;
        swap(a,b);
//        System.out.println(a + " " + b);

        String name = "Shashi Raj";
        changeName(name);
        System.out.println(name);
    }

//    no change in name still showing shashi Raj.
//    pass by value in java no pass by reference in java.
//    Strings are immutable (cannot be changed.)
    static void changeName(String naam) {
        naam = "Rahul Raj";  //here you are not changing the value you are creating a new object.
//        System.out.println(naam);
    }

    static void swap (int a, int b ){
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a + " " + b);
    }
}
