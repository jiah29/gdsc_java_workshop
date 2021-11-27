public class Method {
    public static void main(String[] args) {
        printEmoji("HappySad");
        System.out.println(returnName());
        System.out.println(returnName("Victoria")); //overloaded method

        // I want to use returnAge() here, but it is not static!
        // need to instantiate a new Method() object:
        Method methodObject = new Method();
        System.out.println(methodObject.returnAge());
    }

    // private static method that returns nothing
    private static void printEmoji(String expression){
        switch(expression){
            case "Happy":
                System.out.println(Character.toChars(0x1F601));
                break;
            case "Sad":
                System.out.println(Character.toChars(0x1F622));
                break;
            case "HappySad":
                System.out.println(Character.toChars(0x1F602));
                break;
            case "Funny":
                System.out.println(Character.toChars(0x1F61C));
                break;
            case "Angry":
                System.out.println(Character.toChars(0x1F621));
                break;
        }
    }

    // public static method that returns String
    public static String returnName(){
        return "My name is Greg";
    }

    //overloading method
    public static String returnName(String name){
        return String.format("My name is %s", name);
    }

    // private non-static method that returns int
    private int returnAge(){
        return 35;
    }
}
