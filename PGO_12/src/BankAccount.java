import java.util.ArrayList;
import java.util.List;

public class BankAccount implements AccountOperations {
    private double balance;
    private List<Transaction> transactions;

    public BankAccount() {
        this.balance = 0;
        this.transactions = new ArrayList<>();
    }

    @Override
    public double checkBalance() {
        return balance;
    }

    @Override
    public void transfer(double amount, BankAccount toAccount) throws AccountOperationException {
        if (amount <= 0) {
            throw new AccountOperationException("Suma musi byc wyzsza niz zero");
        }
        if (amount > balance) {
            throw new AccountOperationException("\n" + "Niewystarczające środki");
        }

        this.balance -= amount;
        toAccount.deposit(amount);
        Transaction transaction = new Transaction(amount, this, toAccount);
        this.transactions.add(transaction);
        toAccount.addTransaction(transaction);
    }

    @Override
    public void deposit(double amount) throws AccountOperationException {
        if (amount <= 0) {
            throw new AccountOperationException("Suma musi byc wyzsza niz zero");
        }

        this.balance += amount;
        Transaction transaction = new Transaction(amount, null, this);
        this.transactions.add(transaction);
    }

    public void addTransaction(Transaction transaction) {
        this.transactions.add(transaction);
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }
}