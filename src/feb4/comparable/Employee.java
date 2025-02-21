package feb4.comparable;

public class Employee implements Comparable<Employee> {

    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

   /* @Override         // this method is used if we want to compare the integer value using comparable interface
    public int compareTo(Employee o) {
        return this.getAge()-o.getAge() ;
    }*/

    @Override
    public int compareTo(Employee o) {
        return this.name.compareTo(o.name); // this method is used if we want to compare the string value then compare to method is used.
    }
}
