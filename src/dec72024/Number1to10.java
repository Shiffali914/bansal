package dec72024;

import java.util.Scanner;

public class Number1to10 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        n=sc.nextInt();
        int x;
        System.out.println("Enter the value of x: ");
        x=sc.nextInt();
        while (x<=n) {
            System.out.println(x);
            x++;
        }

    }

}
