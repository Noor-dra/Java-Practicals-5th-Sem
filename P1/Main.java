
class Student {
    int rollNumber;
    String name;
    int marks1, marks2, marks3;

    Student(int rollNumber, String name, int marks1, int marks2, int marks3) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
    }

    int calculateTotal() {
        return marks1 + marks2 + marks3;
    }

    double calculatePercentage() {
        return (calculateTotal() / 300.0) * 100;
    }

    void displayDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("Marks in Subject 1: " + marks1);
        System.out.println("Marks in Subject 2: " + marks2);
        System.out.println("Marks in Subject 3: " + marks3);
        System.out.println("Total Marks: " + calculateTotal());
        System.out.println("Percentage: " + calculatePercentage() + "%");
        System.out.println("----------------------------");
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Aman", 85, 90, 80);
        Student s2 = new Student(102, "Riya", 78, 88, 92);
        Student s3 = new Student(103, "Rahul", 95, 89, 94);

        s1.displayDetails();
        s2.displayDetails();
        s3.displayDetails();
    }
}

