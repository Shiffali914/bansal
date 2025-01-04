package dec21;

public class Reverse {
   public void revnum(int[] num)
    {
        int rev;
        System.out.println("Reverse order is");
        for(int i= num.length-1; i>=0; i--)
        {
           rev=num[i];
           System.out.println(rev);
        }
    }
}
