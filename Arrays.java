import java.util.Objects;

public class Arrays {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3}; //with initialiser
        System.out.println(numbers.length); //accessing length of array

        String[] words = new String[3]; //without initialiser
        words[0] = "Hi"; // changing index element
        words[1] = "Hello";
        words[2] = "Hola";

        for (int i = 0; i < words.length; i++){ // looping through the array
            System.out.println(words[i]); //accessing by index
        }

        for (String word : words) { // a much easier way to write the loop
            System.out.println(word); //accessing by index
        }

        // handling exception
        try{ // try this code...
            words[3] = "Bonjour"; // what will this do?
        } catch(IndexOutOfBoundsException e){ // what happens if IndexOutOfBOundsException is caught
            System.out.print("IndexOutofBoundsException is caught!");
            System.out.print("The array only holds 3 elements!");
        } finally{ // this part will always run
            words[0] = "Bonjour";
            assert System.out != null;
            System.out.println("\n" + words[0]);
        }
        // Note: We don't really need to handle this exception in an actual program, because we always know that this
        // will always lead to IndexOutOfBoundsException, so we just need to avoid writing this code...

    }
}
