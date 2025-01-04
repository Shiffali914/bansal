package assignment;

import java.util.Scanner;

import static java.lang.System.exit;

public class LibraryBook {
    public static void main(String[] args) {
        //int n;
        String[] book = {"time of the child", "wind and truth", "house of names", "city of dragons", "end of watch", "refugee"};
        System.out.println("Books names are: ");
        for (int i = 0; i < book.length; i++) {
            System.out.println(book[i]);
        }
        Scanner sc = new Scanner(System.in);
        boolean isfound = false;
        System.out.println("Enter the book which do you want to search from list is ?");
        String name = sc.nextLine();
        for (int i = 0; i < book.length; i++) {
            if (book[i].equals(name)) {
                System.out.println("It is in library");
                isfound = true;
            }
        }
        if (!isfound) {
            System.out.println("book is not in the library");
            exit(0);
        }
        System.out.println("enter the book which do you want to update");
        String name1 = sc.nextLine();
        System.out.println("enter the new title");
        String newtitle = sc.nextLine();
        for (int i = 0; i < book.length; i++) {
            if (book[i].equals(name1)) {
                book[i] = newtitle;
                isfound = true;
                break;
            }
        }if(!isfound){
            System.out.println("it is not in the library");
            exit(0);
        }
        System.out.println("New List of books is");
        for(String books:book){
            System.out.println(books);
        }
    }

}