package jan23.Exceptionss;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the age");
        int age=scanner.nextInt();
        DriverLicenseDemo licenseDemo=new DriverLicenseDemo();
        licenseDemo.eligiblity(age);
    }
}
