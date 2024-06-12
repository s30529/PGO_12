public class Client extends User {
    private static int idCounter = 1;
    private int clientId;
    private BankAccount account;

    public Client(String firstName, String lastName) {
        super(firstName, lastName);
        this.clientId = idCounter++;
        this.account = new BankAccount();
    }

    public int getClientId() {
        return clientId;
    }

    public BankAccount getAccount() {
        return account;
    }
}
