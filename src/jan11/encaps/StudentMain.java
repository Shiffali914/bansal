package jan11.encaps;

public class StudentMain {
    public static void main(String[] args) {


        Student student = new Student(101, "shiffali", "java");
        System.out.println("Student before update  " +student);

        //student.name="Aman"; //it cannot update the name because string name has private access modifier which cannot be accessed outside the class.
        student.setName("Aman");
        System.out.println("Student after update  " +student);

    }
}