package assignment;

import java.util.Scanner;

import static java.lang.System.exit;

public class Booking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch;
        String[] destination = new String[5];
        boolean found = false;
        System.out.println("enter the destination");
        for (int i = 0; i < destination.length; i++) {
            destination[i] = sc.nextLine();
        }
        System.out.println("enter the destination where do you want to go");
        String name = sc.nextLine();
        for (int i = 0; i < destination.length; i++) {
            if (name.equals(destination[i])) {
                System.out.println("Confirm,it is available");
                found = true;
                break;

            }
        }
        if (!found) {
            System.out.println("it is not available");
            exit(0);
        }
do{
            System.out.println("enter the destination which do you want to update");
            String olddestination = sc.next();
            System.out.println("enter the new destination");
            String newdestination = sc.next();
            for (int i = 0; i < destination.length; i++) {
                if (newdestination.equals(destination[i])) {
                    System.out.println("Your destination is update confirm");
                    found = true;
                    break;
                    //exit(0);
                }

            }
            if(!found)
            {
                System.out.println("it is not available");}
            System.out.println("do you want to continue y/n");
            ch=sc.next().charAt(0);
        }while(ch=='Y'||ch=='y');

    }
    }

