public class BasicCommands {
    public static void main(String[] args) {
        System.out.print("Hello World"); //print does not add a new line
        System.out.println("Hello World"); //println does add a new line
        System.out.println(2 == 3); //equality
        System.out.println(2 + 3); //operator example, also works with -, *, /
        System.out.println(2 % 3); //another operation
        System.out.println(2 != 3); //inequality
        System.out.println(2 < 3); // comparison
        System.out.println(2 < 3 && 3 < 2); //and (conditional comparison) (similar to Python and)
        System.out.println(2 < 3 || 3 < 2); //or (conditional comparison)
        System.out.println("Hi" instanceof String); //type comparison
    }
}
