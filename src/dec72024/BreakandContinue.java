package dec72024;
import java.util.Scanner;
public class BreakandContinue {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter the range: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int x = 0; x < n; x++) {
            //System.out.println(x);
            if (x %5== 0)
            {
                System.out.println("pragra");
                continue;
            }
            System.out.println(x);
        }
    }
}