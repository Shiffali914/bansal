package assignment;

import java.util.Scanner;

import static java.lang.System.exit;

public class Ecommerce {
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        String[] product=new String[7];
        int[] sale=new int[7];
        System.out.println("enter the product");
        for(int i=0;i< product.length;i++){
            product[i]=sc.nextLine();
        }
        System.out.println("enter the sales:");
        for(int i=0;i< sale.length;i++){
            sale[i]= sc.nextInt();
        }
        System.out.println("enter the product do you want to search ");
        String product1=sc.next();
        int totalsale=0;
        for(int i=0;i<product.length;i++){
            if(product[i].equals(product1))
            {
                totalsale=sale[i]*7;
                break;
            }
            else
                System.out.println("it is not in the list");
            exit(0);
        }
        System.out.println(product1 +"total sales is   " +totalsale);
    }
}
