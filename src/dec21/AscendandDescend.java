package dec21;

import java.util.Scanner;

public class AscendandDescend {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the original array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int temp = 0;
       // System.out.println("the sorted array is");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }

            }
        }
        System.out.println("the descending array is");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}