public class Account {

    public static String bank = "United Bank"; // this is a static variable, so it belongs to the class
    private int total = 5000;

    public void deposit(int amount){
        total = total + amount;
    }

    public void withdraw(int amount) throws NoSuchMethodException {
        total = total - amount;
        System.out.println(String.format("Successfully withdrawn %s", amount));
    }

    public int getTotal() {
        return total;
    }
    protected void setTotal(int total) {this.total = total;}

    public void printAccountInfo(){
        System.out.println("This withdrawable account is created in United Bank.");
    }

}
