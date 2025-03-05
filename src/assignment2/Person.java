package assignment2;

public class Person {
   private String name;
   private int age;

    //create parameterized constructor


    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void displayinfo()
    {
        System.out.println("Name "+getName());
        System.out.println("Age "+getAge());
    }

    public final String getType(){
        return "Person";
}

}
