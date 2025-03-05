package dec142024;

public class GPSeries {
    public static void main(String[] args){

        if(ispowerofThree(40)){
            System.out.println("true");
        }

        else
            System.out.println("false");

        }
        static boolean ispowerofThree(int n){
        if(n==0) {
            return false;
        }
        while(n>0){
            if(n%3==2)
                return false;
            n=n/3;
        }
        return true;
    }
}
