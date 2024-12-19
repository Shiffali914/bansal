package dec72024;

import java.util.Scanner;

public class DoWhiledemo {
    public static void main(String[] args) {
        int x,n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of range: ");
        n= sc.nextInt();
        System.out.println("enter the number");
        x= sc.nextInt();
        do {
            int z=5*x;
            x++;
            System.out.println(z);
        }while(x<=n);
    }
}
