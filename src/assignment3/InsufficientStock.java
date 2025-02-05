package assignment3;

public class InsufficientStock extends RuntimeException{
    public InsufficientStock(String message) {
        super(message);
    }
}
