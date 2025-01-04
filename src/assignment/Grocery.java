package assignment;

import java.util.Scanner;

import static java.lang.System.exit;

public class Grocery {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String[] fruit=new String[6];
        double[] price=new double[6];
        System.out.println("Enter the fruits");
        for(int i=0;i<fruit.length;i++){
            fruit[i]=sc.nextLine();
        }
        System.out.println("enter the price");
        for(int i=0;i<price.length;i++){
            price[i]=sc.nextDouble();
        }
        System.out.println("enter the fruit");
        String name=sc.next();
        System.out.println("enter the weight");
        int w=sc.nextInt();
        double netprice=0;
        for(int i=0;i<fruit.length;i++)
        {
            if(fruit[i].equals(name)) {
                netprice = price[i] * w;
                break;
            }
            else
                System.out.println("it is not in the list");
            exit(0);
        }
        System.out.println("the total price for "+name+"is "+netprice);

    }
}
