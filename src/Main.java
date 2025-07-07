public class Main {
    public static void main(String[] Args){

        // Test price discount(Part 2)
        Book book = new Book("Java Programming", "John Doe", 1000.00);
        book.applyDiscount(-20);   // Should show error
        book.applyDiscount(25.00); // Should apply 25% discount
        book.displayDetails();     // Should show updated price (750.00)
    }
}
