package assignment2;

public class Professor extends Person{
    private String employeeId;
   private String department;
   private double salary;

    public Professor(String name, int age, String employeeId, String department, double salary) {
        super(name, age);
        this.employeeId = employeeId;
        this.department = department;
        this.salary = salary;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public void displayinfo() {
        System.out.println("Name "+getName());
        System.out.println("Age "+getAge());
        System.out.println("Employeeid "+getEmployeeId());
        System.out.println("Department "+getDepartment());
        System.out.println("Salary "+getSalary());
    }
}
