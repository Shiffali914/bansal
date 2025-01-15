package jan11.StaticDemo;

public class Employee {
                    int id;
                    String name;
                    double salary;
                    String designation;

                    //use of static in variable case
                   static String companyName="Microsoft";

    public Employee(int id, String name, double salary, String designation) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.designation = designation;
        //this.companyName = companyName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", designation='" + designation + '\'' +
                ", companyName='" + companyName + '\'' +
                '}';
    }

    public void printemployee()
    {
        System.out.println(id);
        System.out.println(name);
        System.out.println(salary);
        System.out.println(designation);
        System.out.println(companyName);
    }
}



