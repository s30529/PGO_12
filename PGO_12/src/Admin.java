public class Admin extends Employee {
    public Admin(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public Employee addEmployee(String firstName, String lastName) {
        return new Employee(firstName, lastName);
    }

    public void removeEmployee(Employee employee) {
    }
}