package assignment2;

public class Student extends Person{
    private int StudentId;
   private String course;
   private double gpa;

    public Student(String name, int age, int studentId, String course, double gpa) {
        super(name, age);
        StudentId = studentId;
        this.course = course;
        this.gpa = gpa;
    }

    public int getStudentId() {
        return StudentId;
    }

    public String getCourse() {
        return course;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public void displayinfo() {
        System.out.println("Name "+getName());
        System.out.println("Age "+getAge());
        System.out.println("Id "+getStudentId());
        System.out.println("Course "+getCourse());
        System.out.println("GPA "+getGpa());
    }
}
