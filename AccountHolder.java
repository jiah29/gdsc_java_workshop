public class AccountHolder {

    //below are class attributes
    private String name;
    private Account account;

    public AccountHolder(String name, Account account){ // this is a constructor
        this.name = name;
        this.account = account;
    }

    public String getBankName(){
        return Account.bank;  // bank is a static attribute, so can be accessed via the class directly
    }

    public int getAccountTotal(){
        return account.getTotal();
        // total is private non-static attribute, so cannot be accessed directly via the class, so needs to use a getter
    }
}
