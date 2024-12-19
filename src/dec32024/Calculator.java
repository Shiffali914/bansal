package dec32024;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char choice=sc.next().charAt(0);
        do{
        System.out.println("***********");
        System.out.println("Welcome to my calculator");
        System.out.println("***********");
        System.out.println("enter your choice");
        int input = sc.nextInt();
        switch (input) {
                case 1:
                    char ch;
                    do {
                        System.out.println("enter the value of num1" + " ");
                        int x = sc.nextInt();
                        System.out.println("enter the value of num2" + " ");
                        int y = sc.nextInt();
                        int p = x + y;
                        System.out.println("addition is" + " " + p);
                        System.out.println("Do you want to continue? (y/n)");
                        ch = sc.next().charAt(0);
                    } while (ch == 'Y' || ch == 'y');
                    break;
                case 2:
                    System.out.println("enter the value of num1" + " ");
                    int a = sc.nextInt();
                    System.out.println("enter the value of num2" + " ");
                    int b = sc.nextInt();
                    int z = a - b;
                    System.out.println("Subtraction is" + " " + z);
                    break;

                case 3:
                    System.out.println("enter the value of num1" + " ");
                    int c = sc.nextInt();
                    System.out.println("enter the value of num2" + " ");
                    int d = sc.nextInt();
                    int mul = c * d;
                    System.out.println("multiplication is" + " " + mul);
                    break;

                case 4:
                    System.out.println("enter the value of num1" + " ");
                    int e = sc.nextInt();
                    System.out.println("enter the value of num2" + " ");
                    int f = sc.nextInt();
                    int div = e / f;
                    System.out.println("division is" + " " + div);
                    break;

                case 5:
                    System.out.println("enter the value of num1" + " ");
                    int i = sc.nextInt();
                    System.out.println("enter the value of num2" + " ");
                    int o = sc.nextInt();
                    int mod = i % o;
                    System.out.println("modulus is" + " " + mod);
                    break;
                    case 6:
                    System.out.println("exit");
                    System.exit(0);
                    default:
                    System.out.println("wrong input");
            }
            System.out.println("do you want to go to the main menu");
            System.out.println("enter your choice");

        }while(choice=='Y'||choice=='y');
    }
}

