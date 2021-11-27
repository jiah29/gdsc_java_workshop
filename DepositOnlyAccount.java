public class DepositOnlyAccount extends Account{

    //overwrite methos from parent class
    public void withdraw(int amount) throws NoSuchMethodException {
        throw new NoSuchMethodException("Cannot withdraw from this account!");
    }

    // new methods defined for child class
    public void depositDouble(int amount){
        int current = getTotal();
        setTotal(current + (2 * amount));
    }

    // methods are that are not overriden have the same implementation as the parent class

    // the method below demonstrated polymorphism, because the printAccountInfo in the parent class has slightly
    // different implementation
    public void printAccountInfo(){
        System.out.println("This non-withdrawable account is created in United Bank."); //polymorphism
    }
}
