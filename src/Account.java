public class Account {

    private int balance;

    private final int withdrawLimit = 0;


    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getWithdrawLimit() {
        return withdrawLimit;
    }
}
