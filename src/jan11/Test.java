package jan11;

public class Test {

    //instance variable
    int x=10;

    public int show()
    {
       //local variable
        x=20;
        return x;
    }
}

class Demo extends Test{

    //instance variable
    int x=220;


    @Override
    public int show() {
        return super.x;
        //return super.show();
    }
}

class Main{

public static void main(String[] args) {
    Demo dm=new Demo();
    int show = dm.show();
    System.out.println(show);
}
        }



        /*
        ## final

        variable-has a become constant
        method-you cannot overriden that method
        class-you can not inherit from that class



         */