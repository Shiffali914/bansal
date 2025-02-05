package jan28.CustomList;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDemo {
    public static void main(String[] args) {

        List<Employee> emp=new ArrayList<>();

        emp.add(new Employee(101,"shiffali","shiffalibansal914@gmail.com",30));
        emp.add(new Employee(102,"aman","amansharma@gmail.com",34));
        emp.add(new Employee(103,"gagan","sunnyfdk.chaudhary@gmail.com",60));
        emp.add(new Employee(104,"heena","hennathakur@gmail.com",90));

        System.out.println(emp);

        for(Employee employee:emp) {
            if (employee.getAge() > 50) {
                System.out.println(employee.getName());
            }
        }

    }
}
