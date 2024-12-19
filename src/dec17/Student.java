package dec17;

public class Student {
    String name;
    int age;
    String course;
    String grade;

    public Student(String name) {
        this("jyoti",30,"java");
        System.out.println("Go to the constructor 2");
        this.name = name;
    }
    public Student(String name, int age) {
       this("Shiffali");            //calling constructor by using this() function
        System.out.println("Go to the constructor 1");
        this.name = name;
        this.age = age;
    }
    public Student(String name, int age, String course) {
        System.out.println("hello i am constructor 3");
        this.name = name;
        this.age = age;
        this.course = course;
        /*System.out.println(name);
        System.out.println(age);
        System.out.println(course);*/
    }
    public Student(String name, int age, String course, String grade) {
       this("Shiffali",30);
        this.name = name;
        this.age = age;
        this.course = course;
        this.grade = grade;

    }
}
