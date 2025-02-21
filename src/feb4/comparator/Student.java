package feb4.comparator;

public class Student {

    private int age;
    private String name;
    private String grade;

    public Student(int age, String name,String grade) {
        this.age = age;
        this.name = name;
        this.grade=grade;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", grade='" + grade + '\'' +
                '}';
    }
}
