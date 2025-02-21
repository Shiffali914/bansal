package immutable;

public class AppStart {
    public static void main(String[] args) {
        Address1 adr=new Address1("Banglore");
        Employee1 employee=new Employee1(101,"Aman",adr);
        System.out.println(employee);

        //change the address
        adr.setCity("Hyderabad");
        System.out.println(adr);

        //the employee still remain same
        System.out.println(employee);
    }
}
