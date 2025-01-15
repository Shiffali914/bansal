package immutable;

public class AppStart {
    public static void main(String[] args) {
        Address adr=new Address("Banglore");
        Employee employee=new Employee(101,"Aman",adr);
        System.out.println(employee);

        //change the address
        adr.setCity("Hyderabad");
        System.out.println(adr);

        //the employee still remain same
        System.out.println(employee);
    }
}
