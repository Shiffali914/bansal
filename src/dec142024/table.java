package dec142024;

import java.util.Scanner;
public class table {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter the number");
        int n = scan.nextInt();
        for (int i = 1; i <= 10; i++) {
            int mul = n * i;
            System.out.println( n+"*"+i+"="+mul);
        }

    }

}