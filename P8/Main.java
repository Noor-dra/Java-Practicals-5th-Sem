
class Book {
    String title;
    String author;
    double price;

    Book() {
        title = "Unknown";
        author = "Unknown";
        price = 0.0;
    }

    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    Book(Book b) {
        this.title = b.title;
        this.author = b.author;
        this.price = b.price;
    }

    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("--------------------");
    }
}

public class Main {
    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book("Java Programming", "James Gosling", 500);
        Book b3 = new Book(b2);

        System.out.println("Book created using no-argument constructor:");
        b1.display();

        System.out.println("Book created using parameterized constructor:");
        b2.display();

        System.out.println("Book created using copy constructor:");
        b3.display();

        b3.price = 700;
        b3.title = "Advanced Java";

        System.out.println("After modifying the copied object:");
        b3.display();

        System.out.println("Original object:");
        b2.display();
    }
}
