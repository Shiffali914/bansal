package dec72024;
import java.util.Scanner;
public class demoloop {
    public static void main(String[] args) {
        int x;
        System.out.println("Enter the value of x");
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        while(x<=10)
        {
            int y=5*x;
            x++;
            System.out.println(y);
        }
    }
}
