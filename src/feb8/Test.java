package feb8;

interface Greeting{
    void greet(String name);
}

public class Test {
    public static void main(String[] args) {


        Greeting greeting=greetname-> {
            System.out.println("hey"+" "+greetname);
        };
        greeting.greet("shiffali");
    }
}
