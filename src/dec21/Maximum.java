package dec21;

import java.util.Scanner;

public class Maximum {
    public static void main(String[] args) {
        MaxandSmall m=new MaxandSmall();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int[] arr=new int[5];
       for (int i=0; i<arr.length;i++)
       {
           arr[i]=sc.nextInt();
       }
        int findmax = m.findmax(arr);
        System.out.println("Largest number" +findmax);
        int findmin = m.findmin(arr);
        System.out.println("Smallest number" +findmin);
    }

}



