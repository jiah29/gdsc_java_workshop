public class Transaction {

    public static void main(String[] args) throws NoSuchMethodException {
        DepositOnlyAccount account1 = new DepositOnlyAccount(); //DepositOnlyAccount inherits Account
        Account account2 = new Account();

        Account[] accounts = {account1, account2}; // here I am upcasting DepositOnlyAccount to Account type)

        for (Account account : accounts) {
            if (account instanceof DepositOnlyAccount){
                ((DepositOnlyAccount) account).depositDouble(500); // here I am downcasting
            } else {
                account.deposit(500);
            }
        }

        System.out.println(account1.getTotal());
        System.out.println(account2.getTotal());

        account2.withdraw(100);
        account1.withdraw(100); // this throws an error, why is this a problem?
    }
}
