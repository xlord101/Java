class Book {
    String title;
    String author;
    double price;
    int year;

public Book(String title, String author) {
    this.title = title;
    this.author = author;
    this.price = 0.0;  
    this.year = 0;     
        }

public Book(double price, int year) {
    this.title = "unknown";  
    this.author = "unknown"; 
    this.price = price;
    this.year = year;
       }

public Book(String title, String author, double price) {
    this.title = title;
    this.author = author;
    this.price = price;
    this.year = 0;  
        }

public void displayBookdetails() {
    System.out.println("Title : " + title);
    System.out.println("Author : " + author);
    System.out.println("Price : " + price);
    System.out.println("Year : " + year);
    System.out.println(" ");
        }
    }
    public class Main {
        public static void main(String[] args) {
            Book book1 = new Book("The Alchemist", "Paulo Coelho");
            book1.displayBookdetails();
    
            Book book2 = new Book("Belgium","George Orwell", 780.99);
            book2.displayBookdetails();

            Book book3 = new Book("harry potter", "J.K rollings",1998);
            book3.displayBookdetails();
        }
    }