package dec72024;
public class sumof1to10 {
    public static void main(String[] args) {
        int x=1;
        int n=10;
        int sum=0;
        while(x<=n){
            sum=sum+x;
            x++;
        }
        //System.out.println(x);
        System.out.println("sum of first" +n+ " numbers is  "+sum);

    }
}
