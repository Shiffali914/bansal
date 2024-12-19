package dec32024;

import java.util.Scanner;

public class UserInputdemo {
    public static void main(String[] args) {
        //object of scanner class
        //int x=10;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the user");
        String firstname = sc.nextLine();
        /*System.out.println("Enter the last of the user");
        String lastname = sc.next();*/
        System.out.println("Print the name" + firstname);

        char ch= sc.next().charAt(0);//it gives first character of string

    }
}
//arrays in Java- which starts at 0 index
// character of strings and every character of string has a array

