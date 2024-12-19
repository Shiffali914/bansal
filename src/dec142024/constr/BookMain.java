package dec142024.constr;

import java.util.Scanner;

public class BookMain {
    public static void main(String[] args) {
        /* Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the book: ");
        title = sc.nextLine();
        System.out.println("Enter the author: ");
        String author = sc.nextLine();
        System.out.println("Enter the price of the book: ");
        double price = sc.nextDouble();*/
        Book book = new Book("Clean code", "Robert Uncle");
        System.out.println(book.title + " " + book.author);

       /*Book book1=new Book(title,author);
       Book book2=new Book(title,author,price);*/

        book.DisplayDetails("Java", "James Gosling", 100.0);
    }
}
