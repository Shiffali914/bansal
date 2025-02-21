package feb4.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {

            List<Employee> list=new ArrayList<>();
            list.add(new Employee("shiffali",30));
            list.add(new Employee("Harsh",24));
            list.add(new Employee("Aman",35));
            list.add(new Employee("Gagan",31));
            list.add(new Employee("Kusam",42));

        Collections.sort(list);         //compare by according to the age
        for(Employee emp:list){
            System.out.println(emp.getName()+":"+emp.getAge());
        }



    }

}
