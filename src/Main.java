public class Main {
    public static void main(String[] Args){
        Book myBook= new Book("Book 1", "Wyco", 5.0);
        myBook.displayDetails();

        Book ourBook= new Book("Our Book");
        ourBook.updatePrice(100);
        ourBook.displayDetails();

        /// /////////////////////
        // Test default constructor
        Book unknownBook = new Book();
        unknownBook.displayDetails();

        // Test parameterized constructor
        Book hp1Book = new Book("Harry Potter and the Philosopher\'s Stone", "J.K. Rowling", 350.00);
        hp1Book.displayDetails();

        // Test price update
        hp1Book.updatePrice(32000.00);
        hp1Book.displayDetails();
    }
}
