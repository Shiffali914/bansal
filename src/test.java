public class test {
    public static void main(String[] args) {

        int x= 10;
        int y;
       // x =x+1 ===== x++
        //y= x++; this is going to assign the value first and then increment the value of x
        y= ++x ;  //in this first increment the value of x then assign the value of x into y
        System.out.println(y);

    }
}

/*
increment
preincrement            post increment
++x                        x++

decrement
--x                        x--
 */