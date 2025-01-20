package jan18.Aggregation;

public class Main {
    public static void main(String[] args) {
        Name name = new Name("Rattan", "Kumar", "Bansal");
        Student student = new Student(name, "rattankumar@gmail.com", "9417066537");

        String lastname=student.getName().getMiddlename();
        System.out.println(lastname);

        String string1 = student.toString();
        System.out.println(string1);


    }

}
