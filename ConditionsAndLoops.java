public class ConditionsAndLoops {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) { // a simple for loop
            System.out.println(i);
        }

        int[] numbers = {1, 2, 3};

        for (int number : numbers){ // for-each loop
            System.out.println(number);
        }

        int i = 0; // while loop
        while (i < 5) {
            System.out.println(i);
            i++; // i = i + 1
        }

        int time = 22; // conditional statements
        if (time < 10) {
            System.out.println("Good morning.");
        } else if (time < 20) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");
        }

        String expression = "HappySad";
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
}
