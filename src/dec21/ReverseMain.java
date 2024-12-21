package dec21;

import java.util.Scanner;

public class ReverseMain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Reverse rev=new Reverse();
        int[] num=new int[6];
        System.out.println("enter the numbers");

        for(int i=0;i<num.length;i++)
        {
            num[i]=sc.nextInt();

        }
         rev.revnum(num);

        //System.out.println("Reverse number order" +x);
    }
}
