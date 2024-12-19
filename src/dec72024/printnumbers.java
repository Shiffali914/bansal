package dec72024;

import java.util.Scanner;
public class printnumbers {
    public static void main(String[] args) {
        int sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n");
        int n = sc.nextInt();
        int x;
        System.out.println("enter the value of x");
        x = sc.nextInt();
        while(x<=n)
        {
            sum= sum+x;
            x++;
        }
        System.out.println(sum);
    }
}
