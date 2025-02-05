package jan21.anonymous;

public class Main {
    public static void main(String[] args) {
        Restaurant restaurant=new Restaurant() {
            @Override
            public void cook() {
                System.out.println("Chef Cook Food");
            }
        };
        restaurant.cook();
    }
}
