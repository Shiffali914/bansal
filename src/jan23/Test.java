package jan23;

public class Test {
    public static void main(String[] args) {
        int x;
        try {
            x = 10 / 0;
            System.out.println(x);
        } /*catch (ArithmeticException e)
        {
            e.printStackTrace();
        } */catch (Exception e)
        {
            e.printStackTrace();
        }

        System.out.println("hello");
    }
}