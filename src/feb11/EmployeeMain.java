package feb11;


import java.util.HashMap;
import java.util.Map;

public class EmployeeMain {
    public static void main(String[] args) {

        Map<Employee,Double>EmpSalary=new HashMap<>();

        Address adr1=new Address("43","Woodland Street","Brampton","L6P0A2");
        Address adr2=new Address("36","upper cananda ","tornoto","L6P05");

        Employee emp1=new Employee(101,"John","Mathew",adr1);
        Employee emp2=new Employee(102,"Alice","Manual",adr2);



        EmpSalary.put(emp1,20000.0);
        EmpSalary.put(emp2,40000.0);



        System.out.println(emp1.hashCode());
        System.out.println(EmpSalary.get(emp1));
        System.out.println(adr1);
       // System.out.println(EmpSalary);

        adr1.setCity("Mississagua");
        System.out.println(emp1.hashCode());
        System.out.println(EmpSalary.get(emp1));
        System.out.println(EmpSalary);

    }
}
