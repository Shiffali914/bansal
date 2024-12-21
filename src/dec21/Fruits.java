package dec21;

import java.util.Scanner;

public class Fruits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] fruit= new String[5];
        System.out.println("enter the name of fruits");
        for (int i=0; i<fruit.length;i++){
            fruit[i]=sc.nextLine();
        }
        for(String name:fruit){
            System.out.println(name);
        }
    }
}
