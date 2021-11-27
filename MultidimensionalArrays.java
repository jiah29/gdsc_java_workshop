import java.util.Arrays;

public class MultidimensionalArrays {
    public static void main(String[] args) {
        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7, 8} };
        int x = myNumbers[1][2];
        System.out.println(x); // Outputs 7

        //Array Copy
        int[][] lst_copy = myNumbers.clone(); //create a new list in another memory location
        int[][] lst_alias = myNumbers; //create an alias of the list

        lst_copy[1] = new int[]{7, 8, 9, 10};
        System.out.println(Arrays.toString(lst_copy[1]));
        System.out.println(Arrays.toString(myNumbers[1]));

        lst_copy[0][0] = 10;
        System.out.println(Arrays.toString(lst_copy[0]));
        System.out.println(Arrays.toString(myNumbers[0]));
        // .clone() only creates a copy of the outer list, the inner list is still an alias!
        // to clone a list without any aliasing, we would need to make a copies for every inner list!

        lst_alias[1] = new int[]{7, 8, 9, 10};
        System.out.println(Arrays.toString(lst_alias[1]));
        System.out.println(Arrays.toString(myNumbers[1])); //changing an alias also changes the original
    }
}
