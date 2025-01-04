package assignment;
import java.util.Scanner;
public class CustomerFeedback {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] reviews = new String[5];
        System.out.println("enter the reviews");
        for (int i = 0; i < reviews.length; i++) {
            reviews[i] = sc.nextLine();
        }
        boolean found = false;
        System.out.println("Enter word to search: ");
        String word = sc.next();
        for (int i = 0; i < reviews.length; i++) {
            if (reviews[i].contains(word)) {
                found = true;
                System.out.println(reviews[i]);

            }

        }
        if (!found) {
            System.out.println("No such comment is available");
        }
    }
    }


