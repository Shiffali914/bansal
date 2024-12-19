package dec72024;
import java.util.Scanner;

public class SumUseDoWhileLoop {
    public static void main(String[] args) {
        int sum=0;
        int i,n;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the range");
        n = sc.nextInt();
        System.out.println("enter the number");
        i = sc.nextInt();
        do {
            sum = sum + i;
            i++;
            System.out.println("sum = " + sum);
        }while(i<n);
        //System.out.println(i);

    }
}
