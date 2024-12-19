package dec102024;

import java.util.Scanner;

public class Calculator2 {
    public static void main(String[] args) {
        System.out.println("****************");
        System.out.println("Welcome to the Calculator program");
        System.out.println("****************");
        Scanner sc = new Scanner(System.in);
        char choice;
        do {
            Calculator2 obj = new Calculator2();
            System.out.println("Enter your choice: ");

            int input = sc.nextInt();
            switch (input) {

                case 1:
                    obj.sum();
                    break;
                case 2:
                    obj.subtract();
                    break;
                case 3:
                    obj.mul();
                    break;
                case 4:
                    obj.modulus();
                    break;
                    case 5:
                        obj.division();
                        break;
                default:
                    System.out.println("Invalid choice");
            }

            System.out.println("Do you want to go back enter your choice");
            choice = sc.next().charAt(0);
        } while (choice == 'Y' || choice == 'y');
    }
        public void sum()
        {
            int num1, num2;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter first number: ");
            num1 = sc.nextInt();
            System.out.println("Enter second number: ");
            num2 = sc.nextInt();
            int sum = num1 + num2;
            System.out.println("The sum is: " + sum);
        }
        public void subtract () {
            int num1, num2;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter first number: ");
            num1 = sc.nextInt();
            System.out.println("Enter second number: ");
            num2 = sc.nextInt();
            int sub = num1 - num2;
            System.out.println("The subtraction is: " + sub);
        }
        public void mul () {
            int num1, num2;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter first number: ");
            num1 = sc.nextInt();
            System.out.println("Enter second number: ");
            num2 = sc.nextInt();
            int mul = num1 * num2;
            System.out.println("The multiplication is: " + mul);
        }
        public void modulus () {
            int num1, num2;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter first number: ");
            num1 = sc.nextInt();
            System.out.println("Enter second number: ");
            num2 = sc.nextInt();
            int mod = num1 % num2;
            System.out.println("The modulus is: " + mod);

        }
        public void division(){
        int num1, num2;
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter first number: ");
            num1 = sc.nextInt();
            System.out.println("Enter second number: ");
            num2 = sc.nextInt();
            int div = num1 / num2;
            System.out.println("The division is: " + div);
        }


}
