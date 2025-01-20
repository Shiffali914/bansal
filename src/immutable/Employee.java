package immutable;

final public class Employee {
     private final int id;
     private  final String name;
     private final  Address address;                //address is reference means address is another class of object which is mutable class

    //parameterized constructor

    public Employee(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        //this.address=address;

       Address adr1=new Address(address.getCity());

        /*The address field is mutable,but we make a deep
        copy of it in the constructor. It means that if the address object is modified outside
        the employee class, the copy of the address object inside the employee class is not changed.
         */
        this.address = adr1;

    }

    //only getter method is used no setter method is used.

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    // use to string method


    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}