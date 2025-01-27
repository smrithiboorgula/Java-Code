public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private String address;

    public Employee() {
        this.id = 0;
        this.firstName = "";
        this.lastName = "";
        this.address = "";
    }

    public Employee(int id, String firstName, String lastName, String address) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public String toString() {
        return "Employee ID: " + id + "\n" + 
               "Name: " + getFullName() + "\n" + 
               "Address: " + address;
    }

    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.id = 1;
        employee1.firstName = "John";
        employee1.lastName = "Doe";
        employee1.address = "123 Main St, Anytown, USA";
        System.out.println(employee1);

        Employee employee2 = new Employee(2, "Alice", "Smith", "456 Oak St, Somecity, USA");
        System.out.println(employee2);
    }
}

