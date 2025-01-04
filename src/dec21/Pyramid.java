package dec21;

public class Pyramid {
    public static void main(String[] args){
        int row=5;
        /*star pyramid
        for(int i=0;i<row;i++){
            for(int j=row-i-1;j>=1;j--)
                System.out.print(" ");
                        for(int j=0;j<=i;j++)
                            System.out.print("* ");
            System.out.println("");*/

        /*right triangle star
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }*/

        //left traingle star
        for(int i=1;i<=5;i++){//work for row
            for(int k=4;k>=i;k--){//work for space
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){//work for column
                System.out.print("*");
            }
            System.out.println();
        }

        }
    }

