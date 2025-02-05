package jan18.Aggregation;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Address adr=new Address("35 Upper canada court","Georgetown","Canada","L7G0L1");
        Address adr1=new Address("105","Brampton","Canada","L3P0L1");
        Address adr2=new Address("37 Upper canada court","Georgetown","Canada","L7G0L1");

        Employee emp1=new Employee(101,"shiffali","Shiffalibansal914@gmail.com",120000.,adr);   //aggregation when object of one class contain the object of the another class.
        Employee emp2=new Employee(102,"Aman","Aman@gmail.com",10000.0,adr1);
        Employee emp3=new Employee(103,"Gagan","Gaganfdk@gmail.com",20000.0,adr2);


        System.out.println("Enter the city which you want to search");
        String city=sc.nextLine();

        Employee[] employees=new Employee[3];
        employees[0]=emp1;
        employees[1]=emp2;
        employees[2]=emp3;

       // int count=0;
        for(Employee employee:employees){
            if(employee.getAddress().getCity().equalsIgnoreCase(city)){
               // count++;
                System.out.println(employee);
            }
        }
        //System.out.println(count);
    }
}
