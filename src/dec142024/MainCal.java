package dec142024;

import java.util.Scanner;

public class MainCal {
    public static void main(String[] args) {
        Calclass cal=new Calclass();
        System.out.println(cal.sum(10, 20));
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name ");
        String name = sc.nextLine();
        System.out.println(cal.greeting(name));

    }
}
