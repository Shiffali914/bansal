package dec21;

import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args) {
        int size,index,i;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the array size");
        size=scanner.nextInt();

        int arr[]=new int[size];
        System.out.print("enter the array");
        for(i=0;i<size;i++){
            arr[i]=scanner.nextInt();
        }
        System.out.println("enter the index which do you want to delete");
        index=scanner.nextInt();

        for(i=index;i<size-1;i++){
            arr[i]=arr[i+1];
        }
        size--;
        for(i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
