public class Transaction {
    private double amount;
    private BankAccount fromAccount;
    private BankAccount toAccount;

    public Transaction(double amount, BankAccount fromAccount, BankAccount toAccount) {
        this.amount = amount;
        this.fromAccount = fromAccount;
        this.toAccount = toAccount;
    }

    public double getAmount() {
        return amount;
    }

    public BankAccount getFromAccount() {
        return fromAccount;
    }

    public BankAccount getToAccount() {
        return toAccount;
    }
}