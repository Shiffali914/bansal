package dec32024;

import java.util.Scanner;

public class Switchdemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input : ");
        int input=sc.nextInt();
        switch (input){
            case 1:
                System.out.println("case 1");
                break;
                case 2:
                    System.out.println("case 2");
                    break;
                        case 3:
                            System.out.println("case 3");
                            break;
                            default:
                                System.out.println("Invalid input");
        }

    }
}



/*switch(input)
{


     }*/