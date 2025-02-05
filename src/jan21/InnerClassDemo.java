package jan21;


 class OuterClass {
    int x=10;

    public void OuterClassMethod(){
        System.out.println("OUter Class X print" +x);
    }

    //Member inner class
     class InnerClass{
        int y=20;
        public void InnerClassMethod(){
            //System.out.println("INner class X print"+x);
            System.out.println("Outer Class Y print"+y);
        }
    }
    }
public class InnerClassDemo{
    public static void main(String[] args) {
        // create object of outer class
        OuterClass outer= new OuterClass();
        outer.OuterClassMethod();

        //create of inner class with outer class object reference
        OuterClass.InnerClass in=outer.new InnerClass();
        in.InnerClassMethod();
    }
}

