public class MixedArrays {
    public static void main(String[] args) {

        // every reference object is an Object; every class inherits from Object

        Object[] myArray = new Object[3];

        Account myAccount = new Account(); // an instance of the Account class
        myArray[0] = myAccount;

        String myString = "Hi";
        myArray[1] = myString;

        int myInt = 1;
        myArray[2] = myInt;
        // note that int is not an instance of Object, so Java automatically converts it to its
        // wrapper class, which is an instance of Object to be able to store in myArray
        Integer myInt2 = 1;
        System.out.println(myInt2.equals(myInt)); // compares the value
        System.out.println(myInt2 == myInt);
        // '==' to compare between a primitive int and a wrapper reference Integer will compare values

        for (Object object : myArray){
            System.out.println(object);
        }
    }
}
