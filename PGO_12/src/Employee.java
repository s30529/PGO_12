public class Employee extends User {
    private static int idCounter = 1;
    private int employeeId;

    public Employee(String firstName, String lastName) {
        super(firstName, lastName);
        this.employeeId = idCounter++;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public Client addClient(String firstName, String lastName) {
        return new Client(firstName, lastName);
    }

    public BankAccount openAccount(Client client) {
        return client.getAccount();
    }

    public void acceptDeposit(Client client, double amount) throws AccountOperationException {
        client.getAccount().deposit(amount);
    }
}