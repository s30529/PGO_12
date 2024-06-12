public class Main {
    public static void main(String[] args) {
        try {
            Admin admin = new Admin("Kacper", "Fusiek");

            Employee emp1 = admin.addEmployee("Jan", "Kowalski");
            Employee emp2 = admin.addEmployee("Jakub", "Wrona");

            Client client1 = emp1.addClient("Ryszard", "Mazur");
            Client client2 = emp1.addClient("Filip", "Kucharek");
            Client client3 = emp2.addClient("Mateusz", "Niemiec");
            Client client4 = emp2.addClient("Jarek", "Polak");

            client1.getAccount().deposit(1337);
            client2.getAccount().deposit(2115);
            client3.getAccount().deposit(3210);
            client4.getAccount().deposit(4321);

            client1.getAccount().transfer(123, client2.getAccount());
            client2.getAccount().transfer(231, client3.getAccount());
            client3.getAccount().transfer(356, client4.getAccount());
            client4.getAccount().transfer(421, client1.getAccount());
            client1.getAccount().transfer(155, client3.getAccount());
            client2.getAccount().transfer(257, client4.getAccount());
            client3.getAccount().transfer(359, client1.getAccount());
            client4.getAccount().transfer(451, client2.getAccount());
            client1.getAccount().transfer(521, client4.getAccount());
            client2.getAccount().transfer(633, client1.getAccount());

            System.out.println("Client 1 balance: " + client1.getAccount().checkBalance());
            System.out.println("Client 2 balance: " + client2.getAccount().checkBalance());
            System.out.println("Client 3 balance: " + client3.getAccount().checkBalance());
            System.out.println("Client 4 balance: " + client4.getAccount().checkBalance());
        } catch (AccountOperationException e) {
            e.printStackTrace();
        }
    }
}