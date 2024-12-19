package dec142024.constr;

public class Book {

    String title;
    String author;
    double price;

    //constructor overloading
   /*public Book()
    {
    }
*/
    public Book(String title) {
        this.title = title;

    }

    public Book(String title,String author) {
        this.title = title;
       this.author = author;

    }

    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;

    }
    public void DisplayDetails(String title,String author,double price) {
        //System.out.println("Title"+" " +title+" "+"Author"+author+" "+"Price"+price);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);


    }

}











/* Constructor-------> which initializes the object
1 it has the same name as the class name
2 it does not have a return type,not even void
3 looks similar to method

rules
1. default const is present for all the classes by default
2. if there is a parameterized constr, jvm will not create a default constr
3. if we need a default constr then you have to create in case of presence of parameter constructor


types of constructor
a default constructor  - no parameter
b parameter constructor - have parameter

compiler
student.java-----> Student.class[byte code] //JVM //byte code is machine independent
Step 1
javac Student.java

Step 2 run the code
java student

*/