package bookstore;

/**
 * @author Nicole
 */
public class Book {
    //Variables
    String title;
    String authorF;
    String authorL;
    int isbn;
    double price;
    String genre;
    
    //Constructor
    public Book(String t, String af, String al, int num, double p, String g){
        title = t;
        authorF = af;
        authorL = al;
        isbn = num;
        price = p;
        genre = g;
    }
    
    //Return Author Name
    public String getAuthor(){
        return authorL;
    }
    
    //Return Book Info
    public void getBook(){
        System.out.println("\tAuthor: " + authorF + " " + authorL);
        System.out.println("\tTitle: " + title);
        System.out.println("\tISBN: " + isbn);
        System.out.println("\tPrice: " + price);
        System.out.println("\tGenre: " + genre);
    }
}
