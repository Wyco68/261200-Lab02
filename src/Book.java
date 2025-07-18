public class Book {
    String title;
    String author;
    double price;
    Book(){
        this("Unknown title","Unknown authour",0.0);
    }

    Book(String title){
        this(title,"Unknown Author",0.0);
    }

    Book(String title,String author,double price){
        this.title=title;
        this.author=author;
        this.price=price;
    }

    //Display book details
    public void displayDetails(){
        System.out.println("Title: "+ this.title);
        System.out.println("Author: "+ this.author);
        System.out.println("Price: "+ this.price);
    }

    // Update book price
    public void updatePrice(double newPrice) {
        if(newPrice>=0)  this.price = newPrice;
    }

    // Add discount
    public void applyDiscount(double discountPercent){
        if(discountPercent<=0 || discountPercent >=100){// invalid discount
            System.out.println("Error Discount range");
        }
        else{ // valid
            this.price -= this.price*(discountPercent/100);
            System.out.println("Discount: "+ discountPercent + "%");
            System.out.println("New Price after Discount: "+ this.price);
        }
    }
}
