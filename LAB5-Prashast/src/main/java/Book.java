import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Book {
    
    private String title;
    private String author;
    private int edition;
    
    public Book(String title, String author, int edition) 
    {
        this.title = title;
        this.author = author;
        this.edition = edition;
    }
    
    public String getTitle() 
    {
        return title;
    }
    
    public String getAuthor() 
    {
        return author;
    }
    
    public int getEdition() 
    {
        return edition;
    }
    
    public static void main(String[] args) 
    {

        List<Book> bookList = new ArrayList<>();
     
        bookList.add(new Book("Book 1", "Author 1", 1));
        bookList.add(new Book("Book 2", "Author 1", 2));
        bookList.add(new Book("Book 3", "Author 2", 1));
        bookList.add(new Book("Book 4", "Author 2", 2));
        bookList.add(new Book("Book 5", "Author 3", 1));
        bookList.add(new Book("Book 6", "Author 4", 1));

        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter author name : ");
        String userInput = sc.nextLine();


  
        boolean foundAuthor = false;
        for (Book book : bookList) 
        {
            if (book.getAuthor().equals(userInput)) 
            {
                System.out.println("Title : " + book.getTitle());
                System.out.println("Author : " + book.getAuthor());
                System.out.println("Edition : " + book.getEdition());
                System.out.println();
                foundAuthor = true;
            }
        }
        
        if (!foundAuthor) 
        {
            System.out.println("No books found for the specified author.");
        }
        
        
    }
    
}