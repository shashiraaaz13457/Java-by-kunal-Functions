public class PassingExample {
    public static void main(String[] args) {
        String chamakchalo = "Sharukh khan";
        greet(chamakchalo);
    }

//    NO matter what you  are putting inside the argument. it will take the same.
    private static void greet(String naam) {

        System.out.println(naam);
    }
}
