package dec21;

import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] arr=new int[10];
        System.out.println("Enter the elements of array");
        for (int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
        for(int e: arr){
            System.out.println(e);
        }
    }
}
