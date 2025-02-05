package assignment3;

public class Book {

    private String BookId;
    private String title;
    private String author;
    private double price;
    private int quantity;
    private int purchasequantity;

    public Book(){}

    public Book(String bookId, String title, String author, double price, int quantity) {
        BookId = bookId;
        this.title = title;
        this.author = author;
        this.price = price;
        this.quantity = quantity;
    }

    public String getBookId() {
        return BookId;
    }

    public void setBookId(String bookId) {
        BookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPurchasequantity() {
        return purchasequantity;
    }

    public void setPurchasequantity(int purchasequantity) {
        this.purchasequantity = purchasequantity;
    }

    @Override
    public String toString() {
        return "BookId='" + BookId + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", quantity=" + quantity+'\n';
    }
}
