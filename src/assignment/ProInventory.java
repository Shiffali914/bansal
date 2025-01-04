package assignment;

import java.util.Scanner;

public class ProInventory {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] product = {"Iron", "Straighter", "Hair dyer", "Laptop", "Tablet"};
        Double[] price = {200.0, 150.0, 120.0, 300.0, 300.0};
        System.out.println("Product are with their price :-");
        for (int i = 0; i < product.length; i++) {

            System.out.println(product[i] + "   " + price[i]);

        }
        boolean isfound=false;
        System.out.println("Enter the product which do you want?");
        String name = sc.nextLine();
        for (int i = 0; i < product.length; i++) {
            if (name.equals(product[i])) {
                isfound=true;
                System.out.println(product[i]+" "+price[i]);
                break;
            }
        }if(!isfound){
            System.out.println("It is not available");
        }

    }
}

