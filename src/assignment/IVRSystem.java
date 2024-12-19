package assignment;
import java.util.Scanner;
public class IVRSystem {

    public static void main(String[] args) {
        System.out.println("Welcome to the IVR System!");
        int input;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the choice of language ENGLISH for press 1 OR FRENCH for press 2");
        input = sc.nextInt();
        switch (input) {
            case 1:
                System.out.println("English");
                System.out.println("press 1 for internet");
                System.out.println("press 2 for mobile");
                System.out.println("press 3 for technical support");
                System.out.println("press 4 for main menu");
                System.out.println("press the number for service");
               int num1 = sc.nextInt();
                switch (num1) {
                        case 1:
                            internet();
                            break;
                        case 2:
                            mobile();
                            break;
                        case 3:
                            technical();
                            break;
                        case 4:
                            System.out.println("Go the main menu");
                            break;


                }
        }
        switch (input) {
            case 2:
                System.out.println("French");
                System.out.println("Services:-");
                System.out.println("press 1 for internet");
                System.out.println("press 2 for mobile");
                System.out.println("press 3 for technical support");
                System.out.println("press 4 for main menu");
                int num2;
                System.out.println("press the number for service");
                num2 = sc.nextInt();
                switch (num2) {
                    case 1:
                        internet();
                        break;
                    case 2:
                        mobile();
                        break;
                    case 3:
                        technical();
                        break;
                        case 4:
                            System.out.println("Go the main menu");
                            break;
                    default:
                        System.out.println("service is not available");

                }
        }
    }

    public static void internet() {
        System.out.println("which internet deals do you want to choose?");
        System.out.println("1.5G Infinite Essentials");
        System.out.println("2.5G Infinite Extra");
        System.out.println("3.go to the main menu");
        System.out.println("Enter one of these options:");
        int x;
        Scanner sc1 = new Scanner(System.in);
        System.out.println("press the number for internet service: ");
        x = sc1.nextInt();
        switch (x) {
            case 1:
                System.out.println("Billing");
                break;
            case 2:
                System.out.println("SMS");
                break;
            case 3:
                System.out.println("customer support");
                break;
            default:
                System.out.println("Invalid choice");
        }
    }

    public static void mobile() {
        int y;
        Scanner sc2 = new Scanner(System.in);
        System.out.println("press the key for mobile service: :");
        y = sc2.nextInt();
        switch (y) {
            case 1:
                System.out.println("mobile repair");
                break;
            case 2:
                System.out.println("mobile recharge");
                break;
            default:
                System.out.println("Invalid choice");
        }
    }

    public static void technical() {
        Scanner sc3 = new Scanner(System.in);
        System.out.println("press the key for technical service :");
        int p = sc3.nextInt();
        switch (p) {
            case 1:
                System.out.println("technical repair");
                break;
            case 2:
                System.out.println("technical recharge");
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}


