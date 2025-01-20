package jan18.Aggregation;

public class Test {
    public static void main(String[] args) {
        Address adr=new Address("35 Upper canada court","Georgetown","Canada","L7G0L1");

        Employee employee=new Employee(101,"shiffali","Shiffalibansal914@gmail.com",120000.,adr);   //aggregation when object of one class contain the object of the another class.

        String city = employee.getAddress().getPostalcode();
        System.out.println(employee);
        System.out.println(city);

    }
}
