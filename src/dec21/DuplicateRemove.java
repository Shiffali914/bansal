package dec21;

import java.util.Scanner;

public class DuplicateRemove {
    public static void main(String[] args) {
      int size;
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the size of array");
        size=scanner.nextInt();
        int[] arr = new int[size];
        int len=arr.length;

        System.out.print("enter the array");
        for(int i=0;i< len;i++){
            arr[i]=scanner.nextInt();
        }
        int j=0;
        int temp[]=new int[len];
        for(int i=0;i<len-1;i++){
            if(arr[i]!=arr[i+1]){
                temp[j]=arr[i];
                j++;
            }
        }
        temp[j++]=arr[len-1];

        for(int k=0;k<j;k++){
            System.out.print(temp[k]+" ");
        }
    }
}