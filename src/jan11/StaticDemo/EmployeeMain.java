package jan11.StaticDemo;

public class EmployeeMain {
    public static void main(String[] args) {

        Employee employee1 =new Employee(101,"shiffali",10000.0,"Software Developer");
        Employee employee2=new Employee(102,"Paramjeet",20000.0,"Senior Manager");
        Employee employee3=new Employee(103,"Aman",30000.0,"Principle Engineer");
        employee1.printemployee();
        System.out.println();
        employee2.printemployee();
        System.out.println();
        employee3.printemployee();
    }
}
