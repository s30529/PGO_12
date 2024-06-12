public interface AccountOperations {
    double checkBalance();
    void transfer(double amount, BankAccount toAccount) throws AccountOperationException;
    void deposit(double amount) throws AccountOperationException;
}
