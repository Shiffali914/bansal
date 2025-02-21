package feb11;

import java.util.Objects;

public final class Employee {
    private final int empId;
    private final String FName;
    private final String LName;
    private final Address address;

    public Employee(int empId, String FName, String LName, Address address) {
        this.empId = empId;
        this.FName = FName;
        this.LName = LName;
       // this.address=address;

        Address adr1=new Address(address.getAddrline1(), address.getAddrline2(), address.getCity(),address.getPostalcode());
        this.address=adr1;
    }

    public int getEmpId() {
        return empId;
    }

    public String getFName() {
        return FName;
    }

    public String getLName() {
        return LName;
    }

    public Address getAddress() {
       return address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", FName='" + FName + '\'' +
                ", LName='" + LName + '\'' +
                ", address=" + address +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return empId == employee.empId && Objects.equals(FName, employee.FName) && Objects.equals(LName, employee.LName) && Objects.equals(address, employee.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(empId, FName, LName, address);
    }
}
