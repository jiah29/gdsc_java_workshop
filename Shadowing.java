public class Shadowing {
    private int attribute = 5;

    public static void main(String[] args) {
        Shadowing demo = new Shadowing();
        demo.shadow();
    }

    public void shadow(){
        int attribute = 10;
        System.out.println(this.attribute);
        System.out.println(attribute);
    }
}
