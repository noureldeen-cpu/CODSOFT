package ATM;

public class Account {
    private double balance;
    private long accountNum;

    public Account() {
        
    }

    public Account(double balance, long accountNum) {
        this.balance = balance;
        this.accountNum = accountNum;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public long getAccountNum() {
        return accountNum;
    }

    public void setAccountNum(long accountNum) {
        this.accountNum = accountNum;
    }

    public void withdraw(double amount) {
        this.balance -= amount;

        System.out.println("Collect your money.\n");
    }

    public void deposit(double amount) {
        balance += amount;

        System.out.println("Your money has been deposited successfully.\n");
    }

    public void checkBalance() {
        System.out.println("Your Balance: " + this.balance + " $ \n");
    }
}
