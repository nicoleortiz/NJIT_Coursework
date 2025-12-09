package bookstore;

import java.util.Scanner;

//===================================================  
// Name       :  Nicole Ortiz   
// SID        :  31404203
// Course     :  IT 114
// Section    :  451
// Instructor :  Deek
// T.A        :  ---
//===================================================  
//===================================================  
// Assignment # :   1
// Date         :  10/5/18
//===================================================  
//===================================================  
// Description : Allow a user to browse all book titles, 
// search by author name, or order a new book (to be 
// added to the book list)
//===================================================  

public class Bookstore {
    
    static String[] authors;
    static Book[][] books;
    static Scanner sc = new Scanner(System.in);
    static Scanner nsc = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println("Welcome to the Bookstore!\n");
        System.out.println("*****     *****     *****     *****     *****     *****     *****");
        
        authors = new String[30];
        books = new Book[30][5];
        
        bookStock();
        welcome();
        
    }
    
    //User Initial Contact
    public static void welcome(){
        System.out.println("Would you like to");
        System.out.println("\t (all) See a list of all authors and books?");
        System.out.println("\t (find) Search for a specific author?");
        
        System.out.println("\n\n *Please type the command found in {} to select an option");
        System.out.println("*****     *****     *****     *****     *****     *****     *****");
        
        System.out.print("Choice: ");
        String c = sc.next();
        c = c.toLowerCase();
        selectInit(c);
    }
    
    //Initial User Choice
    public static void selectInit(String c){
        switch (c){
            case "all":
                System.out.println("*****     *****     *****     *****     *****     *****     *****");
                inventory();
                break;
            case "find":
                System.out.println("*****     *****     *****     *****     *****     *****     *****");
                search();
                break;
            default:
                System.out.println("Incorrect Command");
                System.out.println("*****     *****     *****     *****     *****     *****     *****");
                welcome();
        }
    }
    
    //Print Inventory
    public static void inventory(){
        System.out.println("Inventory:");
        
        for (int a=0; a<30; a++){
            if (authors[a] != null){
                System.out.println(authors[a]);
                for (int b=0; b<5; b++){
                    if(books[a][b] != null){
                        books[a][b].getBook();
                        System.out.println("\t---");
                    }
                    else
                        break;
                }
            }
        }
    }
    
    //Search Engine
    public static void search(){
        System.out.println("Search By Author");
        System.out.print("\tEnter An Author's Last Name: ");
        String z = sc.next();
        
        System.out.println("*****     *****     *****     *****     *****     *****     *****");
        System.out.println("Results:");
        for (int i=0; i<30; i++){
            if(z.equals(authors[i])){
                for (int b=0; b<5; b++){
                    if(books[i][b] != null){
                        books[i][b].getBook();
                        System.out.println("---");
                    }
                    if(b==4)
                        return;
                }
            }
            if(i==29 && !z.equals(authors[i])){
                System.out.println("Sorry, this author is not in stock.");
                System.out.print("Would you like to order a book by this author? (yes/no) ");
                String u = sc.next();
                switch(u){
                    case "yes":
                        System.out.println("*****     *****     *****     *****     *****     *****     *****");
                        newAuthor();
                        break;
                    case "no":
                        System.out.println("Thank you.");
                        System.out.println("*****     *****     *****     *****     *****     *****     *****");
                        break;
                    default:
                        System.out.println("Unrecognized Command");
                        System.out.println("*****     *****     *****     *****     *****     *****     *****");
                        search();
                        break;
                }
            }
        }
    }
    
    //Add New Book To Stock
    public static void updateStock(Book b){
        String a = b.getAuthor();
        //Check if Author is already in stock
        for (int i=0; i<30; i++){
            //No
            if (authors[i] == null){
                authors[i] = a;
                books[i][0] = b;
                return;
            }
            //Yes
            if (authors[i].equals(a)){
                //Add Book
                for (int x=0; x<5; x++){
                    if (books[i][x] == null){
                        books[i][x] = b;
                        return;
                    }
                }
            }
        }
    }
    
    //Enter New Book & Author
    public static void newAuthor(){
        System.out.println("Author First Name: ");
        String authorF = sc.next();
        System.out.println("Author Last Name: ");
        String authorL = sc.next();
        System.out.println("Book Title: ");
        String title = nsc.nextLine();
        System.out.println("ISBN: ");
        int isbn = sc.nextInt();
        System.out.println("Price: ");
        double price = sc.nextDouble();
        System.out.println("Genre: ");
        String genre = sc.next();
        
        Book X = new Book (title, authorF, authorL, isbn, price, genre);
        for(int i=0; i<30;i++){
            if (authors[i] == null){
                authors[i] = authorL;
                books[i][0] = X;
                System.out.println("Book Added to library");
                System.out.println("*****     *****     *****     *****     *****     *****     *****");
                welcome();
                return;
            }
        }
    }
    
    //Create Book Testing Cases
    public static void bookStock(){
        Book A = new Book("Albert's Impossible Toothache",
                          "Barbara", "Williams",
                          1,
                          3.00,
                          "fiction");
        Book B = new Book("The Cat in the Hat",
                          "Dr", "Seuss",
                          2,
                          5.25,
                          "fiction");
        Book C = new Book("The Outsiders",
                          "S.E", "Hinton",
                          3,
                          12.99,
                          "fiction");
        Book D = new Book("Breen Eggs and Ham",
                          "Dr", "Seuss",
                          4,
                          5.25,
                          "fiction");
        Book E = new Book("Ender's Game",
                          "Orson Scott", "Card",
                          5,
                          11.99,
                          "sci fi");
        
        updateStock(A);
        updateStock(B);
        updateStock(C);
        updateStock(D);
        updateStock(E);
    }
}
