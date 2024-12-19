public class logicaloperators {
    public static void main(String[] args) {
        int x= 10;
        int y= 20;
                        //false  &&  true    ----false
       boolean result= (x > y) || (x!=0); // true
        System.out.println(result);
    }
}

/* and

true false ----  false
false true ----- false
false false ---- false
true true  ---- true

or
false true  ----true
true true  ---- true
false false ---false
true false  ----true

Not
! true---false
!false ---true
*/