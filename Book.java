public class Book{
    String title;
    String author;
    double price;
    
    public Book(String t, String a, double p){
        title = t;
        author = a;
        price = p;
    }
    public void displayInfo(){
        System.out.println("Book Title: " + title);
         System.out.println("Book Author: " + author);
          System.out.println("Book Price: $" + price);
    }
    public static void main(String[] args){
 Book myBook = new Book("48 laws of power", "Robert Greene", 28.45);
 myBook.displayInfo();
    }
}


  