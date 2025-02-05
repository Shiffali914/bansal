package assignment3;
import java.util.*;
public class BookStore
{

    static List<Book> list1 = new ArrayList<Book>();
    static List<Book> list2=new LinkedList<>();
    private static Scanner scanner=new Scanner(System.in);

    public static void addBook(Book book) {
        list1.add(book);
    }

    public static void viewBook() {
        System.out.println("Available books in the store");
        System.out.println("");
        for (Book books : list1) {
            System.out.println(books.toString());
        }
    }

  public static void removeBook(String BookId) {
        boolean found = false;
        Iterator<Book> itr = list1.iterator();
        System.out.println(" ");
        while (itr.hasNext()) {
            Book t = itr.next();
            if (BookId.equals(t.getBookId())) {
                found = true;
                itr.remove();
                break;

            }
        }
      System.out.println("After Removal available book are"+"\n"+list1);
    }

    public static void purchaseBook(String BookId, int quantity){

        boolean found=false;
        Iterator<Book> iterator1= list1.iterator();
        while (iterator1.hasNext()){
            Book book5= iterator1.next();
            if (BookId.equalsIgnoreCase(book5.getBookId())) {
                if (quantity<=book5.getQuantity())
                {
                    book5.setQuantity(book5.getQuantity()-quantity);
                    book5.setPurchasequantity(quantity);
                    System.out.println("you have successfully purchased the book");

                } else{
                    throw new InsufficientStock("book is out of stock");
                    }
                    list2.add(book5);
                    found=true;

            }
        }
            if(!found)
            {
                throw new BookNotfoundException("book is not available");
            }
    }

  public static Book searchBook(String title){
        boolean found=false;
        for(Book bb:list1) {
            if (title.equalsIgnoreCase(bb.getTitle())) {
                found=true;
                return bb;
            }
        }if(!found){
            throw new BookNotfoundException("Sorry, book is not available");
        }
        return null;
    }

    public static void getinventory()
    {
        double total=0.0;
        for(int i=0;i<list1.size();i++){
            total+=list1.get(i).getPrice()*list1.get(i).getQuantity();

        }
        System.out.println("Total inventory"+total);
    }

    public static void purchasedBook(){

    System.out.println("");
    for (Book books : list2) {
        System.out.println("Purchased Book is \n"+books.getBookId()+" "+books.getTitle()+" "+books.getAuthor()+" "+books.getPrice()+" "+books.getPurchasequantity());
    }
    }
    public static void main(String[] args) {

        String bookId;
        int quantity;

        Book book1=new Book("B101","Clean Code","Robert C Martin",40.0,5);
        Book book2=new Book("B102","Java Programming","James Gosling",50.0,10);
        Book book3=new Book("B103","Effective java","Joshua Bloch",55.0,8);
        Book book4=new Book("B104","C Programming","Dennis Richard",60.0,7);
        Book book7=new Book("B105","C++","Dennis Richard",70.0,4);

        BookStore bookStore=new BookStore();

        //Adding Books in the list
        addBook(book1);
        addBook(book2);
        addBook(book3);
        addBook(book4);
        addBook(book7);

        //Display books which are available in the store
        viewBook();
        System.out.println("");

        // Remove a book from the store
        System.out.println("enter the id of book which do you want to remove from the list");
        bookId=scanner.nextLine();
        removeBook(bookId);
        System.out.println();

        // Search a book by title
        try{
            System.out.println("enter the title of book which do you want to search");
            String title=scanner.nextLine();
            Book searchBook1 = searchBook(title);
            System.out.println(searchBook1);
        } catch (BookNotfoundException e) {
            System.out.println(e.getMessage());

        }

        // purchase a book from the store
        try {
            System.out.println("enter the bookid");
            String bookId1 = scanner.next();
            System.out.println("enter the quantity");
            quantity = scanner.nextInt();
            purchaseBook(bookId1, quantity);
        }
        catch (BookNotfoundException | InsufficientStock e) {
            System.out.println(e.getMessage());
        }


        //Inventory list
        System.out.println();
        getinventory();

        //Display purchase a book
        purchasedBook();

        Set<String>set1 =new HashSet<>();
       for(Book books:list1){
           set1.add(books.getAuthor());

       }
        System.out.println();
        System.out.println("Unique Author name"+set1);
        System.out.println();

       Set<String>set2= new TreeSet<String>();
       for(int i=0;i<list1.size();i++){
           set2.add(list1.get(i).getTitle()+" "+list1.get(i).getAuthor()+" "+list1.get(i).getBookId());
       }
        System.out.println(set2);
    }


}
