
class Employee {
    String name;
    double salary;
    static int count = 0;

    Employee() {
        this("Unknown", 0.0);
    }

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        count++;
    }

    void display() {
        System.out.println("Employee Name: " + this.name);
        System.out.println("Salary: " + this.salary);
    }

    static void displayCount() {
        System.out.println("Total Employees: " + count);
    }
}

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee("Aman", 30000);
        Employee e3 = new Employee("Riya", 45000);

        e1.display();
        System.out.println();

        e2.display();
        System.out.println();

        e3.display();
        System.out.println();

        Employee.displayCount();
    }
}
