package dec142024;

import java.util.Scanner;

public class MainOverloading {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Overloading Overload = new Overloading();
        System.out.println("enter the name");
        String name = sc.nextLine();
        System.out.println("enter the email");
        String email = sc.nextLine();
        System.out.println("enter the phone number");
        String phone = sc.nextLine();
        System.out.println(Overload.info(name));
        System.out.println(Overload.info(name, email));
        System.out.println(Overload.info(name, email, phone));

            /*System.out.println(Overload.info("Shiffali"));
        System.out.println(Overload.info("Shiffali", "Shiffalibansal914@gmail.com"));
        System.out.println(Overload.info("Shiffali", "Shiffalibansal914*/
    }
}