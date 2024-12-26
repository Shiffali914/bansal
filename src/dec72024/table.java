package dec72024;


import java.util.Scanner;

public class table {
    public static void main(String[] args) {
        int mul;
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the number");
        int n=scan.nextInt();
        for(int i=1; i<=10; i++){
            mul=n*i;
            System.out.println(mul);
        }

    }
}

