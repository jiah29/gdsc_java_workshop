public class PrimitiveAndReference {
    public static void main(String[] args) {
        int i = 20;
        int j = 20;
        System.out.println(i == j); //compare the values

        String x = new String("Hello"); // create a new memory address to store the string “Hello”
        String y = new String("Hello"); // create another new memory address to store the string “Hello”

        String z = x;

        System.out.println(x == y); // this compares the address in memory space, so what should this print?
        System.out.println(x.equals(y)); // this compares the value, so what should this print?

        System.out.println(x == z); // what about this?
        System.out.println(x.equals(z));

        // To make this more interesting...
        String a = "Hi";
        String b = "Hi";
        System.out.println(a == b); // what will this return?
        System.out.println(a.equals(b));

    }
}
